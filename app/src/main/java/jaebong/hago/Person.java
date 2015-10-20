package jaebong.hago;

import java.io.Serializable;

public class Person implements Serializable{
    private String gender;
    private String age;
    private String atmosphere;
    private String appearance;
    private String menu;
    private long time;

    public Person(){}

    public Person(String appearance, String gender, String age, String atmosphere, long time) {
        this.appearance = appearance;
        this.gender = gender;
        this.age = age;
        this.atmosphere = atmosphere;
        this.time = time;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
