import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // stacks works as LIFO ( Last In First Out)
        Stack<Integer> stack = new Stack<>();
        // add elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack); //[1, 2, 3, 4]
        stack.pop();
        System.out.println(stack); // [1, 2, 3]

        // check if the stack is empty or not
        boolean isEmpty=stack.isEmpty();
        System.out.println(isEmpty);// false
        // get the last or top element of the stack
        int top= stack.peek();
        System.out.println(top); //3
        System.out.println(stack.lastElement()); //3
        // to clear the stack you can use clear method
        stack.clear();
        System.out.println(stack); //[]
    }
}