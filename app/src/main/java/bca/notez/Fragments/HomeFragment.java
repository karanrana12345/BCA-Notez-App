package bca.notez.Fragments;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bca.notez.FirstSemesterSubjects.FirstSemesterNotes;
import bca.notez.R;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private ConstraintLayout semesterConstraint;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        semesterConstraint = view.findViewById(R.id.first_semester_constraint);

        semesterConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(),FirstSemesterNotes.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(semesterConstraint,"SemesterOne");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(getActivity(),pairs);

                startActivity(intent,options.toBundle());
            }
        });

        return view;
    }
}