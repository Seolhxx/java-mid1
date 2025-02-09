package enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(); // 내부에선 생성 가능
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가 - 외부에서 생성할 수 없도록 막음
    private ClassGrade() {}
}
