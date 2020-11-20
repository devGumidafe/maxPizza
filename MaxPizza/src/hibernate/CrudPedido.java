package hibernate;

import java.util.ArrayList;
import maxpizza.modelo.Pedido;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import validacion.Utilidades;

public class CrudPedido implements CrudGenerico<Pedido, String> {

    @Override
    public ArrayList<Pedido> getAll(String id) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        Query query = sesion.createQuery("FROM Pedido WHERE idCliente=:id ORDER BY fecha");
        query.setParameter("id", id);
        ArrayList<Pedido> pedidos = (ArrayList<Pedido>) query.list();
        trans.commit();
        sesion.close();

        return pedidos;
    }

    @Override
    public Pedido buscar(String id) {
        int idInt = Integer.parseInt(id);

        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        Pedido pedido = (Pedido) sesion.get(Pedido.class, idInt);
        trans.commit();
        sesion.close();

        return pedido;
    }

    @Override
    public boolean alta(Pedido t) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        sesion.save(t);
        trans.commit();
        Utilidades.mensaje("Pedido " + t.getIdPedido() + " realizado");

        sesion.close();
        return true;
    }

    @Override
    public void baja(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Pedido t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido ultimoValor() {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Query query = sesion.createQuery("from Pedido order by idPedido DESC");
        query.setMaxResults(1);
        Pedido pedido = (Pedido) query.uniqueResult();

        sesion.close();
        return pedido;
    }

}
