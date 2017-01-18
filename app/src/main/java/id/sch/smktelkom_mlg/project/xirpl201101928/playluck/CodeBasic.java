package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CodeBasic extends AppCompatActivity {

    String[] listViewbsc = {
            "Manifest",
            "XML",
            "Java"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codebsc);

        ListView listView = (ListView) findViewById(R.id.listViewbc);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listViewbsc);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pilih = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(view.getContext(), "You'll see the " +pilih+ " code of Basic Widget", Toast.LENGTH_SHORT).show();

                if (i == 0) {
                    Intent bwcm = new Intent(view.getContext(),Manifestbsc.class);
                    startActivity(bwcm);
                }
                else if (i == 1) {
                    Intent bwcx = new Intent(view.getContext(),XMLbsc.class);
                    startActivity(bwcx);
                }
                else if (i == 2) {
                    Intent bwcj = new Intent(view.getContext(),Javabsc.class);
                    startActivity(bwcj);
                }
            }
        });
    }

}
