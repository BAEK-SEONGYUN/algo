import java.util.*;
import java.io.*;

public class Main1918 {

    static int precedence(char ch){
        if(ch == '('){
            return 0;
        }
        if(ch == '+' || ch =='-'){
            return 1;
        }
        else return 2;
    }
    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();
        String ans = "";
        
        for(char ch: str.toCharArray()){
            if('A' <= ch && 'Z' >= ch){
                ans += ch;
            }
            else if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                while(!stack.isEmpty()){
                    char op = stack.pop();
                    if(op == '('){
                        break;
                    }
                    ans += op;
                }
            }
            else{
                while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)){
                    ans += stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        System.out.println(ans);
    }
}
