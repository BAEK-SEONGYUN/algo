import java.io.*;
import java.util.StringTokenizer;

public class Main2798 {
    

    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sol = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length-2; i++) {
            if(arr[i] > m){
                continue;
            }
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i] + arr[j] > m){
                    continue;
                }
                for (int k = j+1; k < arr.length; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if(m == temp){
                        sol = temp;
                    }

                    if(sol < temp && temp < m){
                        sol = temp;
                    }
                }
            }
        }
        System.out.println(sol);
    }
}
