package nested.anonymous.ex;

public class Ex0Main1 {

    //나의 리팩토링
    public static void hello() {
        String[] str = {"Hello Java", "Hello Spring"};
        for (String string : str) {
            System.out.println("프로그램 시작");
            System.out.println(string);
            System.out.println("프로그램 종료");
        }
    }

    public static void main(String[] args) {
        hello();
    }
}
