import java.io.*;
import java.util.StringTokenizer;

public class Main1929 {

    static void find_primeNumber(int target, int start){
        boolean[] arr = new boolean[target+1];

        arr[0] = true;
        arr[1] = true;

        for(int i=2;i<=target;i++) {
            if(arr[i]) continue;
    
            for(int j=2*i;j<=target; j+=i) {
                arr[j] = true;
            }
        }
        for (int i = start; i < arr.length; i++) {
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        find_primeNumber(n, m);
    }
}
