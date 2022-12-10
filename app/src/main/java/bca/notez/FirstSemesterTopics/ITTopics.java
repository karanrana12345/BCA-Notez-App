package bca.notez.FirstSemesterTopics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import bca.notez.R;
import bca.notez.TBC102NOTES.TBC102Unit1Notes;
import bca.notez.TBC102NOTES.TBC102Unit2Notes;
import bca.notez.TBC102NOTES.TBC102Unit3Notes;
import bca.notez.TBC102NOTES.TBC102Unit4Notes;
import bca.notez.TBC102NOTES.TBC102Unit5Notes;

public class ITTopics extends AppCompatActivity {

    private ConstraintLayout it_topic1_constraint,it_topic2_constraint,it_topic3_constraint,it_topic4_constraint,it_topic5_constraint;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ittopics);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        it_topic1_constraint = findViewById(R.id.it_topic1_constraint);
        it_topic1_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITTopics.this, TBC102Unit1Notes.class);
                startActivity(intent);
            }
        });

        it_topic2_constraint = findViewById(R.id.it_topic2_constraint);
        it_topic2_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITTopics.this, TBC102Unit2Notes.class);
                startActivity(intent);
            }
        });

        it_topic3_constraint = findViewById(R.id.it_topic3_constraint);
        it_topic3_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITTopics.this, TBC102Unit3Notes.class);
                startActivity(intent);
            }
        });

        it_topic4_constraint = findViewById(R.id.it_topic4_constraint);
        it_topic4_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITTopics.this, TBC102Unit4Notes.class);
                startActivity(intent);
            }
        });

        it_topic5_constraint = findViewById(R.id.it_topic5_constraint);
        it_topic5_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITTopics.this, TBC102Unit5Notes.class);
                startActivity(intent);
            }
        });

    }
}