package review.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userv2 = new UserV1("id-100");
        System.out.println("identity : " + (userv2==userV1));
        System.out.println("equals : " + userV1.equals(userv2)) ;
    }
}
