import java.util.*;


import java.io.*;

public class Main17413 {
    public static void main(String[] args) throws IOException{
        //Deque<Object> deque = new LinkedList<>();
        Stack<Object> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        
        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) == '<'){
                if(!stack.isEmpty()){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                }
                int j = i;
                while(str.charAt(j) != '>'){
                    sb.append(str.charAt(j));
                    j++;
                }
                sb.append('>');
                i = j;
            }
            
            else if(str.charAt(i) == ' '){
                while(!stack.isEmpty()){
                   sb.append(stack.pop());
                }
                sb.append(' ');
            }
            else{
                stack.push(str.charAt(i));
            }
            System.out.println(i+"번쨰 : "+ sb.toString());
        }
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
        }
        System.out.print(sb.toString());
    }
}
