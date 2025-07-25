package review.equals.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b=a ;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        b=new ImmutableAddress("부산");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
