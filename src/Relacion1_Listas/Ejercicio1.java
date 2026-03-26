package Relacion1_Listas;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 10; i <= 100; i+=10) {
            numeros.add(i);
        }

        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.println(numeros.get(i));
        }
    }
}
