package com.mrhi2024.ex35activityrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items = new ArrayList<>();

    RecyclerView recyclerView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //대량의 데이터를 추가 -- 실무에서는 서버에서 가져올것임.
        items.add(new Item("헬켓01","벤치프레스",R.drawable.cat));
        items.add(new Item("헬켓02","스쾃",R.drawable.cat));
        items.add(new Item("헬켓03","핵스쾃",R.drawable.cat));
        items.add(new Item("헬켓04","킹데드",R.drawable.cat));
        items.add(new Item("헬켓05","인클라인",R.drawable.cat));

        recyclerView= findViewById(R.id.recycler_view);
        adapter= new MyAdapter(this,items);
        recyclerView.setAdapter(adapter);

    }
}