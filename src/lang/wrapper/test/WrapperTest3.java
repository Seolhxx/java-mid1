package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        int num1 = Integer.parseInt(str);
        Integer boxing = Integer.valueOf(num1);
        int unboxing = boxing.intValue();

        System.out.println("num1 = " + num1);
        System.out.println("boxing = " + boxing);
        System.out.println("unboxing = " + unboxing);
    }
}
