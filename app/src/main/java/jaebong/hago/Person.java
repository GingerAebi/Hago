package jaebong.hago;

import java.io.Serializable;

/**
 * Created by JaeBong on 15. 10. 9..
 */

interface GENDER{
    int MAN = 1;
    int WOMAN = 2;
}

interface AGES{
    int TEENAGER = 10;
    int YOUTH = 20;
    int SENIOR = 30;
    int MIDDLE_AGE = 40;

}

interface TALL{
    int SHORT = 1000;
    int SKINNY = 2000;
    int NORMAL = 3000;
    int FAT = 4000;

}

interface ATMOSPHERE{
    int BRIGHT = 100;
    int SHY = 200;
    int TALKATIVE = 300;
    int GENTLE = 400;
    int COOL = 500;
    int DIFFICULT = 600;


}

public class Person implements Serializable{
    private int gender;
    private int age;
    private int atmosphere;
    private int tall;
    private long time;

    public Person(){}

    public Person(int gender, int age, int atmosphere, int tall, long time) {
        this.gender = gender;
        this.age = age;
        this.atmosphere = atmosphere;
        this.tall = tall;
        this.time = time;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setAtmosphere(int atmosphere) {
        this.atmosphere = atmosphere;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + keyToName(gender) +
                ", age=" + keyToName(age) +
                ", atmosphere=" + keyToName(atmosphere) +
                ", tall=" + keyToName(tall) +
                '}';
    }

    public int getGender() {
        return gender;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getAge() {

        return age;
    }

    public int getAtmosphere() {
        return atmosphere;
    }

    public int getTall() {
        return tall;
    }

    public String keyToName(int key){
        switch(key){
            case GENDER.MAN :
                return "남자";
            case GENDER.WOMAN :
                return "여자";

            case AGES.TEENAGER :
                return "10대";
            case AGES.YOUTH :
                return "20대";
            case AGES.SENIOR :
                return "30대";
            case AGES.MIDDLE_AGE :
                return "40대";

            case ATMOSPHERE.BRIGHT :
                return "밝음";
            case ATMOSPHERE.COOL :
                return "쿨함";
            case ATMOSPHERE.DIFFICULT :
                return "까다로움";
            case ATMOSPHERE.GENTLE :
                return "젠틀친절함";
            case ATMOSPHERE.SHY :
                return "부끄부끄함";

            case ATMOSPHERE.TALKATIVE :
                return "수다스러움";

            case TALL.FAT :
                return "통통이상";
            case TALL.NORMAL :
                return "평범함";
            case TALL.SHORT :
                return "아담함";
            case TALL.SKINNY :
                return "마름";

            default:
                return "이상이상 에러에러";



        }
    }
}
