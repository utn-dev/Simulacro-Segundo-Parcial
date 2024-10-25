package Model;

public class InsufficientCapacityException extends Exception {

    private Integer capacity;

    public InsufficientCapacityException(Integer capacity) {
        super("Capacidad insuficiente: " + capacity);
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }


}
