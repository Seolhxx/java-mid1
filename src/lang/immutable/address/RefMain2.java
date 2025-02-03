package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산"); //b의 값을 부산으로 변경해야함
        //위에처럼 실수할 가능성이 전혀 없다. 변하지 않는 주소이므로 : 값을 변경할 수 없는 불변이므로
        b = new ImmutableAddress("부산"); //새로운 객체를 생성해서 담음
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
