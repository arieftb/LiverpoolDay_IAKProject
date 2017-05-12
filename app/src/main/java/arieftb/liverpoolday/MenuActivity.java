package arieftb.liverpoolday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    TextView tvMenuSchedule, tvMenuPlayer;
    ImageView ivMenuSchedule, ivMenuPlayer;
    LinearLayout llMenuSchedule, llMenuPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().setTitle("Menu");

        tvMenuSchedule = (TextView) findViewById(R.id.tv_menuSchedule);
        tvMenuPlayer = (TextView) findViewById(R.id.tv_menuPlayer);
        ivMenuSchedule = (ImageView) findViewById(R.id.iv_menuSchedule);
        ivMenuPlayer = (ImageView) findViewById(R.id.iv_menuPlayer);
        llMenuSchedule = (LinearLayout) findViewById(R.id.ll_menuSchedule);
        llMenuPlayer = (LinearLayout) findViewById(R.id.ll_menuPlayer);

        llMenuSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pindah ke ScheduleActivity", Toast.LENGTH_SHORT).show();

//                Intent mIntent = new Intent(getApplicationContext(), ScheduleActivity.class);
//                startActivity(mIntent);
            }
        });

        llMenuPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pindah ke PlayerActivity", Toast.LENGTH_LONG).show();

                Intent mIntent = new Intent(getApplicationContext(), PlayerActivity.class);
                startActivity(mIntent);
            }
        });

    }
}
