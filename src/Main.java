import Model.*;
import Service.AirportService;
import Service.PlaneService;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        AirportService airportService = new AirportService();
        PlaneService planeService = new PlaneService();
        String inputFilePath = "G6UyHYt7.json"; // JSON original
        String outputFilePath = "airports_filter.json"; // JSON con el filtro aplicado
        Integer minCapacity = 25;


        try {
            // Cargar los aeropuertos desde un archivo JSON
            List<Airport> airports = airportService.loadAirports(inputFilePath);

            // Mostrar los aeropuertos
            airportService.ShowAirports(airports);

            // Extraer pilotos y tags a un almacen genérico
            GenericWarehouse<Object> warehousePilotsTags = planeService.getPilotsTags(airports);

            // Mostrar los pilotos y tags
            warehousePilotsTags.showList();

            // Eliminar duplicados solo de los tags
            Set<Tag> tagsUnicos = planeService.removeDuplicateTags(warehousePilotsTags);

            // Mostrar los tags únicos
            planeService.showUniqueTags(tagsUnicos);


            // Filtrar aeropuertos por capacidad mínima
            List<Airport> airportsFilters = airportService.filterAirportsForCapacity(airports, minCapacity);

            // Mostrar los aeropuertos filtrados
            airportService.ShowAirports(airportsFilters);

            // Guardar los aeropuertos filtrados en un nuevo archivo JSON
            airportService.saveAirportsFilter(outputFilePath, airportsFilters);

            System.out.println("Aeropuertos filtrados guardados en: " + outputFilePath);
        } catch (InsufficientCapacityException e) {
            System.out.println("Error: Aeropuerto con capacidad insuficiente: " + e.getCapacity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}