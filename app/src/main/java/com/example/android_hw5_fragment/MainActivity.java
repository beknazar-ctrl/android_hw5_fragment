package com.example.android_hw5_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    RecyclerView recyclerView;
//    MainAdapter adapter;
//    ArrayList<ItemModel>list;
    Button pervoe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
//       recyclerView=findViewById(R.id.rec_v);
//       adapter=new MainAdapter();
//       recyclerView.setAdapter(adapter);
//
//       RecyclerView.LayoutManager manager=
//               new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//
//       recyclerView.setLayoutManager(manager);
//
//       list=new ArrayList<>();
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
//       adapter.addText(list);

    }
    private void initButton(){
        pervoe=findViewById(R.id.pervoe);
        pervoe.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager;
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.consl,FragmentTest.newInstance("value 1","value2"));
                transaction.commit();
            }
        });



    }



    }




