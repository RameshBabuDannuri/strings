package date_05_06_2018;

import java.util.Stack;

public class BalancedParantheses {
    static boolean isPair(char c1, char c2){
        if (c1 == '(' && c2 == ')')
            return true;
        else if (c1 == '{' && c2 == '}')
            return true;
        else if (c1 == '[' && c2 == ']')
            return true;
        else
            return false;
    }
    static boolean areBalanced(char exp[]){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i<exp.length ;i++){
            if (exp[i] == '{' || exp[i] =='(' || exp[i]=='['){
                s.push(exp[i]);
            }
            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
            {
                if (s.isEmpty()){
                    return false;
                }
                else if (!isPair(s.pop() ,exp[i])){
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        char exp[] = {'{','(',')','}','[',']'};
        if (areBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

}
