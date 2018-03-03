package com.example.bryan.a5by5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView a1;
    TextView a2;
    TextView a3;
    TextView a4;
    TextView a5;
    TextView a6;
    TextView a7;
    TextView a8;
    TextView a9;
    TextView a10;
    TextView a11;
    TextView a12;
    TextView a13;
    TextView a14;
    TextView a15;
    TextView a16;
    TextView a17;
    TextView a18;
    TextView a19;
    TextView a20;
    TextView a21;
    TextView a22;
    TextView a23;
    TextView a24;
    TextView a25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (TextView) findViewById(R.id.a1);
        a2 = (TextView) findViewById(R.id.a2);
        a3 = (TextView) findViewById(R.id.a3);
        a4 = (TextView) findViewById(R.id.a4);
        a5 = (TextView) findViewById(R.id.a5);
        a6 = (TextView) findViewById(R.id.a6);
        a7 = (TextView) findViewById(R.id.a7);
        a8 = (TextView) findViewById(R.id.a8);
        a9 = (TextView) findViewById(R.id.a9);
        a10 = (TextView) findViewById(R.id.a10);
        a11 = (TextView) findViewById(R.id.a11);
        a12 = (TextView) findViewById(R.id.a12);
        a13 = (TextView) findViewById(R.id.a13);
        a14 = (TextView) findViewById(R.id.a14);
        a15 = (TextView) findViewById(R.id.a15);
        a16 = (TextView) findViewById(R.id.a16);
        a17 = (TextView) findViewById(R.id.a17);
        a18 = (TextView) findViewById(R.id.a18);
        a19 = (TextView) findViewById(R.id.a19);
        a20 = (TextView) findViewById(R.id.a20);
        a21 = (TextView) findViewById(R.id.a21);
        a22 = (TextView) findViewById(R.id.a22);
        a23 = (TextView) findViewById(R.id.a23);
        a24 = (TextView) findViewById(R.id.a24);
        a25 = (TextView) findViewById(R.id.a25);

        Button reset = (Button) findViewById(R.id.button);

        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String[] nums = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"};
                ArrayList Numbers = new ArrayList<>(new ArrayList<>(Arrays.asList(nums)));
                Collections.shuffle(Numbers);
                System.out.println("Numbers = " + Numbers);
                a1.setText(Numbers.get(0).toString());
                a2.setText(Numbers.get(1).toString());
                a3.setText(Numbers.get(2).toString());
                a4.setText(Numbers.get(3).toString());
                a5.setText(Numbers.get(4).toString());
                a6.setText(Numbers.get(5).toString());
                a7.setText(Numbers.get(6).toString());
                a8.setText(Numbers.get(7).toString());
                a9.setText(Numbers.get(8).toString());
                a10.setText(Numbers.get(9).toString());
                a11.setText(Numbers.get(10).toString());
                a12.setText(Numbers.get(11).toString());
                a13.setText(Numbers.get(12).toString());
                a14.setText(Numbers.get(13).toString());
                a15.setText(Numbers.get(14).toString());
                a16.setText(Numbers.get(15).toString());
                a17.setText(Numbers.get(16).toString());
                a18.setText(Numbers.get(17).toString());
                a19.setText(Numbers.get(18).toString());
                a20.setText(Numbers.get(19).toString());
                a21.setText(Numbers.get(20).toString());
                a22.setText(Numbers.get(21).toString());
                a23.setText(Numbers.get(22).toString());
                a24.setText(Numbers.get(23).toString());
                a25.setText(Numbers.get(24).toString());

            }
        });







    }
}
