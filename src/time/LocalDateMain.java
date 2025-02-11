package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 13);
        System.out.println("오늘 날짜= " + nowDate);
        System.out.println("지정 날짜= " + ofDate);

        //계산(불변) : 반환값 받아야 함
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d = " + ofDate);

    }
}
