package lang.math.practice;

public class LottoMain {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int[] lottoNumber = lotto.generate();

        System.out.print("로또번호 ");
        for (int i : lottoNumber) {
            System.out.print(i + " ");
        }
    }
}
