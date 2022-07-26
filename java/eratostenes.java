import java.io.*;


public class eratostenes {
    
    static void find_primeNumber(int target){
        boolean[] arr = new boolean[target+1];

        arr[0] = true;
        arr[1] = false;

        for(int i=2;i<=target;i++) {
            if(arr[i]) continue;
    
            for(int j=2*i;j<=target; j+=i) {
                arr[j] = true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]){
                System.out.println(i + " 는 소수");
            }
        }

    }


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

        int n = Integer.parseInt(br.readLine());

        find_primeNumber(n);

    }
}
