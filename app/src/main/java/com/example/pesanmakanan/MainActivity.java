package com.example.pesanmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements makananAdapter.OnClickShowListener {
    RecyclerView recMakananList;
    List<club> makananList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMakananList();

        recMakananList = findViewById(R.id.makanan_list);
        makananAdapter makananAdapter= new makananAdapter(this, makananList, this);
        recMakananList.setAdapter(makananAdapter);
        recMakananList.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initMakananList() {
        makananList = new ArrayList<>();
        makananList.add(new club("Mie Goreng Aceh", "Mie Goreng Aceh. Dimasak dengan bumbu asli dari aceh yang penuh dengan rempah dan dilengkapi dengan sayuran, telur, seafood dll. Memanjakan lidah anda, dibuat tanpa pengawet", R.drawable.mieaceh));
        makananList.add(new club("Mie Goreng", "Mie Goreng. Dimasak dengan bumbu rahasia dengan rempah yang terasa. dilengkapi dengan telur, sosis dan bakso. Akan memanjakan lidah anda", R.drawable.miegoreng));
        makananList.add(new club("Mie Rebus", "Mie Rebus. Dimasaka dengan bumbu rahasia dengan rempah rempah yang alami. dilengkapi dengan berbagai macam telur dan sosis serta rawit. Dijamin enakkkk", R.drawable.mierebus));
        makananList.add(new club("Nasi Goreng", "Nasi Goreng. Nasi goreng bisa anda pesan dengan rasa pedas atau sedang. dibuat dengan cabe rawit yang alami, rempah yang sedap. Dilengkapi dengan Rempah-rempah yang enak sesuai selera dan memanjakan lidah anda semuaa", R.drawable.nasigoreng));
    }

    @Override
    public void onClickShowListener(int position) {
        String name = makananList.get(position).getName();
        String detail = makananList.get(position).getDetail();
        int logo = makananList.get(position).getLogo();

        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("detail", detail);
        intent.putExtra("logo", logo);
        startActivity(intent);
    }
}