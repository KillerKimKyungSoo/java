package review.med1;

public class Child extends Parent{
    public void ChildMethod(){
        System.out.println("Child.ChildMethod");
        Parent parent = new Parent();
        parent.parentMethod();
    }
}
