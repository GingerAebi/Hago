package jaebong.hago.Enum;

/**
 * Created by JaeBong on 15. 10. 19..
 */
public enum ATMOSPHERE{
    BRIGHT("밝음"),
    SHY("부끄부끄"),
    TALKATIVE("수다쟁이"),
    GENTLE("젠틀친절"),
    COOL("쿨시크"),
    DIFFICULT("까다로운");

    private String atmosphere;

    ATMOSPHERE(String atmosphere){
        this.atmosphere = atmosphere;
    }


    @Override
    public String toString() {
        return atmosphere;
    }
}
