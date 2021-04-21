package com.example.konservant;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.konservant.ui.aroma.aromaFragment;
import com.example.konservant.ui.krasit.KrasitFragment;

public class act3 extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int[] nazv={R.string.n_k_0,R.string.n_k_1,R.string.n_k_2,R.string.n_k_3,R.string.n_k_4,R.string.n_k_5,R.string.n_k_6,R.string.n_k_7,R.string.n_k_8,R.string.n_k_9,R.string.n_k_10,R.string.n_k_11,R.string.n_k_12,R.string.n_k_13,R.string.n_k_14,R.string.n_k_15,R.string.n_k_16,R.string.n_k_17,R.string.n_k_18,R.string.n_k_19,R.string.n_k_20,R.string.n_k_21};
        int [] opis={R.string.op_k_0,R.string.op_k_1,R.string.op_k_2,R.string.op_k_3,R.string.op_k_4,R.string.op_k_5,R.string.op_k_6,R.string.op_k_7,R.string.op_k_8,R.string.op_k_9,R.string.op_k_10,R.string.op_k_11,R.string.op_k_12,R.string.op_k_13,R.string.op_k_14,R.string.op_k_15,R.string.op_k_16,R.string.op_k_17,R.string.op_k_18,R.string.op_k_19,R.string.op_k_20,R.string.op_k_21};
        int[]opasn={R.string.opsn_k_0,R.string.opsn_k_1,R.string.opsn_k_2,R.string.opsn_k_3,R.string.opsn_k_4,R.string.opsn_k_5,R.string.opsn_k_6,R.string.opsn_k_7,R.string.opsn_k_8,R.string.opsn_k_9,R.string.opsn_k_10,R.string.opsn_k_11,R.string.opsn_k_12,R.string.opsn_k_13,R.string.opsn_k_14,R.string.opsn_k_15,R.string.opsn_k_16,R.string.opsn_k_17,R.string.opsn_k_18,R.string.opsn_k_19,R.string.opsn_k_20,R.string.opsn_k_21};
        int[]zakon={R.string.zkn_k_0,R.string.zkn_k_1,R.string.zkn_k_2,R.string.zkn_k_3,R.string.zkn_k_4,R.string.zkn_k_5,R.string.zkn_k_6,R.string.zkn_k_7,R.string.zkn_k_8,R.string.zkn_k_9,R.string.zkn_k_10,R.string.zkn_k_11,R.string.zkn_k_12,R.string.zkn_k_13,R.string.zkn_k_14,R.string.zkn_k_15,R.string.zkn_k_16,R.string.zkn_k_17,R.string.zkn_k_18,R.string.zkn_k_19,R.string.zkn_k_20,R.string.zkn_k_21};

        setContentView(R.layout.act3);
        TextView nazv1=(TextView) findViewById(R.id.toolbartext);
        nazv1.setText(getResources().getString(nazv[KrasitFragment.id1]));

        TextView opis1=(TextView) findViewById(R.id.text_ghk1);
        opis1.setText(getResources().getString(opis[KrasitFragment.id1]));
        opis1.setMovementMethod(new ScrollingMovementMethod());

        TextView opasn1=(TextView) findViewById(R.id.text_ghk2);
        opasn1.setText(getResources().getString(opasn[KrasitFragment.id1]));
        opasn1.setMovementMethod(new ScrollingMovementMethod());

        TextView zkn=(TextView) findViewById(R.id.text_ghk3);
        zkn.setText(getResources().getString(zakon[KrasitFragment.id1]));
        zkn.setMovementMethod(new ScrollingMovementMethod());

    }
}
