package jaebong.hago.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jaebong.hago.Person;
import jaebong.hago.R;

public class AppearanceActivity extends AppCompatActivity implements View.OnClickListener{
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tall);

        Intent getIntent = getIntent();
        person = (Person) getIntent.getSerializableExtra("GenderAndAge");

        findViewById(R.id.layout_tall_fat).setOnClickListener(this);
        findViewById(R.id.layout_tall_normal).setOnClickListener(this);
        findViewById(R.id.layout_tall_short).setOnClickListener(this);
        findViewById(R.id.layout_tall_skinny).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent sendIntent = new Intent(AppearanceActivity.this, AtmosphereActivity.class);
        switch(v.getId()){
            case R.id.layout_tall_fat :
                person.setAppearance("통통한");
                break;
            case R.id.layout_tall_normal :
                person.setAppearance("평범한");
                break;
            case R.id.layout_tall_short :
                person.setAppearance("아담한");
                break;
            case R.id.layout_tall_skinny :
                person.setAppearance("마른");
                break;
        }
        sendIntent.putExtra("Appearance", person);
        startActivity(sendIntent);
        finish();
    }
}
