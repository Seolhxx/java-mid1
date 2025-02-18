package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: " );
        String grade = scanner.nextLine();
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            getGrade(authGrade, authGrade.getLevel(), authGrade.getDesciption());
        }
    }

    public static void getGrade (AuthGrade authGrade, int level, String desciption) {
        System.out.println("당신의 등급은 " + authGrade.name() + "입니다.");
        System.out.println("==메뉴 목록==");
        if (authGrade.equals("GUEST")) {
            System.out.println("- 메인 화면");
        } else if (authGrade.equals("LOGIN")) {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }

    }
}
