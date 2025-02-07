package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";


        int count = 0;
        while(true) {
            if (str.equals(key)) {
                int result = str.indexOf(key);
                count += result;
            }
            System.out.println("count = " + count);
            break;
        }

    }
}
