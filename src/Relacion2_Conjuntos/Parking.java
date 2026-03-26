package Relacion2_Conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class Parking {
    private Set<Vehiculo> parking;

    public Parking() {
        parking = new TreeSet<>();
    }

    public void añadirVehiculo(Vehiculo v) {
        parking.add(v);
    }

    public void mostrarVehiculos() {
        for (Vehiculo v : parking) {
            System.out.println(v);
        }
    }
}
