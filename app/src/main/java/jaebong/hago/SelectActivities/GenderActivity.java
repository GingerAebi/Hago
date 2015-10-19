package jaebong.hago.SelectActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jaebong.hago.Enum.GENDER;
import jaebong.hago.Person;
import jaebong.hago.R;

public class GenderActivity extends AppCompatActivity {

    private Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        Intent getIntent = getIntent();
        person = (Person) getIntent.getSerializableExtra("Person");

        findViewById(R.id.layout_gender_man).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                person.setGender(GENDER.MAN);

                Intent sendIntent = new Intent(GenderActivity.this, AgesActivity.class);
                sendIntent.putExtra("Gender", person);
                startActivity(sendIntent);
                finish();
            }
        });

        findViewById(R.id.layout_gender_woman).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                person.setGender(GENDER.WOMAN);

                Intent sendIntent = new Intent(GenderActivity.this, AgesActivity.class);
                sendIntent.putExtra("Gender", person);
                startActivity(sendIntent);
                finish();
            }
        });


    }

}
