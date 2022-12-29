import java.util.ArrayList;
public class Main {
    public static int x; // this is a global variable outside the class
    public static void main(String[] args) {
        System.out.println(calcRecArea(10,10));
        x = 10;
        System.out.println(x);
    }
    public static int calcRecArea(int length, int width){
        int area = length*width;
        x = 100; // this is a global variable;
        return area;
    }
    // this is the method overloading
    static int calcRecArea(int sideLength){
        int area= sideLength/2;
        // area is a local variable in java scope
        return area;
    }
}

