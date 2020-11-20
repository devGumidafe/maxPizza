package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import validacion.Utilidades;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (HibernateException ex) {

            Utilidades.mensaje("La sesión ha fallado" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public Session getSession() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
