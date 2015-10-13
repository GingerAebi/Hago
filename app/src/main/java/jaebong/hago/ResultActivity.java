package jaebong.hago;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private Dao dao;
    private Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent getIntent = getIntent();
        person = (Person) getIntent.getSerializableExtra("Atmosphere");
        person.setTime(System.currentTimeMillis());

        dao = Dao.getInstance();
        dao.insertPersonToDB(person);

        TextView resultView = (TextView)findViewById(R.id.textView_result_result);
        resultView.setText(person.toString());

    }

}
