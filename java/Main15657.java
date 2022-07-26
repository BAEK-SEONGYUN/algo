import java.util.*;
import java.io.*;

public class Main15657 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static int[] check = new int[9];
    static int[] list = new int[9];
    static int[] num;

    static void dfs(int cnt) throws IOException{
        if(cnt == m){
            for (int i = 0; i < m; i++) {
                bw.write(list[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if(cnt != 0 && list[cnt-1] > num[i]){
                continue;
            }
            // check[i] = 1;
            list[cnt] = num[i];
            dfs(cnt+1);
            // check[i] = 0;
        }
    }

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        num = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        dfs(0);

        br.close();
        bw.flush();
        bw.close();
    }
}
