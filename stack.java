
import java.io.*;
import java.io.IOException;
import java.util.Stack;


public class stack {
    public static void main(String[] args) throws IOException{
        Stack<Object> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        System.out.println(stack.size());

        for (int i = 0; i < str.length(); i++) {
            
            sb.append(stack.pop());
        }


        System.out.println(stack.size());
        System.out.println(sb.toString());
        System.out.println(stack.isEmpty());
        // System.out.println(stack.peek());
        // System.out.println(stack.peek());
        // System.out.println(stack.peek());
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
    }
}
