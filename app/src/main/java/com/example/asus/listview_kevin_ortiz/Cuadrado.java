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

public class Cuadrado extends AppCompatActivity {

    private Resources resources;
    private EditText Lado;
    private Intent in;
    private Bundle bun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuadrado);
        resources = this.getResources();

        Lado = (EditText) findViewById(R.id.txt_val_cua);
        in = new Intent(this, Cuadrado_Res.class);
        bun = new Bundle();
    }


    public void Calcular_Area(View v) {
        if (Validar()) {
            double n, r;
            n = Double.parseDouble((Lado.getText().toString()));
            r = (n * n);
            bun.putDouble("ÁREA", r);
            in.putExtras(bun);

            Objeto obj = new Objeto("ÁREA DEL CUADR.", String.valueOf(r), "LADO:" +Lado.getText().toString());
            obj.guardar();
           in = new Intent(Cuadrado.this, Cuadrado_Res.class);
           in.putExtra("KEY", r);
            startActivity(in);


        }
    }


    public void borrar(View v) {

        Lado.setText("");
        Lado.requestFocus();

    }


    public boolean Validar() {
        if (Lado.getText().toString().equals("")){
            Toast.makeText(this, resources.getString(R.string.msn_err), Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}
