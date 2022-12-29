import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        System.out.println(list); // [apple, banana, orange]
        list.addFirst("strawberry");
        list.removeLast();
        System.out.println(list); //[strawberry, apple, banana]
        list.addLast("blueberry");
        list.removeFirst();
        System.out.println(list);  // [apple, banana, blueberry]

        System.out.println(list.getFirst()); //apple
        System.out.println(list.getLast()); // blueberry
        System.out.println(list.get(0));//apple
        System.out.println(list.get(1)); //banana
        System.out.println(list.get(2));// blueberry
        System.out.println(list.set(1,"orange"));// [apple, orange, blueberry]
        boolean isThere= list.contains("banana"); //false
        list.remove(2); //[apple, orange]
        for(String s : list){
            System.out.println(s); // to loop through linked list
        }



    }

}

