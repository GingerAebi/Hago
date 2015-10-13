package jaebong.hago;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    private static Context applicationContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        applicationContext = getApplicationContext();

        findViewById(R.id.layout_home_registerNew).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Person person = new Person();
                Intent intent = new Intent(HomeActivity.this,GenderActivity.class);
                intent.putExtra("Person",person);
                startActivity(intent);
            }
        });

        findViewById(R.id.layout_home_searchPerson).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });

    }

    public static Context getContext() {
        return applicationContext;
    }

}
