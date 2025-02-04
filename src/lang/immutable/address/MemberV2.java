package lang.immutable.address;

public class MemberV2 {

    private String name;
    private ImmutableAddress address;

    //생성자
    public MemberV2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    //address는 변경 가능한 것
    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
