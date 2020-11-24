import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class Main10809 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        
        String str = br.readLine();
        
        char[] array;
        int[] loc = new int[26];
        for (int i = 0; i < loc.length; i++) {
            loc[i] = -1;
        }
        
        array = str.toCharArray();


        for (int i = 0; i < array.length; i++) {
            if(loc[(int)array[i] - 97] == -1){
                loc[(int)array[i] - 97] = i;
            }
        }

        for (int i = 0; i < loc.length; i++) {
            System.out.print(loc[i] + " ");
        }

    }
}
