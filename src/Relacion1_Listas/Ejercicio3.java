package Relacion1_Listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> conDuplicados = new ArrayList<>();
        HashSet<Integer> sinDuplicados = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(10);
            conDuplicados.add(numero);
            System.out.println(numero);
            sinDuplicados.add(numero);
        }
        System.out.print(conDuplicados);
        System.out.println();
        System.out.print(sinDuplicados);
    }
}
