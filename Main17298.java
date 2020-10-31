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
        
        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }

        sb.append(-1);
        sb.append(" ");

       
    }   
}
