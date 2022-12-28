import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox= new Box<>();
        stringBox.setItem("Yellow box");
        System.out.println(stringBox.getItem());
        Box <Integer> integerBox=new Box<>();
        integerBox.setItem(1);
        System.out.println(integerBox.getItem()); //1

        ArrayList<Integer> myNum= new ArrayList<>(10);
        for(int i=0; i<10;i++){
            myNum.add(i);
        }

        System.out.println(getMiddleArrayListElement(myNum));

        String [] myCars={"BMW","MAZDA","KIA","FORD","TOYOTA","NISSAN"};

        System.out.println(Main.<String>getMiddleEelementOfArray(myCars));

    }
    public static <T> T getMiddleArrayListElement(ArrayList<T> array){
        return array.get(array.size() / 2);
    }

    public static <T> T getMiddleEelementOfArray(T [] array){
        return array[array.length/2];
    }
}