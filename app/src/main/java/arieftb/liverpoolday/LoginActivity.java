package arieftb.liverpoolday;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    ImageView ivLogoApp;
    EditText edUsername, edPassword;
    Button btnLogin, btnRegister;

    private final String USERNAME = "admin";
    private final String PASSWORD = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("Login");

        ivLogoApp = (ImageView) findViewById(R.id.iv_logoApp);
        edUsername = (EditText) findViewById(R.id.ed_username);
        edPassword = (EditText) findViewById(R.id.ed_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegister = (Button) findViewById(R.id.btn_register);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((edUsername.getText().toString().equals("")) ||  (edPassword.getText().toString().equals(""))) {
                    Toast.makeText(getApplicationContext(), "Isian Belum Lengkap", Toast.LENGTH_LONG).show();
                }
                else if((edUsername.getText().toString().equals(USERNAME)) ||  (edPassword.getText().toString().equals(PASSWORD))){
                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();
                    Intent mIntent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(mIntent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
