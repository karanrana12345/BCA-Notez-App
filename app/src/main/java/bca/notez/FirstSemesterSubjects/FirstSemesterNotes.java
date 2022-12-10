package bca.notez.FirstSemesterSubjects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import bca.notez.FirstSemesterTopics.CTopics;
import bca.notez.FirstSemesterTopics.CommunicationTopics;
import bca.notez.FirstSemesterTopics.ITTopics;
import bca.notez.FirstSemesterTopics.ManagementTopics;
import bca.notez.R;

public class FirstSemesterNotes extends AppCompatActivity {

    private ConstraintLayout c_constraint,it_constraint,communication_constraint,management_constraint;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_semester_notes);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        c_constraint = findViewById(R.id.c_constraint);
        c_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FirstSemesterNotes.this,CTopics.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(c_constraint,"SemesterOne");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(FirstSemesterNotes.this,pairs);

                startActivity(intent,options.toBundle());

            }
        });

        it_constraint = findViewById(R.id.it_constraint);
        it_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstSemesterNotes.this, ITTopics.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(it_constraint,"SemesterOne");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(FirstSemesterNotes.this,pairs);
                startActivity(intent,options.toBundle());
            }
        });

        communication_constraint = findViewById(R.id.communication_constraint);
        communication_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstSemesterNotes.this, CommunicationTopics.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(communication_constraint,"SemesterOne");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(FirstSemesterNotes.this,pairs);
                startActivity(intent,options.toBundle());
            }
        });

        management_constraint = findViewById(R.id.management_constraint);
        management_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstSemesterNotes.this, ManagementTopics.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(management_constraint,"SemesterOne");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(FirstSemesterNotes.this,pairs);
                startActivity(intent,options.toBundle());
            }
        });

    }
}