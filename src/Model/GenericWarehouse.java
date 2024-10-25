package Model;

import java.util.ArrayList;
import java.util.List;

public class GenericWarehouse<T> {
    private List<T> List = new ArrayList<>();


    // Método para agregar un elemento
    public void add(T item) {
        List.add(item);
    }

    // Método para eliminar un elemento
    public void remove(T item) {
        List.remove(item);
    }

    // Método para recuperar un elemento según la posición
    public T get(int index) {
        if (index >= 0 && index < List.size()) {
            return List.get(index);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de los límites.");
        }
    }

    // Método para obtener la List completa
    public List<T> getList() {
        return List;
    }

    public void showList() {
        for (T item : List) {
            System.out.println(item);
        }
    }


}
