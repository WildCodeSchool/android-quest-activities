package fr.wildcodeschool.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSend = findViewById(R.id.buttonSend);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editLogin = findViewById(R.id.editLogin);
                String login = editLogin.getText().toString();
                Intent goToHome = new Intent(MainActivity.this, HomeActivity.class);
                goToHome.putExtra("EXTRA_LOGIN", login);
                startActivity(goToHome);
            }
        });
    }
}
