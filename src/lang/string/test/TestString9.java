package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] splitEmails = email.split("@");
        String splitEmail1 = splitEmails[0];
        String splitEmail2 = splitEmails[1];

        System.out.println("ID: " + splitEmail1);
        System.out.println("Domain: " + splitEmail2 );
    }
}
