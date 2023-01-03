import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Queue Explained branch***");
        // queue is a collection of entires that stored and retrieved according FIFO principle (First In Last Out)
        // means that the first element added will be also removed
        Queue<String> queue = new LinkedList<>();
        queue.add("George");
        queue.add("Jhon");
        queue.add("Ali");
        queue.add("Jim");
        System.out.println("The element of the queue is "+queue); //The element of the queue is [George, Jhon, Ali, Jim]
        queue.remove();
        System.out.println(queue);//[Jhon, Ali, Jim]
        System.out.println(queue.peek()); //Jhon
        System.out.println(queue.element()); //Jhon
        System.out.println(queue.add("Zaid"));
        System.out.println(queue); //[Jhon, Ali, Jim, Zaid]
        queue.remove();
        System.out.println(queue); //[Ali, Jim, Zaid]
    }
}