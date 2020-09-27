
//https://www.acmicpc.net/problem/15655
import java.io.*;
import java.util.*;

/**
 * Main15651
 */
public class Main15655 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static Scanner sc = new Scanner(System.in);
    static int[] list = new int[9];
    static int[] check = new int[9];
    static int n, m;
    static int[] num;

    static void dfs(int cnt, int idx) throws IOException {
        if (cnt == m) {
            for (int i = 0; i < m; i++) {
                bw.write(list[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = idx+1; i < n; i++) {
            if (check[i] == 1) {
                continue;
            }
            check[i] = 1;
            list[cnt] = num[i];
            dfs(cnt + 1, i);
            check[i] = 0;
        }

    }

    public static void main(String[] args) throws IOException {
        // n = sc.nextInt();
        // m = sc.nextInt();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        num = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        dfs(0, -1);

        br.close();
        bw.flush();
        bw.close();
    }
}