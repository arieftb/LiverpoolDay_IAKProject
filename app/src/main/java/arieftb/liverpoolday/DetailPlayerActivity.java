package arieftb.liverpoolday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPlayerActivity extends AppCompatActivity {

    TextView tvPlayerName, tvPlayerNomor, tvPlayerAsal;
    ImageView ivPlayerGambar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_player);

        Bundle mBundle = getIntent().getExtras();

        getSupportActionBar().setTitle(mBundle.getString("lPlayer"));


        tvPlayerName = (TextView) findViewById(R.id.tv_playerName);
        tvPlayerNomor = (TextView) findViewById(R.id.tv_playerNo);
        tvPlayerAsal = (TextView) findViewById(R.id.tv_playerAsal);
        ivPlayerGambar = (ImageView) findViewById(R.id.iv_profilGambar);

        tvPlayerName.setText(mBundle.getString("lPlayer"));
        tvPlayerNomor.setText(mBundle.getString("lNumber"));
        tvPlayerAsal.setText(mBundle.getString("lAsal"));
        ivPlayerGambar.setImageResource(mBundle.getInt("lGambar"));



    }
}
