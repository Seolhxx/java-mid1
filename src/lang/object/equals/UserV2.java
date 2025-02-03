package lang.object.equals;

public class UserV2 { //extends Object 생략된 것

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; //캐스팅
//        boolean result = id.equals(user.id); // boolean result = this.id.equals(user.id);과 같은 것
//        return result;
        return id.equals(user.id);
    }
}
