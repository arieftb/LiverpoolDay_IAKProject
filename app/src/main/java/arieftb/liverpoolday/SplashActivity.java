package arieftb.liverpoolday;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView tvNameApp;
    ImageView ivLogoApp;
    ProgressBar pbLoadApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        tvNameApp = (TextView) findViewById(R.id.tv_nameApp);
        ivLogoApp = (ImageView) findViewById(R.id.iv_logoApp);
        pbLoadApp = (ProgressBar) findViewById(R.id.pb_loadApp);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(mIntent);
                finish();
            }
        },3000);
    }
}
