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
    public List<Airport> filterAirportsForCapacity(List<Airport> Airports, Integer minCapacity) throws InsufficientCapacityException {
        List<Airport> AirportsFilters = new ArrayList<>();
        for (Airport Airport : Airports) {
            if (Airport.getCapacity() > minCapacity) {
                AirportsFilters.add(Airport);
            } else {
                throw new InsufficientCapacityException(Airport.getCapacity());
            }
        }
        return AirportsFilters;
    }


    // Guardar aeropuertos filtrados en un archivo JSON
    public void saveAirportsFilter(String filePath, List<Airport> airportsFilter) throws IOException {
        mapper.writeValue(new File(filePath), airportsFilter);
    }

    public void ShowAirports(List<Airport> Airports) {
        for (Airport Airport : Airports) {
            System.out.println(Airport);
        }
    }

}
