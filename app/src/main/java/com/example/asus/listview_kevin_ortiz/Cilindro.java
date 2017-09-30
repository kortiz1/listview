package com.example.asus.listview_kevin_ortiz;

/**
 * Created by ASUS on 30/09/2017.
 */
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cilindro extends AppCompatActivity {

    private Resources resources;
    private EditText Radio, Altura;
    private Intent in;
    private Bundle bun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cilindro);
        resources = this.getResources();

        Radio = (EditText) findViewById(R.id.txt_val_cil_rad);
        Altura = (EditText) findViewById(R.id.txt_val_cil_alt);

        in = new Intent(this, Cilindro_Res.class);
        bun = new Bundle();
    }


    public void Calcular_Vol_Cil(View v) {

//GUÍ PARA LA FORMULA VIA http://www.calcularelvolumen.com/cilindro.htm
        if (Validar()) {
            double r, rad, b, pi = 3.141;
            String s;
            rad = Double.parseDouble((this.Radio.getText().toString()));
            b = Double.parseDouble(this.Altura.getText().toString());
            r = ((pi * (rad * rad)) * b);
            r = Math.floor(r*100)/(100);
            bun.putDouble("VOL", r);
            in.putExtras(bun);
            s = " R:" + rad + " ;" + " B:" + b + " ";
            ;
            Objeto obj = new Objeto("VOL. DEL CILIN.", String.valueOf(r), s);
            obj.guardar();
            in = new Intent(Cilindro.this, Cilindro_Res.class);
            in.putExtra("KEY", r);
            startActivity(in);


        }
    }


    public void borrar(View v) {

        Radio.setText("");
        Altura.setText("");
        Radio.requestFocus();


    }


    public boolean Validar() {
        if (Radio.getText().toString().equals("") || Altura.getText().toString().equals("")) {
            Toast.makeText(this, resources.getString(R.string.msn_err), Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}