package jaebong.hago.SelectActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jaebong.hago.Enum.TALL;
import jaebong.hago.Person;
import jaebong.hago.R;

public class TallActivity extends AppCompatActivity implements View.OnClickListener{
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tall);

        Intent getIntent = getIntent();
        person = (Person) getIntent.getSerializableExtra("Ages");

        findViewById(R.id.layout_tall_fat).setOnClickListener(this);
        findViewById(R.id.layout_tall_normal).setOnClickListener(this);
        findViewById(R.id.layout_tall_short).setOnClickListener(this);
        findViewById(R.id.layout_tall_skinny).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent sendIntent = new Intent(TallActivity.this, AtmosphereActivity.class);
        switch(v.getId()){
            case R.id.layout_tall_fat :
                person.setTall(TALL.FAT);
                break;
            case R.id.layout_tall_normal :
                person.setTall(TALL.NORMAL);
                break;
            case R.id.layout_tall_short :
                person.setTall(TALL.SHORT);
                break;
            case R.id.layout_tall_skinny :
                person.setTall(TALL.SKINNY);
                break;
        }
        sendIntent.putExtra("Tall", person);
        startActivity(sendIntent);
        finish();
    }
}
