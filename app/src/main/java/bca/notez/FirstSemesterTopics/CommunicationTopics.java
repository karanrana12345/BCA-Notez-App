package bca.notez.FirstSemesterTopics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import bca.notez.R;
import bca.notez.TBC104NOTES.TBC104Unit1Notes;
import bca.notez.TBC104NOTES.TBC104Unit2Notes;
import bca.notez.TBC104NOTES.TBC104Unit3Notes;
import bca.notez.TBC104NOTES.TBC104Unit4Notes;
import bca.notez.TBC104NOTES.TBC104Unit5Notes;

public class CommunicationTopics extends AppCompatActivity {

    private ConstraintLayout communication_topic1_constraint,communication_topic2_constraint,communication_topic3_constraint,communication_topic4_constraint,communication_topic5_constraint;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_topics);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        communication_topic1_constraint = findViewById(R.id.communication_topic1_constraint);
        communication_topic1_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommunicationTopics.this, TBC104Unit1Notes.class);
                startActivity(intent);
            }
        });

        communication_topic2_constraint = findViewById(R.id.communication_topic2_constraint);
        communication_topic2_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommunicationTopics.this, TBC104Unit2Notes.class);
                startActivity(intent);
            }
        });

        communication_topic3_constraint = findViewById(R.id.communication_topic3_constraint);
        communication_topic3_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommunicationTopics.this, TBC104Unit3Notes.class);
                startActivity(intent);
            }
        });

        communication_topic4_constraint = findViewById(R.id.communication_topic4_constraint);
        communication_topic4_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommunicationTopics.this, TBC104Unit4Notes.class);
                startActivity(intent);
            }
        });

        communication_topic5_constraint = findViewById(R.id.communication_topic5_constraint);
        communication_topic5_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommunicationTopics.this, TBC104Unit5Notes.class);
                startActivity(intent);
            }
        });
    }
}