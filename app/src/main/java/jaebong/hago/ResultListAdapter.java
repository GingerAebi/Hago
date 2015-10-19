package jaebong.hago;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by JaeBong on 15. 10. 13..
 */
public class ResultListAdapter extends ArrayAdapter<Person> {
    private Context context;
    private int layoutResourceId;
    private ArrayList<Person> personArrayList;

    public ResultListAdapter(Context context, int layoutResourceId, ArrayList<Person> personArrayList) {
        super(context, layoutResourceId, personArrayList);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.personArrayList = personArrayList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if(row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId,parent,false);
        }

        TextView ages = (TextView)row.findViewById(R.id.textView_personRaw_ages);
        TextView atmosphere = (TextView)row.findViewById(R.id.textView_personRaw_atmosphere);
        TextView favoriteMenu = (TextView)row.findViewById(R.id.textView_personRaw_favoriteMenu);
        TextView gender = (TextView)row.findViewById(R.id.textView_personRaw_gender);
        TextView tall = (TextView)row.findViewById(R.id.textView_personRaw_tall);
        TextView time = (TextView)row.findViewById(R.id.textView_personRaw_time);

        Person nowPerson = personArrayList.get(position);

        ages.setText(nowPerson.keyToName(nowPerson.getAge()));
        atmosphere.setText(nowPerson.keyToName(nowPerson.getAtmosphere()));
        gender.setText(nowPerson.keyToName(nowPerson.getGender()));
        tall.setText(nowPerson.keyToName(nowPerson.getTall()));
        time.setText(longTimeToString(nowPerson.getTime()));

        return row;
    }

    private String longTimeToString(long time){
        Date date = new Date(time);

        SimpleDateFormat sdfNow = new SimpleDateFormat("HH");
        String strNow = sdfNow.format(date);

        int Hour = Integer.parseInt(strNow);
        String returnString;

        if(8 <= Hour && Hour <= 11 ){
            returnString = "오전";
        }else if (12 <= Hour && Hour <= 17){
            returnString =  "점심";
        }else {
            returnString = "저녁";
        }

        return returnString;
    }
}
