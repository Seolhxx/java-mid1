package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
//        int discountPercent = classGrade.getDiscountPercent();
//        return price * discountPercent / 100;
        return price * classGrade.getDiscountPercent() / 100;
    }
}
