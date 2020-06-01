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
import com.example.workvesion.dormitory.DormitoryA;
import com.example.workvesion.dormitory.DormitoryB;
import com.example.workvesion.dormitory.DormitoryC;
import com.example.workvesion.useful.UsefulA;
import com.example.workvesion.useful.UsefulB;
import com.example.workvesion.useful.UsefulC;
import com.example.workvesion.useful.UsefulD;

public class FragmentAttachment extends Fragment implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_attachment, container, false);

        TextView tv_useful_a = view.findViewById(R.id.tv_useful_a);
        TextView tv_useful_b = view.findViewById(R.id.tv_useful_b);
        TextView tv_useful_c = view.findViewById(R.id.tv_useful_c);
        TextView tv_useful_d = view.findViewById(R.id.tv_useful_d);

        tv_useful_a.setOnClickListener(this);
        tv_useful_b.setOnClickListener(this);
        tv_useful_c.setOnClickListener(this);
        tv_useful_d.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_useful_a:
                startActivity(new Intent(getActivity(), UsefulA.class));
                break;
            case R.id.tv_useful_b:
                startActivity(new Intent(getActivity(), UsefulB.class));
                break;
            case R.id.tv_useful_c:
                startActivity(new Intent(getActivity(), UsefulC.class));
                break;
            case R.id.tv_useful_d:
                startActivity(new Intent(getActivity(), UsefulD.class));
                break;
        }
    }
}
