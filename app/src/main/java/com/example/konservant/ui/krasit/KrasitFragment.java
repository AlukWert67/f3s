package com.example.konservant.ui.krasit;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.konservant.R;
import com.example.konservant.act2;
import com.example.konservant.act3;

public class KrasitFragment extends Fragment {
public static int id1;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_krasit, container, false);

        ListView listView = root.findViewById(R.id.listView);

// определяем строковый массив
        final String[] Names = new String[] {
                "E100", "E101", "E102", "E103", "E104",
                "E105",  "E106",  "E107", "E108", "E109", "E110", "E111", "E120",
                "E121", "E122", "E123", "E124", "E125", "E126", "E127", "E128", "E129"
        };

// используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( getContext(), android.R.layout.simple_list_item_1, Names);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                id1 = parent.getPositionForView(itemClicked);
                Intent intent = new Intent(getContext(), act3.class);
                startActivity(intent);

            }
        });

        return root;
    }
}