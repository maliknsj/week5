package com.books.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter=0;

    Button incre,decr,send;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        incre=findViewById(R.id.increment);
        decr=findViewById(R.id.decrement);
        send=findViewById(R.id.send);
        text=findViewById(R.id.text);
        text.setText(counter+"");

        incre.setOnClickListener(new MyIncrementListerner());

        decr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                text.setText(counter+"");
            }
        });


    }

    public void onIncrement(){

    }
    public class MyIncrementListerner implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            counter++;
            text.setText(counter+"");
        }
    }
}