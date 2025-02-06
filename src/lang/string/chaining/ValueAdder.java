package lang.string.chaining;

public class ValueAdder {

    private int value;

    //자신의 값 증가
    public ValueAdder add(int addValue) {
        value += addValue;
        return this; //자기자신 반환
    }

    public int getValue() {
        return value;
    }
}
