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

public class Rectangulo extends AppCompatActivity {

    private Resources resources;
    private EditText Altura, Base;
    private Intent in;
    private Bundle bun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangulo);
        resources = this.getResources();

        Base = (EditText) findViewById(R.id.txt_val_rect_bas);
        Altura = (EditText) findViewById(R.id.txt_val_rect_alt);

        in = new Intent(this, Rectangulo_Res.class);
        bun = new Bundle();
    }


    public void Calcular_Area_Rect(View v) {
        if (Validar()) {
            double r, b, a;
            String  s;
            b = Double.parseDouble((this.Base.getText().toString()));
            a = Double.parseDouble(this.Altura.getText().toString());
            r = (b*a);
            bun.putDouble("ÁREA", r);
            in.putExtras(bun);
            s =  " B:" + b +" ;"+ " A:" + a + " ";
            Objeto obj = new Objeto("ÁREA DEL RECT.", String.valueOf(r), s);
            obj.guardar();
           in = new Intent(Rectangulo.this, Rectangulo_Res.class);
           in.putExtra("KEY", r);
            startActivity(in);


        }
    }


    public void borrar(View v) {

        Base.setText("");
        Altura.setText("");
        Base.requestFocus();


    }


    public boolean Validar() {
        if (Base.getText().toString().equals("") || Altura.getText().toString().equals("")){
            Toast.makeText(this, resources.getString(R.string.msn_err), Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}
