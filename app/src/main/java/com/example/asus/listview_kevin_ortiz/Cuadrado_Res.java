package com.example.asus.listview_kevin_ortiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by root on 29/09/17.
 */

public class Cuadrado_Res extends AppCompatActivity {


   private TextView resp;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuadrado_resp);
        resp = (TextView)findViewById(R.id.LblCr);
        Bundle bun = this.getIntent().getExtras();
        Double ar = bun.getDouble("KEY");
        resp.setText(String.valueOf(ar));

    }

    public void Reg_Cua(View v){

        in = new Intent(this, Principal.class);
        startActivity(in);

    }
}
