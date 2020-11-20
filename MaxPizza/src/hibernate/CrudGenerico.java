package hibernate;

import java.util.ArrayList;

public interface CrudGenerico<T, Id> {

    ArrayList<T> getAll(Id id);

    T buscar(Id id);

    boolean alta(T t);

    void baja(Id id);

    void editar(T t);

    T ultimoValor();

}
