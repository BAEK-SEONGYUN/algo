import java.util.*;
class deaue {
    
    public static void main(String[] args) throws InterruptedException {
      
        System.out.println("Stack!!");
        Deque<String> stack = new ArrayDeque<>();
        stack.addFirst("Element1");
        stack.addFirst("Element2");
        stack.addFirst("Element3");
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
      
        System.out.println("Queue!!");
        Deque<String> queue = new ArrayDeque<>();
        queue.addFirst("Element1");
        queue.addFirst("Element2");
        queue.addFirst("Element3");
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
    }
}