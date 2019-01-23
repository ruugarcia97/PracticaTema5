package com.example.ruugarcia.practicatema5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnToast;
    Button btnNotificacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnToast =findViewById(R.id.btnToast);
        btnNotificacion =findViewById(R.id.btnNotificacion);


        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T = new Intent(MainActivity.this, ActivityToast.class);
                startActivity(T);
            }
        });


        btnNotificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent N = new Intent(MainActivity.this, ActivityNotificacion.class);
                startActivity(N);
            }
        });

    }
}
