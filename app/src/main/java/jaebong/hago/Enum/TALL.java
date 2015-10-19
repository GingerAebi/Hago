package jaebong.hago.Enum;

/**
 * Created by JaeBong on 15. 10. 19..
 */
public enum TALL{
    SHORT("아담한"),
    SKINNY("마른"),
    NORMAL("평범한"),
    FAT("톧통한");

    private String tall;

    TALL(String tall){
        this.tall = tall;
    }


    @Override
    public String toString() {
        return tall;
    }
}
