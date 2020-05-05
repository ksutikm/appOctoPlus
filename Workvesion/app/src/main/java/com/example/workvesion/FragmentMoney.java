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

        TextView tv_money_b = view.findViewById(R.id.pgas);
        tv_money_b.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pgas:
                //Toast.makeText(getActivity(), "PGAS", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), MoneyB.class));
                break;
        }
    }
}
