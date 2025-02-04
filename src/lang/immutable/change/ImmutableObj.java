package lang.immutable.change;

public class ImmutableObj {

    private final int value;
    //final 필드는 반드시 한 번은 초기화해야 한다.
    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue; //본인의 value는 변하지 않음
//        ImmutableObj immutableObj = new Immutable  Obj(result);
//        return immutableObj;
        return new ImmutableObj (result); //새 로운 객체를 생성해서 반환
    }

    public int getValue() {
        return value;
    }
}
