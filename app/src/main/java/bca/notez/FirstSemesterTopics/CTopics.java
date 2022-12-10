package bca.notez.FirstSemesterTopics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import bca.notez.R;
import bca.notez.TBC101NOTES.TBC101Unit1Notes;
import bca.notez.TBC101NOTES.TBC101Unit2Notes;
import bca.notez.TBC101NOTES.TBC101Unit3Notes;
import bca.notez.TBC101NOTES.TBC101Unit4Notes;
import bca.notez.TBC101NOTES.TBC101Unit5Notes;

public class CTopics extends AppCompatActivity {

    private ConstraintLayout tbc101_unit1_notes,c_topic2_constraint,c_topic3_constraint,c_topic4_constraint,c_topic5_constraint;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctopics);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        tbc101_unit1_notes = findViewById(R.id.c_topic1_constraint);
        tbc101_unit1_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CTopics.this, TBC101Unit1Notes.class);
                startActivity(intent);
            }
        });

        c_topic2_constraint = findViewById(R.id.c_topic2_constraint);
        c_topic2_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CTopics.this, TBC101Unit2Notes.class);
                startActivity(intent);
            }
        });

        c_topic3_constraint = findViewById(R.id.c_topic3_constraint);
        c_topic3_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CTopics.this, TBC101Unit3Notes.class);
                startActivity(intent);
            }
        });

        c_topic4_constraint = findViewById(R.id.c_topic4_constraint);
        c_topic4_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CTopics.this, TBC101Unit4Notes.class);
                startActivity(intent);
            }
        });

        c_topic5_constraint = findViewById(R.id.c_topic5_constraint);
        c_topic5_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CTopics.this, TBC101Unit5Notes.class);
                startActivity(intent);
            }
        });
    }
}