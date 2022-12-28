public interface Ninja <T> {
    // the interface is like a contract that contains methods
    // these methods should have functionality
    // البنود
    void name(String name);
    void attack(String attackType);
    String masterName();
    void giveRewards(T m);

}