public class Box <T>{

    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
    private T item;

}
/*
In Java, generics are a way to specify that a class or method can work with any type of object,
as long as it meets certain requirements.
This allows you to create classes and methods that are flexible and reusable,
and helps to prevent errors by catching them at compile time instead of runtime.
 */