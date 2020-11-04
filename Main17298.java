import java.util.*;
import java.io.*;
public class Main17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> sol = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        String[] str = br.readLine().split(" ");

        for (int i = str.length-1; i >= 0; i--) {
            num[i] = Integer.parseInt(str[i]);
        }

        for (int i = n-1; i >= 0; i--) {
            
            while(!stack.isEmpty() && num[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                sol.push(-1);  
            }
            else{
                sol.push(stack.peek());
            }
            stack.push(num[i]);
        }
       
        while(!sol.isEmpty()){
            sb.append(sol.pop() + " ");
        }
        System.out.print(sb.toString());
    }   
}
