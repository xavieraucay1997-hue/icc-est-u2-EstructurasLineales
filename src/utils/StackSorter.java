package utils;

import java.util.Stack;

public class StackSorter {
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> auxStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            int elementoActual = stack.pop();
            
 
            while (!auxStack.isEmpty() && auxStack.peek() > elementoActual) {
                stack.push(auxStack.pop());
            }
            auxStack.push(elementoActual);
        }
        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }
}
    