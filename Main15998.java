import java.util.*;
import java.io.*;

public class Main15998 {
    
    static long gcd(long a, long b){
        while(b > 0){
            long temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        long n = Long.parseLong(br.readLine());
        long balance = 0;
        long minB = (long) 10e18;

        boolean valid = true;
        long M = 0;

        for (long i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            if(balance + a < 0){
                long temp = b - a - balance;
                if(b != 0 && b < minB){
                    minB = b;
                }
                if(M == 0){
                    M = temp;
                }
                else{
                    M = gcd(M, temp);
                }
                if(M <= minB && minB != (long)10e18){
                    valid = false;
                    break;
                }
            }
            else{
                if(balance + a != b){
                    valid = false;
                    break;
                }
            }
            balance = b;
        }

        if( valid && M != 0){
            System.out.println(M);
        }
        else if( valid && M == 0){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }

    }
}
