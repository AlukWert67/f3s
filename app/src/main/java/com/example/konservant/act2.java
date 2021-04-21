package com.example.konservant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.konservant.ui.aroma.aromaFragment;

public class act2 extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int [] nazv={R.string.n0,R.string.n1};
        int [] opis={R.string.op0,R.string.op1};
        int[]opasn={R.string.opsn0,R.string.opsn1};
        int[]zakon={R.string.zkn0,R.string.zkn1};

        setContentView(R.layout.act2);
        TextView nazv1=(TextView) findViewById(R.id.toolbartext);
        nazv1.setText(getResources().getString(nazv[aromaFragment.id1]));

        TextView opis1=(TextView) findViewById(R.id.text_ghk1);
        opis1.setText(getResources().getString(opis[aromaFragment.id1]));

        TextView opasn1=(TextView) findViewById(R.id.text_ghk2);
        opasn1.setText(getResources().getString(opasn[aromaFragment.id1]));

        TextView zkn=(TextView) findViewById(R.id.text_ghk3);
        zkn.setText(getResources().getString(zakon[aromaFragment.id1]));

    }
}
