package com.example.asus.listview_kevin_ortiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 29/09/17.
 */

public class Resultados extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Objeto> obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        tabla= (TableLayout)findViewById(R.id.tabla);
         obj = Datos.obtener();

        for (int i = 0;  i < obj.size(); i++){
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(obj.get(i).getOperaciones());
            c3.setText(obj.get(i).getResultados());
            c4.setText(obj.get(i).getDatos());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            tabla.addView(fila);

        }
    }
}

