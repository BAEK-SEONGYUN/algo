import java.util.*;
import java.io.*;

public class Main9093 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Object> stack = new Stack<>();
        

        String str;
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            str = br.readLine();
            str += " ";

            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                }
                else{
                    stack.push(str.charAt(j));
                }
            }
            sb.append("\n");
            System.out.print(sb.toString());
        }
        
    }
}
