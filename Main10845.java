import java.util.*;

public class Main10845 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int k=0; k<n; k++) {
            String line = sc.nextLine();
            String[] s = line.split(" ");
            String cmd = s[0];
            if (cmd.equals("push")) {
                int num = Integer.parseInt(s[1]);
                queue.offer(num);
            } else if (cmd.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peek());
                }
            } else if (cmd.equals("size")) {
                System.out.println(queue.size());
            } else if (cmd.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.poll());
                }
            } else if (cmd.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    // 구현할 수가 없음... Queue에 없음
                }
            }
        }
    }
}