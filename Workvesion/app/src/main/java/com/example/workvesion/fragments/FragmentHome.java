package com.example.workvesion.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.workvesion.R;
import com.example.workvesion.balls.Balls;
import com.example.workvesion.balls.NoBalls;
import com.example.workvesion.dormitory.DormitoryA;
import com.example.workvesion.dormitory.DormitoryB;
import com.example.workvesion.dormitory.DormitoryC;

public class FragmentHome extends Fragment implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        TextView tv_dormitory_a = view.findViewById(R.id.tv_dormitory_a);
        TextView tv_dormitory_b = view.findViewById(R.id.tv_dormitory_b);
        TextView tv_dormitory_c = view.findViewById(R.id.tv_dormitory_c);

        tv_dormitory_a.setOnClickListener(this);
        tv_dormitory_b.setOnClickListener(this);
        tv_dormitory_c.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_dormitory_a:
                startActivity(new Intent(getActivity(), DormitoryA.class));
                break;
            case R.id.tv_dormitory_b:
                startActivity(new Intent(getActivity(), DormitoryB.class));
                break;
            case R.id.tv_dormitory_c:
                startActivity(new Intent(getActivity(), DormitoryC.class));
                break;
        }
    }
}
