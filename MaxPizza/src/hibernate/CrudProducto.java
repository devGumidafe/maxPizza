package hibernate;

import java.util.ArrayList;
import maxpizza.modelo.Producto;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CrudProducto implements CrudGenerico<Producto, Integer> {

    @Override
    public ArrayList<Producto> getAll(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto buscar(Integer id) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        Producto producto = (Producto) sesion.get(Producto.class, id);
        trans.commit();
        sesion.close();

        return producto;
    }

    @Override
    public boolean alta(Producto t) {
        return false;
    }

    @Override
    public void baja(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto ultimoValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
