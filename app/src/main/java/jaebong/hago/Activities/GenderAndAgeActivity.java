package jaebong.hago.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jaebong.hago.Person;
import jaebong.hago.R;

public class GenderAndAgeActivity extends AppCompatActivity implements View.OnClickListener{

    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        person = new Person();

        findViewById(R.id.layout_man_teenager).setOnClickListener(this);
        findViewById(R.id.layout_man_youth).setOnClickListener(this);
        findViewById(R.id.layout_man_senior).setOnClickListener(this);
        findViewById(R.id.layout_man_middleAge).setOnClickListener(this);

        findViewById(R.id.layout_woman_teenager).setOnClickListener(this);
        findViewById(R.id.layout_woman_youth).setOnClickListener(this);
        findViewById(R.id.layout_woman_senior).setOnClickListener(this);
        findViewById(R.id.layout_woman_middleAge).setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        Intent sendIntent = new Intent(GenderAndAgeActivity.this, AppearanceActivity.class);
        switch(v.getId()){


            case R.id.layout_man_teenager :
                person.setGender("남자");
                person.setAge("10대");
                break;
            case R.id.layout_man_youth :
                person.setGender("남자");
                person.setAge("20대");
                break;
            case R.id.layout_man_senior :
                person.setGender("남자");
                person.setAge("30대");
                break;
            case R.id.layout_man_middleAge :
                person.setGender("남자");
                person.setAge("40대");
                break;

            case R.id.layout_woman_teenager :
                person.setGender("여자");
                person.setAge("10대");
                break;
            case R.id.layout_woman_youth :
                person.setGender("여자");
                person.setAge("20대");
                break;
            case R.id.layout_woman_senior :
                person.setGender("여자");
                person.setAge("30대");
                break;
            case R.id.layout_woman_middleAge :
                person.setGender("여자");
                person.setAge("40대");
                break;
        }
        sendIntent.putExtra("GenderAndAge",person);
        startActivity(sendIntent);
        finish();
    }
}
