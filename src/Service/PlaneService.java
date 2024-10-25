package Service;

import Model.Airport;
import Model.GenericWarehouse;
import Model.Plane;
import Model.Tag;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlaneService {

    // Método para extraer pilotos y tags a un almacen genérico
    public GenericWarehouse<Object> getPilotsTags(List<Airport> airports) {
        GenericWarehouse<Object> warehouse = new GenericWarehouse<>();

        // Recorrer todos los aeropuertos
        for (Airport airport : airports) {
            // Agregar tags del aeropuerto
            for (String tag : airport.getTags()) {
                warehouse.add(new Tag(tag));  // Almacenar cada tag como un objeto Tag
            }

            // Agregar pilotos de los aviones (solo agregar al almacen)
            for (Plane plane : airport.getPlanes()) {
                warehouse.add(plane.getPilot());  // Almacenar solo el nombre del piloto
            }
        }
        return warehouse;
    }

    // Método para extraer solo los tags y eliminarlos de duplicados
    public Set<Tag> removeDuplicateTags(GenericWarehouse<Object> warehouse) {
        Set<Tag> tagsSet = new HashSet<>();

        // Iterar sobre los elementos almacenados
        for (Object item : warehouse.getList()) {
            if (item instanceof Tag) {
                tagsSet.add((Tag) item);  // Agregar solo los tags al HashSet
            }
        }

        return tagsSet;
    }

    // Mostrar los tags únicos
    public void showUniqueTags(Set<Tag> tagsUnicos) {
        System.out.println("Tags únicos:");
        for (Tag tag : tagsUnicos) {
            System.out.println(tag);
        }
    }

}
