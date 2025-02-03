package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        //연산자 우선순위로 인해 ()넣어줌
        System.out.println("identity = " + (user1 == user2)); //참조값이 다르므로 false
        System.out.println("equality = " + (user1.equals(user2)));


    }
}
