package review.equals;

public class EqaualsMainV2 {
    public static void main(String[] args) {
        UserV2 userV2 = new UserV2("id-100");
        UserV2 userV3 = new UserV2("id-100");
        System.out.println("identity : " + (userV2 == userV3));
        System.out.println("equality : " + userV2.equals(userV3));
    }
}
