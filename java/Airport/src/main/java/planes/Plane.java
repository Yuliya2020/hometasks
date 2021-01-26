package planes;

import java.util.Objects;

abstract public class Plane {
    String model;
    private int maximumSpeed;
    private int maximumFlightDistance;
    private int maximumLoadCapacity;


    public Plane(String model, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity) {
        this.model = model;
        this.maximumSpeed = maximumSpeed;
        this.maximumFlightDistance = maximumFlightDistance;
        this.maximumLoadCapacity = maximumLoadCapacity;

    }

        public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public int getMaximumFlightDistance() {
        return maximumFlightDistance;
    }

    public int getMaximumLoadCapacity() {
        int result = this.maximumLoadCapacity;
        return result;


    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                ", maximumFlightDistance=" + maximumFlightDistance +
                ", maximumLoadCapacity=" + maximumLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return maximumSpeed == plane.maximumSpeed &&
                maximumFlightDistance == plane.maximumFlightDistance &&
                maximumLoadCapacity == plane.maximumLoadCapacity &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
    }
}
