package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> intergerBox = new GenericBox<Integer>();
        intergerBox.setValue(10);
        Integer integer = intergerBox.getValue();
        System.out.println("Integer : " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setValue("hello");
        String string = stringGenericBox.getValue();
        System.out.println("String :" + string);

        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.setValue(10.2);
        Double doublevalue = doubleGenericBox.getValue();
        System.out.println("Double :" + doublevalue);
    }
}
