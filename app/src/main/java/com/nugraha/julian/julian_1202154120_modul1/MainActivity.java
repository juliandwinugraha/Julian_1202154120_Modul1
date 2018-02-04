package com.nugraha.julian.julian_1202154120_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Scene;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.transition.TransitionManager;

public class MainActivity extends AppCompatActivity {

    EditText porsi;
    EditText menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        porsi = (EditText) findViewById(R.id.Zporsimakan);
        String jumlah = porsi.getText().toString();
        menu = (EditText) findViewById(R.id.Zmenumakan);
        String makan = menu.getText().toString();
        intent.putExtra("Ztempatmakan","Eatbus");
        intent.putExtra("Zmenumakan",makan);
        intent.putExtra("Zporsimakan",jumlah);
        intent.putExtra("Zhargamakan","50000");
        startActivity(intent);

    }


    public void ABNORMAL(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        porsi = (EditText) findViewById(R.id.Zporsimakan);
        String jumlah = porsi.getText().toString();
        menu = (EditText) findViewById(R.id.Zmenumakan);
        String makan = menu.getText().toString();
        intent.putExtra("Ztempatmakan","Abnormal");
        intent.putExtra("Zmenumakan",makan);
        intent.putExtra("Zporsimakan",jumlah);
        intent.putExtra("Zhargamakan","30000");
        startActivity(intent);
    }
}
