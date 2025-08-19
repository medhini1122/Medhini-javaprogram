import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        System.out.println("Initial queue: " + queue);
        String head = queue.poll();
        System.out.println("Removed from queue: " + head);
        String peek = queue.peek();
        System.out.println("Head of queue now: " + peek);
        System.out.println("Final queue: " + queue);
    }
}
