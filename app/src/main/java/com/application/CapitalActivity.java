package com.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {


    private TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);



        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String capital = bundle.getString("capital");
            tvText = findViewById(R.id.tvText);
            tvText.setText(capital);
        }
        else
        {
            Toast.makeText(this, "No Message", Toast.LENGTH_SHORT).show();
        }
    }




}
