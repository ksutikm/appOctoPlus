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
import com.example.workvesion.entrance.CountsPlaces;
import com.example.workvesion.entrance.Deadlines;
import com.example.workvesion.entrance.Documents;
import com.example.workvesion.entrance.Ways;

public class FragmentEqualize extends Fragment implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_equalize, container, false);

        TextView tv_balls = view.findViewById(R.id.tv_balls);
        TextView tv_no_balls = view.findViewById(R.id.tv_no_balls);

        tv_balls.setOnClickListener(this);
        tv_no_balls.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_balls:
                startActivity(new Intent(getActivity(), Balls.class));
                break;
            case R.id.tv_no_balls:
                startActivity(new Intent(getActivity(), NoBalls.class));
                break;
        }
    }
}
