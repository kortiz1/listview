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

public class Cubo extends AppCompatActivity {

    private Resources resources;
    private EditText Arista;
    private Intent in;
    private Bundle bun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cubo);
        resources = this.getResources();

        Arista = (EditText) findViewById(R.id.txt_val_cub);
        in = new Intent(this, Cubo_Res.class);
        bun = new Bundle();
    }


    public void Calcular_Area_Cub(View v) {
        if (Validar()) {
            double n, r;
            n = Double.parseDouble((Arista.getText().toString()));
            r = (Math.pow(n,3));
            bun.putDouble("VOL", r);
            in.putExtras(bun);

            Objeto obj = new Objeto("VOL. DEL CUB.", String.valueOf(r), "ARISTA:" +Arista.getText().toString());
            obj.guardar();
           in = new Intent(Cubo.this, Cubo_Res.class);
           in.putExtra("KEY", r);
            startActivity(in);


        }
    }


    public void borrar(View v) {

        Arista.setText("");
        Arista.requestFocus();

    }


    public boolean Validar() {
        if (Arista.getText().toString().equals("")){
            Toast.makeText(this, resources.getString(R.string.msn_err), Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}
