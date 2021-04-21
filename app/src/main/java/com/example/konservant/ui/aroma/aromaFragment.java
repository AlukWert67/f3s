package com.example.konservant.ui.aroma;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.konservant.*;
import com.example.konservant.R;


public class aromaFragment extends Fragment {
public static int id1;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_aroma, container, false);
        final TextView textView = root.findViewById(R.id.text_ghk);
        textView.setText(" ");
        ListView listView = root.findViewById(R.id.listView);

// определяем строковый массив
        final String[] Names = new String[] {
                "E620", "E621", "E622", "E623", "E624",
                "E625",  "E626",  "E627", "E628", "E629", "E630", "E631", "E632",
                "E633", "E634", "E635", "E636", "E637", "E640", "E641", "E642", "E650"
        };

// используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( getContext(), android.R.layout.simple_list_item_1, Names);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                id1 = parent.getPositionForView(itemClicked);
                Intent intent = new Intent(getContext(), act2.class);
                startActivity(intent);

            }
        });
        return root;
    }
}