import java.io.*;
import java.util.StringTokenizer;


public class Main17087 {

    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a % b);
        }
    } 
    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] loc = new int[n];

        for (int i = 0; i < n; i++) {
            loc[i] = Integer.parseInt(st.nextToken());
            
            if(loc[i] > a){
                loc[i] -= a;
            }
            else{
                loc[i] = a- loc[i];
            }
        }

        int sol = loc[0];

        for (int i = 1; i < loc.length; i++) {
            sol = gcd(sol, loc[i]);
        }
        System.out.println(sol);
    }
}
