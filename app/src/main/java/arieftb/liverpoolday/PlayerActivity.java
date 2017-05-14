package arieftb.liverpoolday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PlayerActivity extends AppCompatActivity {

    ListView lvPlayer;
    private String[] listPlayer = new String[] {"Mignolet","Moreno","Milner","Mane","Coutinho"};
    private int[] listNumber = new int[] {22,18,7,19,10};
    private String[] listAsal = new String[] {"Belgia", "Spanyol", "Inggris", "Senegal", "Brazil"};
    private int[] listGambar = new int[] {R.drawable.lfclogo, R.drawable.lfclogo,R.drawable.lfclogo,
            R.drawable.lfclogo,R.drawable.lfclogo};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        getSupportActionBar().setTitle("Player");

        lvPlayer = (ListView) findViewById(R.id.lv_player);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, listPlayer);

        lvPlayer.setAdapter(mAdapter);

        lvPlayer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Click " + listPlayer[position], Toast.LENGTH_LONG).show();

                Bundle mBundle = new Bundle();
                mBundle.putString("lPlayer", listPlayer[position].toString());
                mBundle.putString("lNumber", String.valueOf(listNumber[position]));
                mBundle.putString("lAsal", listAsal[position].toString());
                mBundle.putInt("lGambar", listGambar[position]);
                Intent mIntent = new Intent(getApplicationContext(),DetailPlayerActivity.class);
                mIntent.putExtras(mBundle);
                startActivity(mIntent);
            }
        });
    }
}
