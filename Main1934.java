import java.io.*;
import java.util.*;


public class Main1934 {
   

    static int gcd(int a, int b){
        int tmp;
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

        return a;       //gcd
    }


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(br.readLine());
        

        for (int i = 0; i < n; i++) {
                       
        }


    }
}
