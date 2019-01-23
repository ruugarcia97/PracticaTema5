package com.example.ruugarcia.practicatema5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View;

public class ActivityToast extends AppCompatActivity {
    EditText txtToast;
    EditText txtDHorizontal;
    EditText txtDVertical;
    RadioGroup RGHorizontal;
    RadioGroup RGVertical;
    int GravityH;
    int GravityV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void mostrar(View view) {

        txtToast = findViewById(R.id.txtTextoToast);
        txtDHorizontal =  findViewById(R.id.txtHorizontal);
        txtDVertical = findViewById(R.id.txtVertical);
        RGHorizontal =  findViewById(R.id.RGHorizontal);
        RGVertical = findViewById(R.id.RGVertical);

        int i = RGHorizontal.indexOfChild(findViewById(RGHorizontal.getCheckedRadioButtonId()));
        RadioButton r = (RadioButton) RGHorizontal.getChildAt(i);

        String a = r.getText().toString();

        i = RGVertical.indexOfChild(findViewById(RGVertical.getCheckedRadioButtonId()));
        r = (RadioButton) RGVertical.getChildAt(i);
        String selectedtext2 = r.getText().toString();


        if(a.equals("Izquierda"))
        {
            GravityH = 3;
        }
        else if(a.equals("Derecha"))
        {
            GravityH = 5;
        }
        else
        {
            GravityH = 1;
        }

        if(selectedtext2.equals("Arriba"))
        {
            GravityV = 48;
        }
        else if(selectedtext2.equals("Centro"))
        {
            GravityV = 16;
        }
        else
        {
            GravityV = 80;
        }


        Toast to = Toast.makeText(this, txtToast.getText(), Toast.LENGTH_LONG);
        to.setGravity(GravityV|GravityH,(Integer.parseInt(txtDHorizontal.getText().toString())), (Integer.parseInt(txtDVertical.getText().toString())));
        to.show();

    }
}
