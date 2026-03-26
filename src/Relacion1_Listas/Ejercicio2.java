package Relacion1_Listas;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int suma = 0;

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(21);
            numeros.add(numero);
        }

        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        System.out.println(suma);
    }
}
