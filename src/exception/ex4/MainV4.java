package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
        //NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            //공통으로 처리
            try {
                networkService.sendMessage(input);
            } catch (Exception e) { //모든 예외를 다 잡는다는 것
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    //공통 예외 처리
    private static void exceptionHandler(Exception e) {
        //공통 처리 로직
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다."); //html화면으로 보여주는 것
        System.out.println("==개발자용 디버깅 메시지=="); //개발자에게 파일로 남겨지는 것
        //e.printStackTrace(System.out); //스택 트레이스 출력
        e.printStackTrace();
        //e.printStackTrace(System.err);

        //필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) { //다운캐스팅
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }



    }
}
