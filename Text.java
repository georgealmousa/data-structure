import java.util.ArrayList;

public class Text {


    public static void main(String[] args) {
        ArrayList <String> cars= new ArrayList<>(3);
        cars.add(0, "MAZDA " );
        cars.add(1,"BMW ");
        cars.add(2,"KIA ");

        System.out.println(concatinateString(cars));
    }

    public static String concatinateString(ArrayList<String> arr){
        String result="";
        for(int i =0 ; i< arr.size();i ++ ){
            result=result+arr.get(i);
        }
        return result;
    }
}
