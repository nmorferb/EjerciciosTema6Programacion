package Relacion3_Diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Diccionario Morse
        HashMap<Character, String> morse = new HashMap<>();

        morse.put('A', ".-");
        morse.put('B', "-...");
        morse.put('C', "-.-.");
        morse.put('D', "-..");
        morse.put('E', ".");
        morse.put('F', "-...");
        morse.put('G', "--.");
        morse.put('H', "....");
        morse.put('I', "..");
        morse.put('J', "-.--");
        morse.put('K', "-.-");
        morse.put('L', ".-..");
        morse.put('M', "--");
        morse.put('N', "-.");
        morse.put('Ñ', "--.--");
        morse.put('O', "---");
        morse.put('P', ".--.");
        morse.put('Q', "--.-");
        morse.put('R', ".-.");
        morse.put('S', "...");
        morse.put('T', "-");
        morse.put('U', "..-");
        morse.put('V', "...-");
        morse.put('W', "-.--");
        morse.put('X', "-..-");
        morse.put('Y', "--.-");
        morse.put('Z', "--..");

        morse.put('0', "----");
        morse.put('1', ".----");
        morse.put('2', "..---");
        morse.put('3', "...--");
        morse.put('4', "....-");
        morse.put('5', ".....");
        morse.put('6', "-....");
        morse.put('7', "--...");
        morse.put('8', "---..");
        morse.put('9', "----.");

        //Pedir texto
        System.out.println("Introduce un texto: ");
        String texto = sc.nextLine().toUpperCase();

        String resultado = "";

        //Recorrer texto
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == ' ') {
                resultado += " ";
            } else if (morse.containsKey(c)) {
                resultado += morse.get(c) + " ";
            }
        }

        System.out.println("Código Morse:");
        System.out.println(resultado);
    }
}

