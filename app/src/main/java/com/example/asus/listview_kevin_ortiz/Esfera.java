package com.example.asus.listview_kevin_ortiz;


import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by root on 29/09/17.
 */

public class Esfera extends AppCompatActivity {

    private Resources resources;
    private EditText Radio;
    private Intent in;
    private Bundle bun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.esfera);
        resources = this.getResources();

        Radio = (EditText) findViewById(R.id.txt_val_esf);
        in = new Intent(this,Esfera_Res.class);
        bun = new Bundle();
    }


    public void Calcular_Vol_Esf(View v) {
        if (Validar()) {

            double n, r, pi= 3.141;
            n = Double.parseDouble((Radio.getText().toString()));
            r = ((4*pi)*(Math.pow(n,3))/3);
            r = Math.floor(r*100)/(100);
            bun.putDouble("VOL", r);
            in.putExtras(bun);

            Objeto obj = new Objeto("VOL. DE LA ESF.", String.valueOf(r), "RADIO:" +Radio.getText().toString());
            obj.guardar();
           in = new Intent(Esfera.this, Esfera_Res.class);
           in.putExtra("KEY", r);
            startActivity(in);


        }
    }


    public void borrar(View v) {

        Radio.setText("");
        Radio.requestFocus();

    }


    public boolean Validar() {
        if (Radio.getText().toString().equals("")){
            Toast.makeText(this, resources.getString(R.string.msn_err), Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}
