package jaebong.hago;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    private Dao dao;
    private ArrayList<Person> personList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        dao = Dao.getInstance();
        personList = dao.getPersonList();

        ListView listView = (ListView)findViewById(R.id.listView_search);
        listView.setAdapter(new ResultListAdapter(this,R.layout.raw_person,personList));
    }



}
