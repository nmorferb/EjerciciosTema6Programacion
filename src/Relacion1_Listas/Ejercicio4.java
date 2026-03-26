package Relacion1_Listas;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(100);
            listaNumeros.add(numero);
        }

        System.out.println(listaNumeros);

        for (int i = 0; i < listaNumeros.size() / 2; i++) {
            int temp = listaNumeros.get(i);
            listaNumeros.set(i, listaNumeros.get(listaNumeros.size() - 1 - i));
            listaNumeros.set(listaNumeros.size() - 1 - i, temp);
        }

        System.out.println(listaNumeros);
    }
}
