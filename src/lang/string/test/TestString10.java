package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banaba,mango";

        String[] splits = fruits.split(",");
        for (String split : splits) {
            System.out.println(split);
        }

        String result = String.join("->", splits);
        System.out.println(result);
    }
}
