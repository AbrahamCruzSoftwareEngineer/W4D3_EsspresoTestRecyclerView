package com.evolutiondso.www.w4d3_esspresotestrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private ArrayList<String> mArrayList;
    //    private SimpleAdapter mSimpleAdapter;
    private RecyclerViewAdapter mSimpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mArrayList = new ArrayList<>();
        mSimpleAdapter = new RecyclerViewAdapter(mArrayList);


        mRecyclerView = (RecyclerView) findViewById(R.id.a_main_recycler);
        mRecyclerView.setAdapter(mSimpleAdapter);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));



        mArrayList.add("Will");
        mArrayList.add("Tocayo");
        mArrayList.add("Edwin");
        mArrayList.add("Dani");
        mArrayList.add("Pepe");
        mArrayList.add("Raul");
        mArrayList.add("Abe");
        mSimpleAdapter.notifyDataSetChanged();
    }

}
