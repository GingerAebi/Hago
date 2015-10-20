package jaebong.hago.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import jaebong.hago.Person;
import jaebong.hago.R;

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

    public void addItem(Person person){
        personArrayList.add(person);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if(row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId,parent,false);
        }

        ImageView menuImage = (ImageView)row.findViewById(R.id.imageView_row_personInfo_menu);
        TextView menu = (TextView)row.findViewById(R.id.textView_row_personInfo_menu);
        TextView memo = (TextView)row.findViewById(R.id.textView_row_personInfo_memo);
        TextView date = (TextView)row.findViewById(R.id.textView_row_personInfo_date);

        Person nowPerson = personArrayList.get(position);

        date.setText(longTimeToString(nowPerson.getTime()));

        return row;
    }

    private String longTimeToString(long time){
        Date date = new Date(time);

        SimpleDateFormat sdfNow = new SimpleDateFormat("yy-MM-dd");
        String strNow = sdfNow.format(date);

        return strNow;
    }

    private String longTimeSeperateThree(long time){
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
