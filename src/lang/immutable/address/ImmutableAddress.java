package lang.immutable.address;

public class ImmutableAddress {

    private final String value; //주소를 보관하는 객체

    //생성자 : 생성할 때 값을 세팅
    public ImmutableAddress(String value) {
        this.value = value;
    }

    //값을 꺼냄
    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
