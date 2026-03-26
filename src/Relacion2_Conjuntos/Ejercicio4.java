package Relacion2_Conjuntos;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio4 {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();
        Random rand = new Random();

        while (numeros.size() < 6) {
            int n = rand.nextInt(49) + 1;
            numeros.add(n);
        }

        System.out.println("Números de la primitiva: " + numeros);
    }
}
