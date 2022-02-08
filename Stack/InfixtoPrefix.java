import java.util.Scanner;
import java.util.Stack;

public class InfixtoPrefix {
    
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

    StringBuilder infixPreFix(String expression){

        StringBuilder result = new StringBuilder();
        StringBuilder input = new StringBuilder(expression);
        input.reverse();
        Stack<Character> stack = new Stack<Character>();
        char [] charsExp = new String(input).toCharArray();

        for (int i = 0; i < charsExp.length; i++){

            if (charsExp[i] == '(') {
                charsExp[i] = ')';
                i++;
            }
            else if (charsExp[i] == ')') {
                charsExp[i] = '(';
                i++;
            }
        }

        for (int i = 0; i <charsExp.length ; i++){
            char c = charsExp[i];

            if(Prec(c)>0){
                while(stack.isEmpty()==false && Prec(stack.peek())>=Prec(c)){
                    result.append(stack.pop());
                }
                stack.push(c);
            }

            else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    result.append(x);
                    x = stack.pop();
                }
            }

            else if(c=='('){
                stack.push(c);
            }

            else{
                result.append(c);
            }
        }

        for (int i = 0; i <=stack.size() ; i++){
            result.append(stack.pop());
        }

        return result.reverse();
    }

    public static void main(String args[]){
        InfixtoPrefix obj = new InfixtoPrefix();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String s = sc.nextLine();
        StringBuilder res = obj.infixPreFix(s);
        System.out.println("The prefix of the given expression is: "+ res);
        sc.close();
    }
}
