package review.med1;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.ChildMethod();
        child.parentMethod();
        String string = child.toString();
        System.out.println(string);
    }
}
