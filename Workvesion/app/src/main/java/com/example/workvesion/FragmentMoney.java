package com.example.workvesion;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentMoney extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_money, container, false);

        TextView tv_money_a = view.findViewById(R.id.money_a);
        TextView tv_money_b = view.findViewById(R.id.pgas);
        TextView tv_money_c = view.findViewById(R.id.money_c);
        TextView tv_money_d = view.findViewById(R.id.money_d);
        TextView tv_money_e = view.findViewById(R.id.money_e);
        TextView tv_money_f = view.findViewById(R.id.money_f);
        TextView tv_money_g = view.findViewById(R.id.money_g);
        tv_money_b.setOnClickListener(this);
        tv_money_a.setOnClickListener(this);
        tv_money_c.setOnClickListener(this);
        tv_money_d.setOnClickListener(this);
        tv_money_e.setOnClickListener(this);
        tv_money_f.setOnClickListener(this);
        tv_money_g.setOnClickListener(this);



        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pgas:
                //Toast.makeText(getActivity(), "PGAS", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), MoneyB.class));
                break;
            case R.id.money_a:
                startActivity(new Intent(getActivity(), MoneyA.class));
                break;
            case R.id.money_c:
                startActivity(new Intent(getActivity(), MoneyC.class));
                break;
            case R.id.money_d:
                startActivity(new Intent(getActivity(), MoneyD.class));
                break;
            case R.id.money_e:
                startActivity(new Intent(getActivity(), MoneyE.class));
                break;
            case R.id.money_f:
                startActivity(new Intent(getActivity(), MoneyF.class));
                break;
            case R.id.money_g:
                startActivity(new Intent(getActivity(), MoneyG.class));
                break;
        }
    }
}
