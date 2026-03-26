package Relacion2_Conjuntos;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> numerosSet = new HashSet<>();
        LinkedHashSet<Integer> numerosHash = new LinkedHashSet<>();
        TreeSet<Integer> numerosTree = new TreeSet<>();

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(90) + 10;
            numerosSet.add(numero);
            numerosHash.add(numero);
            numerosTree.add(numero);
        }

        System.out.println("HashSet: " + numerosSet);
        System.out.println("LinkedHasSet: " + numerosHash);
        System.out.println("TreeSet: " + numerosTree);
    }
}
