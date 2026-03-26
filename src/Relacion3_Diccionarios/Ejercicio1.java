package Relacion3_Diccionarios;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> palabras = new TreeMap<>();
        String palabra;

        do {
            palabra = sc.next();

            if (!palabra.equals(".")) {
                if (palabras.containsKey(palabra)) {
                    palabras.put(palabra, palabras.get(palabra) + 1);
                } else {
                    palabras.put(palabra, 1);
                }
            }
        } while (!palabra.equals("."));

        for (String p : palabras.keySet()) {
            System.out.println(p + ": " + palabras.get(p));
        }
    }
}
