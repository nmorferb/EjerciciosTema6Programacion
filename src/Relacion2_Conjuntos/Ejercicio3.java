package Relacion2_Conjuntos;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numeros = new HashSet<>();

        int n;
        do {
            System.out.print("Introduce un número (0 para terminar): ");
            n = sc.nextInt();
            if (n != 0) {
                numeros.add(n);
            }
        } while (n != 0);

        System.out.println("Cantidad de números distintos: " + numeros.size());
    }
}


