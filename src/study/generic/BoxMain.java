package study.generic;

public class BoxMain {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>();
        integerGenericBox.set(1212);
        Integer integer = integerGenericBox.get();
        System.out.println(integer);

        GenericBox<String> stringGenericBox = new GenericBox<String>();
        stringGenericBox.set("sdsd");
        String string = stringGenericBox.get();
        System.out.println(string);
    }
}
