package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageButton dice;
    ImageButton rps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.addListenerOnButton();


    }

    public void addListenerOnButton() {
        this.dice = (ImageButton) this.findViewById(R.id.dice);

        this.dice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "random DICE!", Toast.LENGTH_SHORT).show();

            }
        });

        this.rps = (ImageButton) this.findViewById(R.id.rps);

        this.rps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Rock Paper Scissor", Toast.LENGTH_SHORT).show();
            }
        });
}}