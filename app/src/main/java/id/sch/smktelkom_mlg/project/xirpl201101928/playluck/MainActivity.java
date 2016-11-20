package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton d;
    ImageButton r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        d = (ImageButton) findViewById(R.id.dice);
        r = (ImageButton) findViewById(R.id.rps);
        d.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent a = new Intent
                        (getApplicationContext(), dice.class);
                startActivity(a);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent c = new Intent
                        (getApplicationContext(), rps.class);
                startActivity(c);
            }
        });
    }

}