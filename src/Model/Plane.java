package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Plane {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("piloto")
    private String pilot;
    @JsonProperty("capacidad_pasajeros")
    private Integer passengerCapacity;

    public Plane() {
    }

    public Plane(Integer id, String pilot, Integer passengerCapacity) {
        this.id = id;
        this.pilot = pilot;
        this.passengerCapacity = passengerCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "model.Plane{" +
                "id=" + id +
                ", pilot='" + pilot + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(pilot, plane.pilot);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pilot);
    }
}
