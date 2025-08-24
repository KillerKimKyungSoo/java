package review.med1;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();
        Object[] objects =  {dog,car,object};
        Size(objects);
    }
    private static void Size(Object[] objects){
        System.out.println("전달된 개체수 : " + objects.length);
    }

}
