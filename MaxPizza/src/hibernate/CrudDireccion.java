package hibernate;

import java.util.ArrayList;
import maxpizza.modelo.Direccion;
import org.hibernate.Session;
import org.hibernate.Transaction;
import validacion.Utilidades;

public class CrudDireccion implements CrudGenerico<Direccion, Integer> {

    @Override
    public ArrayList<Direccion> getAll(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Direccion buscar(Integer id) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        Direccion direccion = (Direccion) sesion.get(Direccion.class, id);
        trans.commit();
        sesion.close();

        return direccion;
    }

    @Override
    public boolean alta(Direccion t) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        sesion.save(t);
        trans.commit();
        Utilidades.mensaje("Guardado con exito");
        sesion.close();

        return true;
    }

    @Override
    public void baja(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Direccion t) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        sesion.update(t);
        trans.commit();
        Utilidades.mensaje("Modificado con exito");
        sesion.close();
    }

    @Override
    public Direccion ultimoValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
