package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class rpsc extends AppCompatActivity {

    String[] listViewrps = {
            "Manifest",
            "XML",
            "Java"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coderps);

        ListView listView = (ListView) findViewById(R.id.listViewrps);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listViewrps);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pilih = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(view.getContext(), "You'll see the " +pilih+ " code of Basic Widget", Toast.LENGTH_SHORT).show();

                if (i == 0) {
                    Intent rm = new Intent(view.getContext(),Manifestrps.class);
                    startActivity(rm);
                }
                else if (i == 1) {
                    Intent rx = new Intent(view.getContext(),XMLrps.class);
                    startActivity(rx);
                }
                else if (i == 2) {
                    Intent rj = new Intent(view.getContext(),Javarps.class);
                    startActivity(rj);
                }
            }
        });
    }

}
