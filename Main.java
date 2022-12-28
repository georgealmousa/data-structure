public class Main {
    public static void main(String[] args) {
//        Person1 person1 = new Person1();
//        Person2 person2= new Person2();
//        person1.giveRewards(500);
//        person2.giveRewards("500");
        Box<String> boxItem = new Box<>();
        boxItem.setItem("Hello");
        System.out.println(boxItem.getItem());
        Box<Integer> boxitem2=new Box<>();
        boxitem2.setItem(100);
//        person1.name("George");
//        person1.attack("Shurkin");
//        person2.name("Jhon");
//        person2.attack("Gun");
//        printPerson(person1);
//        printPerson(person2);
//        Ninja ninja = new Person1();
//        printPerson(ninja);
//        ninja = new Person2();
//        printPerson(ninja);
    }
    public static void printPerson(Ninja p){
        System.out.println(p.masterName());
    }
}