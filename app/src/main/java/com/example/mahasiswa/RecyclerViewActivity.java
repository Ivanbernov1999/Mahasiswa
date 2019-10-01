package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mahasiswa.Adapter.MahasiswaAdapter;
import com.example.mahasiswa.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        recyclerView = findViewById(R.id.rvMahasiswa);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }

    private void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("ivan bernov",
                "72170149", "08213123123"));
        mahasiswaArrayList.add(new Mahasiswa("daniel surya nugraha",
                "72170199", "08928132312"));
        mahasiswaArrayList.add(new Mahasiswa("Libra lionrico",
                "72170999", "08962312312"));
        mahasiswaArrayList.add(new Mahasiswa("emma norren", "72170097",
                "0892313124"));
        mahasiswaArrayList.add(new Mahasiswa("Ninja Saga",
                "02312312", "0823213123"));
        mahasiswaArrayList.add(new Mahasiswa("Lost SAGA",
                "99983132", "877312371"));

    }

}
