package review.enumer;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println(Grade.BASIC.getClass());
        System.out.println(System.identityHashCode(Grade.BASIC));
    }
}
