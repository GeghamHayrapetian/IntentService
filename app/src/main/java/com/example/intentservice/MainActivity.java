package com.example.intentservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.start);
        start.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        startService(new Intent(this,MyIntentService.class).putExtra("time", 3).putExtra("label", "Call 1") );
        startService(new Intent(this,MyIntentService.class).putExtra("time", 1).putExtra("label", "Call 2") );
        startService(new Intent(this,MyIntentService.class).putExtra("time", 4).putExtra("label", "Call 3") );

    }
}
