package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CodeButter extends AppCompatActivity {

    String[] listViewbtr = {
            "Manifest",
            "XML",
            "Java"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codebutter);

        ListView listView = (ListView) findViewById(R.id.listViewbtr);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listViewbtr);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pilih = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(view.getContext(), "You'll see the " + pilih + " code of Butter Knife & Data Binding", Toast.LENGTH_SHORT).show();

                if (i == 0) {
                    Intent bm = new Intent(view.getContext(),Manifestbtr.class);
                    startActivity(bm);
                }
                else if (i == 1) {
                    Intent bx = new Intent(view.getContext(),XMLbtr.class);
                    startActivity(bx);
                }
                else if (i == 2) {
                    Intent bj = new Intent(view.getContext(),Javabtr.class);
                    startActivity(bj);
                }
            }
        });
    }

}
