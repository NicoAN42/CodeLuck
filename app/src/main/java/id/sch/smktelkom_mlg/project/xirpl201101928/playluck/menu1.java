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

public class menu1 extends AppCompatActivity {

    String[] pilih = {
            "Code",
            "Program"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1);

        ListView listView = (ListView) findViewById(R.id.pilihan);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pilih);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pilih = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(view.getContext(), "You'll see the " +pilih+ " of Basic Widget", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
