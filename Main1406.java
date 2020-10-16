import java.io.*;
import java.util.*;

public class Main1406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Object> left = new Stack<>();
        Stack<Object> right = new Stack<>();
        
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < str.length(); i++) {
            left.push(str.substring(i, i+1));
        }

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if(command.charAt(0) == 'L'){
                if(!left.isEmpty()){
                    right.push(left.pop());
                }
            }
            else if(command.charAt(0) == 'D'){
                if(!right.isEmpty()){
                    left.push(right.pop());
                }
            }
            else if(command.charAt(0) == 'B'){
                if(!left.isEmpty()){
                left.pop();
                }
            }
            else if(command.charAt(0) == 'P'){
                left.push(command.charAt(2));
            }
        }
        while(!left.isEmpty()){
            right.push(left.pop());
        }

        while(!right.isEmpty()){
            System.out.print(right.pop());
        }

        br.close();
        left.clear();
        right.clear();
      
    }
}
