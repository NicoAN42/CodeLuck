package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R;


public class dice extends AppCompatActivity {
ImageView iv_cpua , iv_playera;
TextView tv_cpua, tv_playera;

int cpuPoints = 0, playerPoints = 0;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_cpua = (ImageView) findViewById(R.id.iv_cpu);
        iv_playera = (ImageView) findViewById(R.id.iv_player);


        tv_cpua = (TextView) findViewById(R.id.tv_cpu);
        tv_playera = (TextView) findViewById(R.id.tv_player);


        r = new Random();
        iv_playera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cpuThrow = r.nextInt(6)  + 1;
                int playerThrow = r.nextInt(6) + 1;


                setImageCPU(cpuThrow);
                setImagePlayer(playerThrow);

                if(cpuThrow > playerThrow){
                    cpuPoints++;
                }
                if(playerThrow > cpuThrow){
                    playerPoints++;
                }
                if(playerThrow == cpuThrow) {
                    Toast.makeText(dice.this, "Draw !", Toast.LENGTH_SHORT).show();

                }

                tv_cpua.setText("CPU: " + cpuPoints);
                tv_playera.setText("YOU: " + playerPoints);


                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                iv_cpua.startAnimation(rotate);
                iv_playera.startAnimation(rotate);


            }
        });
    }
    public void setImageCPU(int num){
        switch (num) {
            case 1:
                iv_cpua.setImageResource(R.drawable.d1);
                break;
            case 2:
                iv_cpua.setImageResource(R.drawable.d2);
                break;
            case 3:
                iv_cpua.setImageResource(R.drawable.d3);
                break;
            case 4:
                iv_cpua.setImageResource(R.drawable.d4);
                break;
            case 5:
                iv_cpua.setImageResource(R.drawable.d5);
                break;
            case 6:
                iv_cpua.setImageResource(R.drawable.d6);
                break;
        }
    }
    public void setImagePlayer(int num){
        switch (num) {
            case 1:
                iv_playera.setImageResource(R.drawable.d1);
                break;
            case 2:
                iv_playera.setImageResource(R.drawable.d2);
                break;
            case 3:
                iv_playera.setImageResource(R.drawable.d3);
                break;
            case 4:
                iv_playera.setImageResource(R.drawable.d4);
                break;
            case 5:
                iv_playera.setImageResource(R.drawable.d5);
                break;
            case 6:
                iv_playera.setImageResource(R.drawable.d6);
                break;
        }
    }
}
