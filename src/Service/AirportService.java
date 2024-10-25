package Service;

import Model.Airport;
import Model.InsufficientCapacityException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirportService {
    private ObjectMapper mapper;

    public AirportService() {
        this.mapper = new ObjectMapper();

    }

    // Método para cargar los aeropuertos como una lista sin usar AirportList
    public List<Airport> loadAirports(String filePath) throws IOException {
        // Deserializar el JSON como un arreglo de Airport[]
        Airport[] airportsArray = mapper.readValue(new File(filePath), Airport[].class);

        // Convertir el arreglo a una lista
        return Arrays.asList(airportsArray);
    }


    // Filtrar Airports por capacidad
    public List<Airport> filterAirportsForCapacity(List<Airport> airports, Integer minCapacity) throws InsufficientCapacityException {
        List<Airport> airportsFilters = new ArrayList<>();
        Boolean flag = false;
        Integer capacityException = 0;
        for (Airport airport : airports) {
            if (airport.getCapacity() > minCapacity) {
                airportsFilters.add(airport);
            } else {
                flag = true;
                capacityException = airport.getCapacity();
            }
        }
        if (flag) {
            throw new InsufficientCapacityException(capacityException);
        }
        return airportsFilters;
    }


    // Guardar aeropuertos filtrados en un archivo JSON
    public void saveAirportsFilter(String filePath, List<Airport> airportsFilter) throws IOException {
        mapper.writeValue(new File(filePath), airportsFilter);
    }

    public void ShowAirports(List<Airport> airports) {
        for (Airport Airport : airports) {
            System.out.println(Airport);
        }
    }

}
