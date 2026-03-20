package Relacion2;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Crear el conjunto
        Set<Integer> conjunto = new HashSet<>();

        //Introducir números del 10 al 100 de 10 en 10
        for (int i = 10; i <= 100; i += 10){
            conjunto.add(i);
        }

        //Mostrartodo el conjunto en una sola línea
        System.out.println("Contenido del conjunto (una sola llamada): ");
        System.out.println(conjunto);

        //Recorrer y mostrar uno a uno
        System.out.println("Contenido del conjunto elemento a elemento:");
        for (Integer num : conjunto){
            System.out.println(num);
        }
    }
}
