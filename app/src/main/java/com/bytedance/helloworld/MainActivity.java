package com.bytedance.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button1);
        final TextView tv1 = findViewById(R.id.tv1);
        Switch switchTest = findViewById(R.id.switch1);
        final ImageView view2 = findViewById(R.id.imageView2);
        final ImageView view1 = findViewById(R.id.imageView);
        final ScrollView sv1 = findViewById(R.id.scrollView2);
        Spinner spinnerTest = findViewById(R.id.spinner);

        spinnerTest.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //String info=adapterView.getItemAtPosition(i).toString();//获取i所在的文本
                if(i == 0){
                    view1.setImageResource(R.mipmap.s1);
                    sv1.scrollTo(0,0);
                }
                if(i == 1){
                    view1.setImageResource(R.mipmap.s2);
                    sv1.scrollTo(0,0);
                }
                if(i == 2){
                    view1.setImageResource(R.mipmap.s3);
                    sv1.scrollTo(0,0);
                }
                if(i == 3){
                    view1.setImageResource(R.mipmap.s4);
                    sv1.scrollTo(0,0);
                }
                if(i == 4){
                    view1.setImageResource(R.mipmap.s5);
                    sv1.scrollTo(0,0);
                }
                if(i == 5){
                    view1.setImageResource(R.mipmap.s6);
                    sv1.scrollTo(0,0);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View v){
                tv1.setText("What a wonderful world!");
            }
        });
        switchTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.d(TAG,"switch-select=" + b);
                if(b == false){
                    view2.setVisibility(View.VISIBLE);
                }
                else{
                    view2.setVisibility(View.INVISIBLE);
                }
            }
        });


        Log.d(TAG, "MainActivity");
    }
}
