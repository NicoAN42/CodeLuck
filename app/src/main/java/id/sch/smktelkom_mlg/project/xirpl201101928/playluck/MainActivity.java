package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageButton dice;
    ImageButton rps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();


    }

    public void addListenerOnButton() {
        dice = (ImageButton) findViewById(R.id.dice);

        dice.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "random DICE!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Book.class));
            }
        });


}}