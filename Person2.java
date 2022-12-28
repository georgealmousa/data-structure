public class Person2 implements Ninja<String> {
    @Override
    public void name(String name) {
        System.out.println("I have no name!");
    }
    @Override
    public void attack(String attackType) {
        System.out.println("I have no attack weapon!");
    }
    @Override
    public String masterName() {
        return "Donatilo";
    }
    @Override
    public void giveRewards(String m) {
        System.out.println("I don't accpet money I only take items");
    }
}
