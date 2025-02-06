package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);
        String boolString = String.valueOf(bool); // "true"
        System.out.println("불리언의 문자열 값: " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objString);

        //문자 + x -> 다 문자로 변환
        String numString2 = "" + num; // "100"
        System.out.println("빈문자열 + num" + numString2);

        //toCharArrau 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray);
        //+를 해버리면 캐릭터 배열의 참조값을 출력함
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }



    }
}
