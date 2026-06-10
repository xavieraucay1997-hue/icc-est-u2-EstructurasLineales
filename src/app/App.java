package app;

import java.util.Stack;
import utils.SignValidator;
import utils.StackSorter;
import utils.QueuePalindrome;

public class App {

    public static void main(String[] args) {

        runSignValidator();
        runStackSorter();
        runQueuePalindrome();

    }

    private static void runSignValidator() {

        SignValidator signValidator = new SignValidator();

        String cadena1 = "{[()]}";
        String cadena2 = "{[(])}";

        System.out.println("Ejercicio 01: Validación de Signos");
        System.out.println(cadena1 + " = " + signValidator.isValid(cadena1));
        System.out.println(cadena2 + " = " + signValidator.isValid(cadena2));

    }
}    

    /*private static void runStackSorter() {

        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        StackSorter sorter = new StackSorter();

        System.out.println("\nEjercicio 02: Ordenar Stack");
        System.out.println("Stack original: " + stack);

        sorter.sortStack(stack);

        System.out.println("Stack ordenado: " + stack);
        System.out.println("Tope esperado: " + stack.peek());

    }

    private static void runQueuePalindrome() {

        QueuePalindrome queuePalindrome = new QueuePalindrome();

        System.out.println("\nEjercicio 03: Palíndromo usando Colas");

        System.out.println("ana -> " + queuePalindrome.isPalindrome("ana"));
        System.out.println("radar -> " + queuePalindrome.isPalindrome("radar"));
        System.out.println("java -> " + queuePalindrome.isPalindrome("java"));

    }
        
    \*
}

