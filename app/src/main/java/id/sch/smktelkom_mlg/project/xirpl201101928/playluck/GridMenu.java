package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Aisyatush Shofiah on 03/12/2016.
 */

public class GridMenu extends AppCompatActivity{

    String[] mapel = {
            "Basic Widget",
            "Layout",
            "Butter Knife & Data Binding",
            "Intent",
            "Recycler View"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mapel);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String mapel = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(view.getContext(), "You'll learn " +mapel, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
