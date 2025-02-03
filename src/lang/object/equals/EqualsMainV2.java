package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2)); //인스턴스 비교 : 동일성 관점
        System.out.println("equality = " + (user1.equals(user2))); //문자열 비점 : 동등성 관점

    }
}
