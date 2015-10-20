package jaebong.hago.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jaebong.hago.Person;
import jaebong.hago.R;

public class AtmosphereActivity extends AppCompatActivity implements View.OnClickListener {

    private Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atmosphere);


        Intent getIntent = getIntent();
        person = (Person) getIntent.getSerializableExtra("Appearance");

        findViewById(R.id.layout_atmosphere_bright).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_cool).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_shy).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_difficult).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_gentle).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_talkative).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent sendIntent = new Intent(AtmosphereActivity.this, ResultListActivity.class);
        switch(v.getId()){
            case R.id.layout_atmosphere_bright :
                person.setAtmosphere("마냥 밝음");
                break;
            case R.id.layout_atmosphere_cool :
                person.setAtmosphere("쿨 시크");
                break;
            case R.id.layout_atmosphere_difficult :
                person.setAtmosphere("까다로운");
                break;
            case R.id.layout_atmosphere_gentle :
                person.setAtmosphere("젠틀친절");
                break;
            case R.id.layout_atmosphere_talkative :
                person.setAtmosphere("수다쟁이");
                break;
            case R.id.layout_atmosphere_shy :
                person.setAtmosphere("부끄러운");
                break;

        }
        sendIntent.putExtra("Atmosphere",person);
        startActivity(sendIntent);
        finish();
    }
}
