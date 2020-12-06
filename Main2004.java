import java.io.*;
import java.util.StringTokenizer;

public class Main2004 {
    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(n/5 - m/5 - (n-m)/5 + 1);

    }    
}
