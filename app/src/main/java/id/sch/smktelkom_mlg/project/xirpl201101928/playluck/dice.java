package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;




public class dice extends AppCompatActivity {
ImageView iv_cpua , iv_playera;
TextView tv_cpua, tv_playera;

    int cpuPoints, playerPoints;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice);
        this.iv_cpua = (ImageView) this.findViewById(R.id.iv_cpu);
        this.iv_playera = (ImageView) this.findViewById(R.id.iv_player);


        this.tv_cpua = (TextView) this.findViewById(R.id.tv_cpu);
        this.tv_playera = (TextView) this.findViewById(R.id.tv_player);

        this.r = new Random();
        this.iv_playera.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int cpuThrow = dice.this.r.nextInt(6) + 1;
                int playerThrow = dice.this.r.nextInt(6) + 1;


                dice.this.setImageCPU(cpuThrow);
                dice.this.setImagePlayer(playerThrow);

                if(cpuThrow > playerThrow){
                    dice.this.cpuPoints++;
                }
                if(playerThrow > cpuThrow){
                    dice.this.playerPoints++;
                }
                if(playerThrow == cpuThrow) {
                    Toast.makeText(dice.this, "Draw !", Toast.LENGTH_SHORT).show();

                }

                dice.this.tv_cpua.setText("CPU: " + dice.this.cpuPoints);
                dice.this.tv_playera.setText("YOU: " + dice.this.playerPoints);


                Animation rotate = AnimationUtils.loadAnimation(dice.this.getApplicationContext(), R.anim.rotate);
                dice.this.iv_cpua.startAnimation(rotate);
                dice.this.iv_playera.startAnimation(rotate);


            }
        });
    }
    public void setImageCPU(int num){
        switch (num) {
            case 1:
                this.iv_cpua.setImageResource(R.drawable.d1);
                break;
            case 2:
                this.iv_cpua.setImageResource(R.drawable.d2);
                break;
            case 3:
                this.iv_cpua.setImageResource(R.drawable.d3);
                break;
            case 4:
                this.iv_cpua.setImageResource(R.drawable.d4);
                break;
            case 5:
                this.iv_cpua.setImageResource(R.drawable.d5);
                break;
            case 6:
                this.iv_cpua.setImageResource(R.drawable.d6);
                break;
        }
    }
    public void setImagePlayer(int num){
        switch (num) {
            case 1:
                this.iv_playera.setImageResource(R.drawable.d1);
                break;
            case 2:
                this.iv_playera.setImageResource(R.drawable.d2);
                break;
            case 3:
                this.iv_playera.setImageResource(R.drawable.d3);
                break;
            case 4:
                this.iv_playera.setImageResource(R.drawable.d4);
                break;
            case 5:
                this.iv_playera.setImageResource(R.drawable.d5);
                break;
            case 6:
                this.iv_playera.setImageResource(R.drawable.d6);
                break;
        }
    }
}
