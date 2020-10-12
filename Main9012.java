import java.util.*;
import java.io.*;

public class Main9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            boolean flag = true;
            Stack<Object> stack = new Stack<>();
            String str = br.readLine();
            //StringBuilder st = new StringBuilder("");
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                }
                else if(str.charAt(j) == ')'){
                    
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()){
                flag = false;
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        //System.out.print();
    }
}
