package com.example.asus.listview_kevin_ortiz;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by root on 28/09/17.
 */

public class Volumenes extends AppCompatActivity {

    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_volumenes);
        lv = (ListView)findViewById(R.id.opc_vol);
        resources= this.getResources();
        opc = resources.getStringArray(R.array.Menu_Volumenes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                switch (i){
                    case 0:
                        in = new Intent(Volumenes.this,Esfera.class);
                        startActivity(in);
                        break;

                    case 1:
                        in = new Intent(Volumenes.this,Cilindro.class);
                        startActivity(in);
                        break;

                    case 2:
                        in = new Intent(Volumenes.this,Cono.class);
                        startActivity(in);
                        break;

                    case 3:
                        in = new Intent(Volumenes.this,Cubo.class);
                        startActivity(in);
                        break;



                }
            }
        }

        );
    }
}
