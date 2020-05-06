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


        TextView tv_mat_help = view.findViewById(R.id.mat_help);
        TextView tv_money = view.findViewById(R.id.tv_money);

        tv_mat_help.setOnClickListener(this);
        tv_money.setOnClickListener(this);



        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mat_help:
                startActivity(new Intent(getActivity(), MatHelp.class));
                break;
            case R.id.tv_money:
                startActivity(new Intent(getActivity(), Scholarship.class));
                break;
        }
    }
}
