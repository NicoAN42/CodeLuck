package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class dicec extends AppCompatActivity {

    String[] listViewdc = {
            "Manifest",
            "XML",
            "Java"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codedice);

        ListView listView = (ListView) findViewById(R.id.listViewdc);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listViewdc);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pilih = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(view.getContext(), "You'll see the " +pilih+ " code of Dice Game", Toast.LENGTH_SHORT).show();

                if (i == 0) {
                    Intent dm = new Intent(view.getContext(),Manifestdc.class);
                    startActivity(dm);
                }
                else if (i == 1) {
                    Intent dx = new Intent(view.getContext(),XMLdc.class);
                    startActivity(dx);
                }
                else if (i == 2) {
                    Intent dj = new Intent(view.getContext(),Javadc.class);
                    startActivity(dj);
                }
            }
        });
    }

}
