import java.io.*;

public class Main10808 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] array = new char[str.length()];
        int[] cnt = new int[26];
        
        array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            cnt[(int)array[i] - 97] += 1;
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.print(cnt[i] + " ");
        }
        


    }
}
