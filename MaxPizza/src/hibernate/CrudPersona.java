package hibernate;

import java.util.ArrayList;
import maxpizza.modelo.Persona;
import org.hibernate.Session;
import org.hibernate.Transaction;
import validacion.Utilidades;

public class CrudPersona implements CrudGenerico<Persona, String> {

    @Override
    public ArrayList<Persona> getAll(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona buscar(String id) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        Persona persona = (Persona) sesion.get(Persona.class, id);
        trans.commit();
        sesion.close();

        return persona;
    }

    @Override
    public boolean alta(Persona t) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        if (buscar(t.getUsuario()) == null) {
            sesion.save(t);
            trans.commit();

            Utilidades.mensaje("Registrado con exito");
            sesion.close();
            return true;
        }
        Utilidades.mensaje("Cliente ya existe");

        sesion.close();
        return false;
    }

    @Override
    public void baja(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Persona t) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sesion.beginTransaction();
        sesion.update(t);
        trans.commit();
        sesion.close();
    }

    @Override
    public Persona ultimoValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
