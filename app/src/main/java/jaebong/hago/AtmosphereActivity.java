package jaebong.hago;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AtmosphereActivity extends AppCompatActivity implements View.OnClickListener {

    private Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atmosphere);


        Intent getIntent = getIntent();
        person = (Person) getIntent.getSerializableExtra("Tall");

        findViewById(R.id.layout_atmosphere_bright).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_cool).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_shy).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_difficult).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_gentle).setOnClickListener(this);
        findViewById(R.id.layout_atmosphere_talkative).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent sendIntent = new Intent(AtmosphereActivity.this, TallActivity.class);
        switch(v.getId()){
            case R.id.layout_atmosphere_bright :
                person.setAtmosphere(ATMOSPHERE.BRIGHT);
                break;
            case R.id.layout_atmosphere_cool :
                person.setAtmosphere(ATMOSPHERE.COOL);
                break;
            case R.id.layout_atmosphere_difficult :
                person.setAtmosphere(ATMOSPHERE.DIFFICULT);
                break;
            case R.id.layout_atmosphere_gentle :
                person.setAtmosphere(ATMOSPHERE.GENTLE);
                break;
            case R.id.layout_atmosphere_talkative :
                person.setAtmosphere(ATMOSPHERE.TALKATIVE);
                break;
            case R.id.layout_atmosphere_shy :
                person.setAtmosphere(ATMOSPHERE.SHY);
                break;

        }
        sendIntent.putExtra("Atmosphere",person);
        startActivity(sendIntent);
        finish();
    }
}
