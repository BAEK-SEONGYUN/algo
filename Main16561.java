
import java.io.*;


public class Main16561 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        
        int n = Integer.parseInt(br.readLine())/3;

        System.out.println((n-1)*(n-2)/2);
    }
}


