package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by USER-ACER-PC on 03/12/2016.
 */

public class menu6 extends AppCompatActivity {

    String[] pilihan = {
            "Rock, Paper, Scissors",
            "The code of Rock, Paper, Scissors game",
            "Dice",
            "The code of Dice game"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu6);

        ListView listView = (ListView) findViewById(R.id.pilih);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pilihan);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pilihan = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(view.getContext(), "You'll see the " + pilihan, Toast.LENGTH_SHORT).show();

                if (i == 0) {
                    Intent rps = new Intent(view.getContext(),rps.class);
                    startActivity(rps);
                }
                else if (i == 1) {
                    Intent rpsc = new Intent(view.getContext(),rpsc.class);
                    startActivity(rpsc);
                }
                else if (i == 2) {
                    Intent dice = new Intent(view.getContext(),dice.class);
                    startActivity(dice);
                }
                else if (i == 3) {
                    Intent dicec = new Intent(view.getContext(),dicec.class);
                    startActivity(dicec);
                }
            }
        });
    }

}
