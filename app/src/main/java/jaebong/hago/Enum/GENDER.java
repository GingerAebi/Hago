package jaebong.hago.Enum;

/**
 * Created by JaeBong on 15. 10. 9..
 */

public enum GENDER {

    MAN("남자"), WOMAN("여자");

    private String gender;

    GENDER(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.gender;
    }
}
