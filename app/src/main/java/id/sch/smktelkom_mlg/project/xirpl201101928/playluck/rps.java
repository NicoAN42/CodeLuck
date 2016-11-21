package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


/**
 * Created by MS on 20/11/2016.
 */

public class rps extends AppCompatActivity {

    Button b_rock, b_paper, b_scissors;
    ImageView iv_cpu, iv_me;

    String myChoice, cpuChoice;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rps);

        this.iv_cpu = (ImageView) this.findViewById(R.id.iv_cpu);
        this.iv_me = (ImageView) this.findViewById(R.id.iv_me);

        this.b_rock = (Button) this.findViewById(R.id.b_rock);
        this.b_paper = (Button) this.findViewById(R.id.b_paper);
        this.b_scissors = (Button) this.findViewById(R.id.b_scissors);

        this.r = new Random();

        this.b_rock.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rps.this.myChoice = "rock";
                rps.this.calculate();
            }
        });

        this.b_paper.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rps.this.myChoice = "paper";
                rps.this.calculate();
            }
        });

        this.b_scissors.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rps.this.myChoice = "scissors";
                rps.this.calculate();
            }
        });
    }

    private void calculate() {

    }
}
