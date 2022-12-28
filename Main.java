import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<E> list = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("George");
        names.add("Ali");
        // to get the size of the list
        int size=names.size(); //3
        System.out.println(size);
        String name=names.get(0);
        System.out.println(name);//alice
        names.remove(0);
        System.out.println(names.size()); // 2
        ArrayList<Integer> myNum = new ArrayList<>(10);

        for (int i=0 ; i < 100 ; i++){
            // here we added new elements on the arrayList
            myNum.add(i);
        }

        for (int myNums: myNum){
            System.out.println(myNums);
        }
        // now lets find the size of the arraylist

        System.out.println(myNum.size()); //100
        myNum.remove(0); // remove one
        System.out.println(myNum.size()); // 99
        System.out.println(myNum.isEmpty());


    }
    public static void printPerson(Ninja p){
        System.out.println(p.masterName());
    }
}

/*
Yes, the basic concept of an ArrayList is that it is a resizable array of objects that you can use to store and manage a collection of items. Here are some additional things you might want to know about ArrayLists:

ArrayLists are generic, which means you can specify the type of elements they contain. For example, you might create an ArrayList of Strings, an ArrayList of integers, or an ArrayList of custom objects.

ArrayLists are part of the Java Collections Framework, which provides a set of interfaces and classes for storing and manipulating collections of objects. Other classes in the Collections Framework include lists, sets, queues, and maps.

ArrayLists are not the only type of list in Java. Other types of lists include LinkedLists, which are efficient for inserting and deleting elements at arbitrary positions in the list, and Vector lists, which are thread-safe but may have slower performance than ArrayLists.

ArrayLists have several methods that you can use to manipulate the elements in the list. Some examples include add, remove, get, set, clear, and isEmpty. You can find a full list of the methods available in the ArrayList class in the Java API documentation.

*/

