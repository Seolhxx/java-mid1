package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        //join 안썼을 때
        String joinStr = ""; //문자열 누적 시 초기값 지정
        for (String string : splitStr) {
            joinStr += string + "-"; //마지막 기호를 빼기 위해 더 복잡해짐
        }
        System.out.println("joinStr = " + joinStr);

        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        //문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);


    }
}
