import java.io.*;
import java.util.StringTokenizer;

/**
 * Main15652
 */
public class Main15652  {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static int[] list = new int[9];
    static int[] check = new int[9];
    static int n,m;

    static void dfs(int cnt) throws IOException{
        if(cnt == m){
            for (int i = 0; i < m; i++) {
                bw.write(list[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(cnt != 0 && list[cnt-1] > i){
                continue;
            }

            // check[i] = 1;
            list[cnt] = i;
            dfs(cnt+1);
            // check[i] = 0;
        }
    }

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());

       
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dfs(0);

        br.close();
        bw.flush();
        bw.close();
    }
}