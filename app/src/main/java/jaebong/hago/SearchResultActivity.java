package jaebong.hago;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SearchResultActivity extends AppCompatActivity {

    private Dao dao;
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        Intent getIntent = getIntent();
        person = (Person) getIntent.getSerializableExtra("Atmosphere");
        person.setTime(System.currentTimeMillis());

        dao = Dao.getInstance();

        findViewById(R.id.FAB_searchResult_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dao.insertPersonToDB(person);
            }
        });
    }

}
