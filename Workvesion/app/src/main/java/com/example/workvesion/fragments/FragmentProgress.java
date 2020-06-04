package com.example.workvesion.fragments;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.workvesion.R;

public class FragmentProgress extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_progress, container, false);

        TextView tv_progress_text = view.findViewById(R.id.text_progress);
        tv_progress_text.setLinksClickable(true);
        tv_progress_text.setMovementMethod(LinkMovementMethod.getInstance());
        return view;
    }
}
