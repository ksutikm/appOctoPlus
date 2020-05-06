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
import com.example.workvesion.education.Attestation;
import com.example.workvesion.education.OrganizationOfPractice;
import com.example.workvesion.education.Questions;
import com.example.workvesion.education.SpecialOpportunity;
import com.example.workvesion.education.Transfer;
import com.example.workvesion.education.TuitionFees;

public class FragmentEducation extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_education, container, false);

        TextView tv_special_opportunity = view.findViewById(R.id.special_opportunity);
        TextView tv_transfer = view.findViewById(R.id.transfer);
        TextView tv_attestation = view.findViewById(R.id.attestation);
        TextView tv_questions = view.findViewById(R.id.questions);
        TextView tv_tuition_fees = view.findViewById(R.id.tuition_fees);
        TextView tv_organization_of_practice = view.findViewById(R.id.organization_of_practice);

        tv_special_opportunity.setOnClickListener(this);
        tv_transfer.setOnClickListener(this);
        tv_attestation.setOnClickListener(this);
        tv_questions.setOnClickListener(this);
        tv_tuition_fees.setOnClickListener(this);
        tv_organization_of_practice.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.special_opportunity:
                startActivity(new Intent(getActivity(), SpecialOpportunity.class));
                break;
            case R.id.transfer:
                startActivity(new Intent(getActivity(), Transfer.class));
                break;
            case R.id.attestation:
                startActivity(new Intent(getActivity(), Attestation.class));
                break;
            case R.id.questions:
                startActivity(new Intent(getActivity(), Questions.class));
                break;
            case R.id.tuition_fees:
                startActivity(new Intent(getActivity(), TuitionFees.class));
                break;
            case R.id.organization_of_practice:
                startActivity(new Intent(getActivity(), OrganizationOfPractice.class));
                break;
        }
    }
}
