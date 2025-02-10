package enumeration.ref1;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10); // 내부에선 생성 가능
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //회원등급 조회
    public int getDiscountPercent() {
        return discountPercent;
    }
}
