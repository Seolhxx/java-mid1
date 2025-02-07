package lang.string.test;

public class TestString7 {

    public static void main(String[] args) {
        String original = "    Hello Java     ";
        String trimmed1 = original.trim();
        String trimmed2 = original.strip();
        System.out.println(trimmed1);
        System.out.println(trimmed2);
    }
}
