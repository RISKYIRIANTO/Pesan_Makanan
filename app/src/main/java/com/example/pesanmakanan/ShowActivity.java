package com.example.pesanmakanan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    ActionBar actionbar;
    TextView tvMakananName, tvMakananDetail;
    ImageView imgMakananLogo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        actionbar = getSupportActionBar();
        getSupportActionBar(). setDisplayHomeAsUpEnabled(true);

        tvMakananName = findViewById(R.id.show_makanan_nama);
        tvMakananDetail = findViewById(R.id.show_makanan_detail);
        imgMakananLogo = findViewById(R.id.show_makanan_logo);

        String name = getIntent().getStringExtra("name");
        String detail = getIntent().getStringExtra("detail");
        int logo = getIntent().getIntExtra("logo", R.mipmap.ic_launcher);

        tvMakananName.setText(name);
        tvMakananDetail.setText(detail);
        imgMakananLogo.setImageResource(logo);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}