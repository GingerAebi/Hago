package jaebong.hago.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import jaebong.hago.Adapter.ResultListAdapter;
import jaebong.hago.Dao;
import jaebong.hago.Person;
import jaebong.hago.R;

public class ResultListActivity extends AppCompatActivity {

    private Dao dao;
    private ArrayList<Person> personList;
    private Person person;
    private ResultListAdapter resultListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_list);

        Intent getIntent = getIntent();
        person = (Person) getIntent.getSerializableExtra("Atmosphere");
        person.setTime(System.currentTimeMillis());

        dao = new Dao(getApplicationContext());
        personList = dao.getCustomPersonList(person);

        ListView listView = (ListView)findViewById(R.id.listView_search);
        resultListAdapter = new ResultListAdapter(this,R.layout.row_person_info,personList);

        listView.setAdapter(resultListAdapter);


        findViewById(R.id.FAB_searchResult_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dao.insertPersonToDB(person);
                resultListAdapter.addItem(person);
            }
        });

    }
}
