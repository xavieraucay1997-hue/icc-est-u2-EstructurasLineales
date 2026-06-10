package utils;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            if (c == '('){
                stack.push(')');


            }
            else if(c == '['){
                stack.push(']');
            }
            else if (c == '{'){
                stack.push('}');
            }
            else if (c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char esperado = stack.pop();
                if(c != esperado){
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
    
}
