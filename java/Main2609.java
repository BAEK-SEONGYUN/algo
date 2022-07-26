import java.io.*;
import java.util.StringTokenizer;

public class Main2609 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static int gcf(int a, int b){
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

        return a;
    }

    static int lcm(int a, int b, int n){

        return a*b/n;
    }

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcf = gcf(a,b);
        int lcm = lcm(a,b,gcf);
        System.out.println(gcf + "\n" + lcm);
    }
}
