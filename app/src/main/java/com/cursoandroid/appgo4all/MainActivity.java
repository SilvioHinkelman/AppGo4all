package com.cursoandroid.appgo4all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CliqueAqui(View view){

        long tstamp = System.currentTimeMillis();
        String x = String.valueOf(tstamp);
        int q = x.length();
        String t = x.substring(x.length() - 1);

        switch (t){
            case "1":
               startActivity(new Intent(MainActivity.this, Color_1.class));
                break;
            case "2":
                startActivity(new Intent(MainActivity.this, Color_2.class));
            break;
            case "3":
                startActivity(new Intent(MainActivity.this, Color_3.class));
             break;
            case "4":
                startActivity(new Intent(MainActivity.this, Color_4.class));
                break;
            case "5":
                startActivity(new Intent(MainActivity.this, Color_5.class));
                break;
            case "6":
                startActivity(new Intent(MainActivity.this, Color_6.class));
                break;
            case "7":
                startActivity(new Intent(MainActivity.this, Color_7.class));
                break;
            case "8":
                startActivity(new Intent(MainActivity.this, Color_8.class));
                break;
            case "9":
                startActivity(new Intent(MainActivity.this, Color_9_.class));
                break;
            case "0":
                startActivity(new Intent(MainActivity.this, Color_0.class));
                break;
            default:
        }


    }

}