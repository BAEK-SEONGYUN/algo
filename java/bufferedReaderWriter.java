import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// BufferedReader 와 BufferedWriter를 사용하기 위해 필요한 것들 
// 모두 java.io 패키지에 있는 걸 알 수 있다.
// 따라서 애초에 java.io.* 를 import하고 시작하길 권장한다. 
 
public class bufferedReaderWriter {
    
    public static void main(String[] args) throws IOException {
                                         // bufferedReader로 문자열을 입력 받으면 try~catch로 예외 처리를 해줘야 한다.
                                         // 그러나 입력받을 때마다 매번 예외처리하는 건 귀찮은 일..
                                         // 사용하는 메소드에 IOException을 throws해 예외처리를 위임하길 권장한다 
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = bufferedReader.readLine();
        // readLine 메소드는 String 값만 받을 수 있다.
        int i = Integer.parseInt(s);
        // 따라서 int 형으로 활용하고 싶다면 형변환이 필요하다
        bufferedReader.close();
        // reader를 사용후엔 스트림을 닫아주자!
        
        
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(i+"\n");
        // bufferedWriter 는 System.out.println 처럼 자동 개행 처리가 되지 않기 때문에 개행 처리를 따로 해줘야한다.
        // bufferedWriter.newLine(); 을 활용하면 개행처리가 가능하나 이건 "\n"에 비해 속도가 느리다고 하니
        // "\n" 을 활용해 개행처리를 하는 걸 권장한다. 또한 여기엔 하나의 장점이 더 있는데
        // bufferedWriter.write(i); 처럼 writer에 int를 넣으면 아스키 코드에 따른 char형 값이 출력된다.
        // 그러나 i와 개행 처리 문자열 "\n" 을 더하면 String 으로 자동 형변환 되기 때문에 
        // 저장되어 있는 int 값 그대로 출력이 가능하다. 여러모로 이 편이 좋다는 얘기 
        
        bufferedWriter.flush();
        // 다 사용했으면 남아있는 데이터를 모두 출력시키고
        bufferedWriter.close();
        // 스트림을 닫아주면 된다.
        
    }
 
}