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

public class CodeInt extends AppCompatActivity {

    String[] listViewint = {
            "Manifest",
            "XML",
            "Java"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codeint);

        ListView listView = (ListView) findViewById(R.id.listViewint);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listViewint);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pilih = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(view.getContext(), "You'll see the " +pilih+ " code of Intent", Toast.LENGTH_SHORT).show();

                if (i == 0) {
                    Intent icm = new Intent(view.getContext(),Manifestint.class);
                    startActivity(icm);
                }
                else if (i == 1) {
                    Intent icx = new Intent(view.getContext(),XMLint.class);
                    startActivity(icx);
                }
                else if (i == 2) {
                    Intent icj = new Intent(view.getContext(),Javaint.class);
                    startActivity(icj);
                }
            }
        });
    }

}
