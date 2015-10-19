package jaebong.hago.SelectActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jaebong.hago.Enum.AGES;
import jaebong.hago.Person;
import jaebong.hago.R;

public class AgesActivity extends AppCompatActivity implements View.OnClickListener {
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ages);

        Intent getIntent = getIntent();
        person = (Person) getIntent.getSerializableExtra("Gender");

        findViewById(R.id.layout_ages_teenager).setOnClickListener(this);
        findViewById(R.id.layout_ages_youth).setOnClickListener(this);
        findViewById(R.id.layout_ages_senior).setOnClickListener(this);
        findViewById(R.id.layout_ages_middleAge).setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        Intent sendIntent = new Intent(AgesActivity.this, TallActivity.class);
        switch(v.getId()){
            case R.id.layout_ages_teenager :
                person.setAge(AGES.TEENAGER);
                break;
            case R.id.layout_ages_youth :
                person.setAge(AGES.YOUTH);
                break;
            case R.id.layout_ages_senior :
                person.setAge(AGES.SENIOR);
                break;
            case R.id.layout_ages_middleAge :
                person.setAge(AGES.MIDDLE_AGE);
                break;
        }
        sendIntent.putExtra("Ages",person);
        startActivity(sendIntent);
        finish();
    }
}
