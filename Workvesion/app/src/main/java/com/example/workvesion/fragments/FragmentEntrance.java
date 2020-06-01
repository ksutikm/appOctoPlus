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
import com.example.workvesion.entrance.CountsPlaces;
import com.example.workvesion.entrance.Deadlines;
import com.example.workvesion.entrance.Documents;
import com.example.workvesion.entrance.Ways;
import com.example.workvesion.money.MatHelp;
import com.example.workvesion.money.Scholarship;

public class FragmentEntrance extends Fragment implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_entrance, container, false);

        TextView tv_documents = view.findViewById(R.id.tv_documents);
        TextView tv_deadlines = view.findViewById(R.id.tv_deadlines);
        TextView tv_ways = view.findViewById(R.id.tv_ways);
        TextView tv_counts_places = view.findViewById(R.id.tv_count_places);

        tv_documents.setOnClickListener(this);
        tv_deadlines.setOnClickListener(this);
        tv_ways.setOnClickListener(this);
        tv_counts_places.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_documents:
                startActivity(new Intent(getActivity(), Documents.class));
                break;
            case R.id.tv_deadlines:
                startActivity(new Intent(getActivity(), Deadlines.class));
                break;
            case R.id.tv_ways:
                startActivity(new Intent(getActivity(), Ways.class));
                break;
            case R.id.tv_count_places:
                startActivity(new Intent(getActivity(), CountsPlaces.class));
                break;
        }
    }
}
