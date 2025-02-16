package lang.wrapper.test;


public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "30";

        int str3 = Integer.parseInt(str1);
        int str4 = Integer.parseInt(str2);

        System.out.println("sum= " + (str3 + str4));
    }
}
