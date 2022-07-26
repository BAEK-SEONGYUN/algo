import java.io.*;
import java.util.*;

public class Main1158 {
    
    public static void main(String[] args) throws IOException{
        Queue<Object> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            queue.offer(i+1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if( j == k){
                    if(i == n-1){
                        sb.append(queue.poll());
                        sb.append(">");
                    }else{
                        sb.append(queue.poll());
                        sb.append(", ");
                    }
                }
                
                else{
                    queue.offer(queue.poll());
                }
            }
        }


       System.out.println(sb.toString());

    }
}
