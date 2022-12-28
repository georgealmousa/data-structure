public class Person1 implements Ninja<Integer>{
    @Override
    public void name(String name) {
        System.out.println("My name is "+ name);
    }
    @Override
    public void attack(String attackType) {
        System.out.println("My attack weapon is "+ attackType);
    }
    @Override
    public String masterName() {

        return "Jack";
    }

    @Override
    public void giveRewards(Integer m) {
        System.out.println("Thanks for "+m+"$");
    }


}
