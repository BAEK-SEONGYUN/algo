import java.io.*;
import java.util.*;

public class Main11656 {
    

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String[] array = new String[str.length()];


        for (int i = 0; i < array.length; i++) {
            array[i] = str.substring(i, str.length());
        }

        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
