package jaebong.hago;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by JaeBong on 15. 10. 10..
 */
public class Dao {
    private SQLiteDatabase database;

    public Dao(Context context){
        database = context.openOrCreateDatabase("PersonData.db",SQLiteDatabase.CREATE_IF_NECESSARY, null);

        try {
            String sql = "CREATE TABLE IF NOT EXISTS People(ID integer primary key autoincrement,"
                    + "										 Gender text not null,"
                    + "										 Age text not null,"
                    + "										 Atmosphere text not null,"
                    + "										 Appearance text not null,"
                    + "										 Time integer not null);";
            database.execSQL(sql);



        } catch (Exception e) {
            Log.e("test", "CREATE TABLE FAILED! - " + e);
            e.printStackTrace();
        }
    }

    public void insertPersonToDB(Person person){
        String gender;
        String age;
        String atmosphere;
        String appearance;
        long time;

        gender = person.getGender();
        age = person.getAge();
        atmosphere = person.getAtmosphere();
        appearance = person.getAppearance();
        time = person.getTime();

        try {
            String sql = "INSERT INTO People(Gender,Age,Atmosphere,Appearance,Time)"
                    + " VALUES("
                    + "'" + gender
                    + "', '"
                    + age
                    + "', '"
                    + atmosphere
                    + "', '"
                    + appearance + "', '" + time + "');";
            database.execSQL(sql);

        }catch (Exception e) {
            Log.e("test", "DATA INSERT FAILED! - " + e);
            e.printStackTrace();
        }
    }

    public ArrayList<Person> getPersonList() {

        ArrayList<Person> personList = new ArrayList<Person>();

        String gender;
        String age;
        String atmosphere;
        String appearance;
        long time;

        String sql = "SELECT * FROM People;";
        Cursor cursor = database.rawQuery(sql, null);

        while (cursor.moveToNext()) {
            gender = cursor.getString(1);
            age = cursor.getString(2);
            atmosphere = cursor.getString(3);
            appearance = cursor.getString(4);
            time = cursor.getLong(5);


            personList.add(new Person(gender, age, atmosphere, appearance,time));
        }

        cursor.close();

        return personList;
    }

    public ArrayList<Person> getCustomPersonList(Person person){

        ArrayList<Person> personList = new ArrayList<Person>();

        String gender = person.getGender();
        String age = person.getAge();
        String atmosphere = person.getAtmosphere();
        String appearance = person.getAppearance();
        long time;

        String sql = "SELECT * FROM People WHERE "
                +   "Gender='"+gender +"' and "
                +   "Age='"+age  +"' and "
                +   "Atmosphere='"+atmosphere+ "' and "
                +   "Appearance='"+appearance+"';";

        Cursor cursor = database.rawQuery(sql, null);

        while (cursor.moveToNext()) {
            gender = cursor.getString(1);
            age = cursor.getString(2);
            atmosphere = cursor.getString(3);
            appearance = cursor.getString(4);
            time = cursor.getLong(5);


            personList.add(new Person(gender, age, atmosphere, appearance,time));
        }

        cursor.close();

        return personList;
    }
}
