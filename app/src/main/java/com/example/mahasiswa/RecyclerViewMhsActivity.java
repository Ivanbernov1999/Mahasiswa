package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mahasiswa.Adapter.MahasiswaAdapter;
import com.example.mahasiswa.Adapter.MahasiswaSiAdapter;
import com.example.mahasiswa.Model.Mahasiswa;
import com.example.mahasiswa.Model.MahasiswaSI;

import java.util.ArrayList;

public class RecyclerViewMhsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaSiAdapter mhsSIAdapter;
    private ArrayList<MahasiswaSI> mhsSIArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_mhs);

        addData();

        recyclerView = findViewById(R.id.rvMahasiswa);
        mhsSIAdapter = new MahasiswaSiAdapter(mhsSIArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewMhsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mhsSIAdapter);
    }
    private  void addData(){
        mhsSIArrayList =  new ArrayList<>();
        mhsSIArrayList.add(new MahasiswaSI("Daniel Surya Nugraha","72170117","ngegame"," jadi orang kaya","kami tidak pernah meragukan tamu meski permintaannya yang aneh aneh",R.drawable.daniel));
        mhsSIArrayList.add(new MahasiswaSI("Emma Norren Cahya Putri","72170097","melukis","pengusaha di bidang fashion","stop dreaming start doing",R.drawable.emma));
        mhsSIArrayList.add(new MahasiswaSI("Friska Nainggolan","72170157","menggsmbar","punya banyak anjing","let's life without regret",R.drawable.friska));
        mhsSIArrayList.add(new MahasiswaSI("Cyhintia Kumalasari","72170101","Tidur","Membahagiakan Ortu","Terus Berusaha",R.drawable.cynkum));
    }

}
