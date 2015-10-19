package jaebong.hago.Enum;

public enum AGES{
    TEENAGER("10대"),
    YOUTH("20대"),
    SENIOR("30대"),
    MIDDLE_AGE("40대");

    private String age;

    AGES(String age){
        this.age = age;
    }


    @Override
    public String toString() {
        return  this.age;
    }
}
