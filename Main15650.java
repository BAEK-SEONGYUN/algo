import java.io.*;
import java.util.*;

/**
 * Main15649
 */
public class Main15650 {
    //static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Scanner sc = new Scanner(System.in);
    static int n, m;
    static int[] check = new int[9];
    static int[] list = new int[9];

    static void dfs(int cnt){
        if(cnt == m){
            for (int i = 0; i < m; i++) {
                System.out.print(list[i]+" ");
            }
            System.out.println("");
            return;
        }
        for (int i = 0; i < n; i++) {
            if(check[i] == 1){
            continue;
            }
            check[i] = 1;
            list[cnt] = i+1;
            dfs(cnt+1);
            check[i] = 0;
        }
    }
    public static void main(String[] args) throws IOException{
        
        // n = Integer.parseInt(br.readLine());
        // m = Integer.parseInt(br.readLine());

        n = sc.nextInt();
        m = sc.nextInt();

        dfs(0);
        
    }
}