import java.util.*;

import java.io.*;
public class Main1874 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Object> stack = new Stack<>();
        List<Object> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            stack.push(i);
            sb.append("+\n");

            while(!stack.isEmpty() && !list.isEmpty() && stack.peek().equals(list.get(0))){
                stack.pop();
                list.remove(0);
                sb.append("-\n");
            }
        }
        if(!stack.isEmpty()){
            sb.setLength(0);
            sb.append("NO\n");
        }
        System.out.print(sb.toString());
    }
}
