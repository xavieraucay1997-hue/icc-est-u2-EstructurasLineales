package utils;

import java.util.Stack; // CORREGIDO: Eliminados ArrayDeque y Queue

public class QueuePalindrome {
     public boolean isPalindrome(String text) {
        String limpio = text.toLowerCase().replace(" ", "");
        Stack<Character> pilaEntradaCola = new Stack<>();
        Stack<Character> pilaSalidaCola = new Stack<>();
        Stack<Character> pilaInversa = new Stack<>();

        for (int i = 0; i < limpio.length(); i++) {
            char letra = limpio.charAt(i);
            pilaEntradaCola.push(letra); 
            pilaInversa.push(letra);    
        }
        for (int i = 0; i < limpio.length(); i++) {
            if (pilaSalidaCola.isEmpty()) {
                while (!pilaEntradaCola.isEmpty()) {
                    pilaSalidaCola.push(pilaEntradaCola.pop());
                }
            }
            char inicio = pilaSalidaCola.pop();
            char fin = pilaInversa.pop();
            if (inicio != fin) {
                return false;
            }
        }
        return true;
    }
}
