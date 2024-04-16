package br.com.app1.aula1504_recycleview_pt1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import br.com.app1.aula1504_recycleview_pt1.adapter.Adapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recyclerView do mainxml
        recyclerView = findViewById(R.id.recyclerView);

        //2 adapter
        Adapter adapter = new Adapter();
        //instaciar o layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //setar o layout manager
         recyclerView.setLayoutManager(layoutManager);
         //otimizar o desempenho
         recyclerView.setHasFixedSize(true);
         //passar o adapter para o recycler view
         recyclerView.setAdapter(adapter);
    }
}