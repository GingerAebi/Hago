package jaebong.hago;

import java.io.Serializable;

import jaebong.hago.Enum.AGES;
import jaebong.hago.Enum.ATMOSPHERE;
import jaebong.hago.Enum.GENDER;
import jaebong.hago.Enum.TALL;


public class Person implements Serializable{
    private GENDER gender;
    private AGES age;
    private ATMOSPHERE atmosphere;
    private TALL tall;
    private int menu;
    private long time;

    public Person(){}

    public Person(TALL tall, GENDER gender, AGES age, ATMOSPHERE atmosphere, long time) {
        this.tall = tall;
        this.gender = gender;
        this.age = age;
        this.atmosphere = atmosphere;
        this.time = time;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public AGES getAge() {
        return age;
    }

    public void setAge(AGES age) {
        this.age = age;
    }

    public ATMOSPHERE getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(ATMOSPHERE atmosphere) {
        this.atmosphere = atmosphere;
    }

    public TALL getTall() {
        return tall;
    }

    public void setTall(TALL tall) {
        this.tall = tall;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
//
//    public String keyToName(int key){
//        switch(key){
//            case GENDER.MAN :
//                return "남자";
//            case GENDER.WOMAN :
//                return "여자";
//
//            case AGES.TEENAGER :
//                return "10대";
//            case AGES.YOUTH :
//                return "20대";
//            case AGES.SENIOR :
//                return "30대";
//            case AGES.MIDDLE_AGE :
//                return "40대";
//
//            case ATMOSPHERE.BRIGHT :
//                return "밝음";
//            case ATMOSPHERE.COOL :
//                return "쿨함";
//            case ATMOSPHERE.DIFFICULT :
//                return "까다로움";
//            case ATMOSPHERE.GENTLE :
//                return "젠틀친절함";
//            case ATMOSPHERE.SHY :
//                return "부끄부끄함";
//
//            case ATMOSPHERE.TALKATIVE :
//                return "수다스러움";
//
//            case TALL.FAT :
//                return "통통이상";
//            case TALL.NORMAL :
//                return "평범함";
//            case TALL.SHORT :
//                return "아담함";
//            case TALL.SKINNY :
//                return "마름";
//
//            default:
//                return "이상이상 에러에러";
//
//
//
//        }
//    }
}
