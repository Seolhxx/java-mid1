package enumeration.test.ex1;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            getGrade(authGrade, authGrade.getLevel(), authGrade.getDesciption());
        }
    }

    public static void getGrade (AuthGrade authGrade, int level, String desciption) {
        System.out.println("grade=" + authGrade.name() + ", level=" + level + ", 설명=" + desciption);
    }
}
