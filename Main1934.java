import java.io.*;
import java.util.*;


public class Main1934 {
   

    static int sol(int a, int b){
        int tmp;
        int first = a;
        int second = b;
        if(a < b){
            tmp = b;
            b = a;
            a = tmp;
        }

        while(b != 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return first*second/a;       //gcd
    }


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        
        
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        

        int a, b;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            sb.append(sol(a,b));
            sb.append("\n");

        }

        System.out.println(sb.toString());

    }
}
