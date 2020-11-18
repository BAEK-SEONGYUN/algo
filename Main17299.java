import java.util.*;
import java.io.*;

public class Main17299 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> sol = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] num = new int[n];
        int[] count = new int[1000001];

        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(str[i]);
            count[num[i]] += 1;
        }

        for (int i = n-1; i >= 0; i--) {
            while(!stack.isEmpty() && count[num[i]] >= count[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                sol.push(-1);   
            }
            else{
                sol.push(num[i]);
            }
            stack.push(num[i]);
        }

        while(!sol.isEmpty()){
            sb.append(sol.pop() + " ");
        }
        System.out.print(sb.toString());
    }
}
