import java.io.*;
import java.util.*;

public class Main10828 {
    public static void main(String[] args) throws IOException{ 

        Stack<Integer> stack = new Stack<Integer>(); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = st.nextToken();
            if(str.equals("push")){
                int num = Integer.parseInt(br.readLine());
                stack.push(num);
            }
            else if(str.equals("pop")){
                System.out.println(stack.isEmpty()? -1: stack.pop());
            }
            else if(str.equals("size")){
                System.out.println(stack.size());
            }
            else if(str.equals("empty")){
                System.out.println(stack.isEmpty()? 1: 0);
            }
            else if(str.equals("top")){
                System.out.println(stack.isEmpty()? -1: stack.peek());
            }
        }
        br.close();
    }
}
