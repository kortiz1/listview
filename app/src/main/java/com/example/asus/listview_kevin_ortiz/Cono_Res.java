package com.example.asus.listview_kevin_ortiz;

/**
 * Created by ASUS on 30/09/2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class Cono_Res extends AppCompatActivity {


    private TextView resp;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cono_resp);
        resp = (TextView)findViewById(R.id.LblCo);
        Bundle bun = this.getIntent().getExtras();
        Double ar = bun.getDouble("KEY");
        resp.setText(String.valueOf(ar));

    }

    public void Reg_Con(View v){

        in = new Intent(this, Principal.class);
        startActivity(in);

    }
}
