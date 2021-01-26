import planes.ExperimentalPlane;
import models.MilitaryType;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.*;

/* version: 1.1
made by Vitali Shulha
4-Jan-2019 */

public class Airport {
    private List<? extends Plane> planes;



    public List<PassengerPlane> getPassengerPlane() {
        List<? extends Plane> listOfPlanes = this.planes;
        List<PassengerPlane> passengerPlane = new ArrayList<>();
        for (Plane plane : listOfPlanes) {if (plane instanceof PassengerPlane) {passengerPlane.add((PassengerPlane) plane);}}
        return passengerPlane;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
            else {

            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaximumPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaximumPassengersCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaximumPassengersCapacity.getPassengersCapacity()) {
                planeWithMaximumPassengersCapacity = passengerPlanes.get(i);
            }
        }
        return planeWithMaximumPassengersCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (int i = 0; i < militaryPlanes.size(); i++) {
    MilitaryPlane plane = militaryPlanes.get(i);
    if (plane.getType() == MilitaryType.TRANSPORT) {
    transportMilitaryPlanes.add(plane);
    }
    }
    return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaximumDistance() {
        Collections.sort(planes, (Comparator<Plane>) ( o1, o2 ) -> o1.getMaximumFlightDistance() - o2.getMaximumFlightDistance());
        return this;
    }



    public Airport sortByMaximumSpeed() {
        Collections.sort(planes, (Comparator<Plane>) ( o1, o2 ) -> o1.getMaximumSpeed() - o2.getMaximumSpeed());
        return this;
    }

    public Airport sortByMaximumLoadCapacity() {
        Collections.sort(planes, (Comparator<Plane>) ( o1, o2 ) -> o1.getMaximumLoadCapacity() - o2.getMaximumLoadCapacity());
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "planes=" + planes.toString() +
                '}';
    }


    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

}
