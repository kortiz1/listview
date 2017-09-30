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

public class Circulo extends AppCompatActivity {

    private Resources resources;
    private EditText Radio;
    private Intent in;
    private Bundle bun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.circulo);
        resources = this.getResources();

        Radio = (EditText) findViewById(R.id.txt_val_cir);
        in = new Intent(this, Circulo_Res.class);
        bun = new Bundle();
    }


    public void Calcular_Area_Cir(View v) {
        if (Validar()) {

            double n, r, pi= 3.141;
            n = Double.parseDouble((Radio.getText().toString()));
            r = (pi*(n*n));

            bun.putDouble("ÁREA", r);
            in.putExtras(bun);

            Objeto obj = new Objeto("ÁREA DEL CÍRC.", String.valueOf(r), "RADIO:" +Radio.getText().toString());
            obj.guardar();
           in = new Intent(Circulo.this, Circulo_Res.class);
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
