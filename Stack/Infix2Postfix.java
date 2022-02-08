import java.util.Scanner;
import java.util.Stack;

public class Infix2Postfix {
    
    int Prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    String infixPostfix(String exp){
        String result = "";

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0;i < exp.length();i++){
            char c = exp.charAt(i);
            
            if(Character.isLetterOrDigit(c)){
                result += c;
            }

            else if(c == '('){
                stack.push(c);
            }

            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result += stack.pop();
                }
                stack.pop();
            }

            else{
                while(!stack.isEmpty() && Prec(c) < Prec(stack.peek())){
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            if(stack.peek() == '('){
                return "Invalid Expression";
            }
            result += stack.pop();
        }

        return result;
    }

    public static void main(String args[]){
        Infix2Postfix obj = new Infix2Postfix();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String s = sc.nextLine();
        String res = obj.infixPostfix(s);
        System.out.println("The postfix of the given expression is: "+ res);
        sc.close();
    }
}
