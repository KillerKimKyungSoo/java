package review.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog = new Dog("멍멍이",2);
        System.out.println(dog.toString());
        System.out.println(car.toString());
        System.out.println(dog);
        System.out.println(car);
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);

    }
}
