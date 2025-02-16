package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer num1 = Integer.valueOf(str);
        int unboxing = num1;
        Integer boxing = unboxing;

        System.out.println("num1 = " + num1);
        System.out.println("boxing = " + boxing);
        System.out.println("unboxing = " + unboxing);
    }
}
