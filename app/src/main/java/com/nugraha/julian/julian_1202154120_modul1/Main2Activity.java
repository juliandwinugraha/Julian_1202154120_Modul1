package com.nugraha.julian.julian_1202154120_modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView jumlahmakan;
    TextView hargamakan;
    TextView menumakan;
    TextView tempatmakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String aJml = intent.getStringExtra("Zporsimakan");
        String aMnu = intent.getStringExtra("Zmenumakan");
        String aTmp = intent.getStringExtra("Ztempatmakan");
        String aHrg = intent.getStringExtra("Zhargamakan");

        int zHrg = Integer.valueOf(aHrg)*Integer.valueOf(aJml);

        jumlahmakan =(TextView) findViewById(R.id.Zporsimakan);
        jumlahmakan.setText(aJml);
        tempatmakan =(TextView) findViewById(R.id.Ztempatmakan);
        tempatmakan.setText(aTmp);
        menumakan = (TextView) findViewById(R.id.Zmenumakan);
        menumakan.setText(aMnu);
        hargamakan = (TextView) findViewById(R.id.Zhargamakan);
        hargamakan.setText(String.valueOf(zHrg));

    if(zHrg > 65000){
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "Jan Malam Malam Di sini! Uang Kamu Tidak Cukup", Toast.LENGTH_LONG);
        toast.show();

    }else{
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "Makan Malam Di Sini Aja Nih", Toast.LENGTH_LONG);
        toast.show();
    }
    }
}
