
import java.io.*;

public class Main10799 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int pipe = 0;
        int score = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                pipe++;
                score++;
                if(str.charAt(i+1) == ')'){
                    pipe--;
                    score--;
                    score += pipe;
                    i = i+1;
                }
            }
            else if(str.charAt(i) == ')'){
                pipe--;
            }
            //System.out.println(i +"번쨰 파이프 :  " + pipe + " score : " +score);
        }
        System.out.println(score);
    }
}
