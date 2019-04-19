package com.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {

    CircleImageView circImg;
    TextView tvFullName, tvPhoneNo, tvEmail, tvLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circImg = findViewById(R.id.circImg);
        tvFullName = findViewById(R.id.tvFullName);
        tvPhoneNo = findViewById(R.id.tvPhoneNo);
        tvEmail = findViewById(R.id.tvEmail);
        tvLocation = findViewById(R.id.tvLoaction);

        Bundle bundle = getIntent().getExtras();

        if (bundle !=null){
            circImg.setImageResource(bundle.getInt("image"));
            tvFullName.setText(bundle.getString("name"));
            tvPhoneNo.setText(bundle.getString("phone"));
            tvEmail.setText(bundle.getString("email"));
            tvLocation.setText(bundle.getString("location"));
        }
    }
}
