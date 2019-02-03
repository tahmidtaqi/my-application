package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginButton;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton=(Button)findViewById(R.id.loginbuttonid);
        textView=(TextView)findViewById(R.id.textviewid);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Login button is clicked");
                Toast toast=Toast.makeText(MainActivity.this,"Login button is clicked",Toast.LENGTH_SHORT);
                 toast.setGravity(Gravity.CENTER,0,0);
                 toast.show();
            }
        });


    }


}
