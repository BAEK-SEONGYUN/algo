import java.io.*;

public class Main10872 {
    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sol = 1;
        for (int i = 1; i <= n; i++) {
            sol *= i;
        }
        System.out.println(sol);
    }    
}
