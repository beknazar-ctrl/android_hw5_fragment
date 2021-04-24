package com.example.android_hw5_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentTest extends Fragment {

    RecyclerView recyclerView;
    MainAdapter adapter;
    ArrayList<ItemModel> list;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    private String mParam1;
    private String mParam2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        recyclerView= view.findViewById(R.id.rec_v);
        adapter=new MainAdapter();
        recyclerView.setAdapter(adapter);



        RecyclerView.LayoutManager manager=
                new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(manager);

        list=new ArrayList<>();
        list.add(0,new ItemModel("Солянка","120",R.drawable.solyanka));
        list.add(0,new ItemModel("Грибной суп","120",R.drawable.gribnoi));
        list.add(0,new ItemModel("Борщ","100",R.drawable.bors));
        list.add(0,new ItemModel("Окрошка","110",R.drawable.okroshka));
        list.add(0,new ItemModel("Пельмени","120",R.drawable.pelmeni));
        list.add(0,new ItemModel("Лагман","150",R.drawable.lagman));

        adapter.addText(list);

        return  view;


    }
    public static FragmentTest newInstance(String param1, String param2) {
        FragmentTest fragment = new FragmentTest();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

}
}
