package jaebong.hago;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

import jaebong.hago.SelectActivities.HomeActivity;

/**
 * Created by JaeBong on 15. 10. 10..
 */
public class Dao {
    private SQLiteDatabase database;

    private static Dao dao = new Dao(HomeActivity.getContext());
    public static Dao getInstance() {
        return dao;
    }

    private Dao(Context context){
        database = context.openOrCreateDatabase("PersonData.db",SQLiteDatabase.CREATE_IF_NECESSARY, null);

        try {
            String sql = "CREATE TABLE IF NOT EXISTS People(ID integer primary key autoincrement,"
                    + "										 Gender integer not null,"
                    + "										 Age integer not null,"
                    + "										 Atmosphere integer not null,"
                    + "										 Tall integer not null,"
                    + "										 Time integer not null);";
            database.execSQL(sql);



        } catch (Exception e) {
            Log.e("test", "CREATE TABLE FAILED! - " + e);
            e.printStackTrace();
        }
    }

    public void insertPersonToDB(Person person){
        int Gender;
        int Age;
        int Atmosphere;
        int Tall;
        long Time;

        Gender = person.getGender();
        Age = person.getAge();
        Atmosphere = person.getAtmosphere();
        Tall = person.getTall();
        Time = person.getTime();

        try {
            String sql = "INSERT INTO People(Gender,Age,Atmosphere,Tall,Time)"
                    + " VALUES("
                    + Gender
                    + ", '"
                    + Age
                    + "', '"
                    + Atmosphere
                    + "', '"
                    + Tall + "', '" + Time + "');";
            database.execSQL(sql);

        }catch (Exception e) {
            Log.e("test", "DATA INSERT FAILED! - " + e);
            e.printStackTrace();
        }
    }

    public ArrayList<Person> getPersonList() {

        ArrayList<Person> personList = new ArrayList<Person>();

        int gender;
        int age;
        int atmosphere;
        int tall;
        long time;

        String sql = "SELECT * FROM People;";
        Cursor cursor = database.rawQuery(sql, null);

        while (cursor.moveToNext()) {
            gender = cursor.getInt(1);
            age = cursor.getInt(2);
            atmosphere = cursor.getInt(3);
            tall = cursor.getInt(4);
            time = cursor.getLong(5);


            personList.add(new Person(gender, age, atmosphere, tall,time));
        }

        cursor.close();

        return personList;
    }
}
