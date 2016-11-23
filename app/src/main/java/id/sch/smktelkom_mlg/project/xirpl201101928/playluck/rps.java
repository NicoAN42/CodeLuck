package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.drawable;
import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.id;

public class rps extends AppCompatActivity {

    Button b_rock, b_paper, b_scissors;
    ImageView iv_cpu, iv_me;

    String myChoice, cpuChoice, result;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);

        this.iv_cpu = (ImageView) this.findViewById(id.iv_cpu);
        this.iv_me = (ImageView) this.findViewById(id.iv_me);

        this.b_rock = (Button) this.findViewById(id.b_rock);
        this.b_paper = (Button) this.findViewById(id.b_paper);
        this.b_scissors = (Button) this.findViewById(id.b_scissors);

        this.r = new Random();

        this.b_rock.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rps.this.myChoice = "rock";
                rps.this.iv_me.setImageResource(drawable.rock);
                rps.this.calculate();
            }
        });

        this.b_paper.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rps.this.myChoice = "paper";
                rps.this.iv_me.setImageResource(drawable.paper);
                rps.this.calculate();
            }
        });

        this.b_scissors.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rps.this.myChoice = "scissors";
                rps.this.iv_me.setImageResource(drawable.scissors);
                rps.this.calculate();
            }
        });
    }

    private void calculate() {
        int cpu = this.r.nextInt(3);
        if (cpu == 0) {
            this.cpuChoice = "rock";
            this.iv_cpu.setImageResource(drawable.rock);
        } else if (cpu == 1) {
            this.cpuChoice = "paper";
            this.iv_cpu.setImageResource(drawable.paper);
        } else if (cpu == 2) {
            this.cpuChoice = "scissors";
            this.iv_cpu.setImageResource(drawable.scissors);
        }

        if (this.myChoice.equals("rock") && this.cpuChoice.equals("paper")) {
            this.result = "You lose";
        } else if (this.myChoice.equals("rock") && this.cpuChoice.equals("scissors")) {
            this.result = "You win";
        } else if (this.myChoice.equals("rock") && this.cpuChoice.equals("rock")) {
            this.result = "Draw";
        } else if (this.myChoice.equals("paper") && this.cpuChoice.equals("paper")) {
            this.result = "Draw";
        } else if (this.myChoice.equals("paper") && this.cpuChoice.equals("rock")) {
            this.result = "You win";
        } else if (this.myChoice.equals("paper") && this.cpuChoice.equals("scissors")) {
            this.result = "You lose";
        } else if (this.myChoice.equals("scissors") && this.cpuChoice.equals("scissors")) {
            this.result = "Draw";
        } else if (this.myChoice.equals("scissors") && this.cpuChoice.equals("rock")) {
            this.result = "You lose";
        } else if (this.myChoice.equals("scissors") && this.cpuChoice.equals("paper")) {
            this.result = "You lose";
        }

        Toast.makeText(this, this.result, Toast.LENGTH_SHORT).show();
    }
}
