package hibernate;

import java.util.ArrayList;
import maxpizza.modelo.Detallepedido;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CrudDetallePedido implements CrudGenerico<Detallepedido, Integer> {

    @Override
    public ArrayList<Detallepedido> getAll(Integer id) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        Query query = sesion.createQuery("FROM Detallepedido WHERE idPedido=:id ORDER BY precioTotal");
        query.setParameter("id", id);
        ArrayList<Detallepedido> detallePedido = (ArrayList<Detallepedido>) query.list();
        trans.commit();
        sesion.close();

        return detallePedido;
    }

    @Override
    public Detallepedido buscar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alta(Detallepedido t) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        sesion.save(t);
        trans.commit();

        sesion.close();
        return true;
    }

    @Override
    public void baja(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Detallepedido t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallepedido ultimoValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
