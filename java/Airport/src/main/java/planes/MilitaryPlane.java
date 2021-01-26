package planes;

import models.MilitaryType;
import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType type;


    public MilitaryPlane(String model, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity, MilitaryType type) {
        super(model, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
        this.type = type;


    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
