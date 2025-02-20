package nested.anonymous.ex;

import java.util.Random;

//나의 리팩토링

public class Ex1Main1 {

    public static void hello1() {
        System.out.println("프로그램 시작");
        System.out.println("프로그램 종료");
    }

    public static void hello2() {

        //코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);
        //코드 조각 종료

        //코드 조각 시작
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        //코드 조각 종료
    }

    public static void main(String[] args) {

    }
}
