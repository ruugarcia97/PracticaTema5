package com.example.ruugarcia.practicatema5;



import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityNotificacion extends AppCompatActivity {
    AppCompatActivity ActivityNotificacion;
    TextView txtTitulo;
    TextView txtTexto;
    TextView txtTiempo;
    Button btnLanzar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacion);
        ActivityNotificacion = this;

        txtTitulo = findViewById(R.id.txtTitulo);
        txtTexto = findViewById(R.id.txtTexto);
        txtTiempo = findViewById(R.id.txtTiempo);
        btnLanzar2 = findViewById(R.id.btnLanzar2);


        btnLanzar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder resultado = new NotificationCompat.Builder(ActivityNotificacion, "CH_ID");

                Intent i =  new Intent(ActivityNotificacion.this, ActivityNotificacion.class);

                PendingIntent contIntent =  PendingIntent.getActivity(ActivityNotificacion.this, 0, i, 0);

                resultado.setContentIntent(contIntent);

                resultado.setAutoCancel(true)
                        .setDefaults(Notification.DEFAULT_ALL)
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(android.R.drawable.star_on)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.apple))
                        .setContentTitle(txtTitulo.getText().toString())
                        .setContentText(txtTexto.getText().toString());



                NotificationManager notificacion = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificacion.notify(1,resultado.build());
                ;

            }
        });
    }
}
