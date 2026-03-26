package Relacion2_Conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Vehiculo> parking = new TreeSet<>();

        Vehiculo v1 = new Vehiculo("1234DOF", "Maria");
        Vehiculo v2 = new Vehiculo("5678DEF", "Ana");
        Vehiculo v3 = new Vehiculo("1111AAA", "Luis");
        Vehiculo v4 = new Vehiculo("2222BBB", "Carmen");
        Vehiculo v5 = new Vehiculo("1234ABC", "Pedro");

        parking.add(v1);
        parking.add(v2);
        parking.add(v3);
        parking.add(v4);
        parking.add(v5);

        System.out.println("Vehículos en el parking:");
        for (Vehiculo v : parking) {
            System.out.println(v);
        }
    }
}
