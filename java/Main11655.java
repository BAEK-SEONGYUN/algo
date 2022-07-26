import java.io.*;

public class Main11655 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        
        String str = br.readLine();

        char[] array = new char[str.length()];

        array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            
            if(array[i] >= 'A' && array[i] <= 'Z'){
                if((int)array[i] + 13 >= 90){
                    
                    array[i] -= 13;
                }
                else{
                    array[i] += 13;
                }
            }
            else if(array[i] >= 'a' && array[i] <= 'z'){
                if((int)array[i] + 13 >= 122){
                    array[i] -= 13;
                }
                else{
                    array[i] += 13;
                }
            }
       }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
