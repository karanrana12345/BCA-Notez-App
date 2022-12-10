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
import bca.notez.TBC105NOTES.TBC105Unit1Notes;
import bca.notez.TBC105NOTES.TBC105Unit2Notes;
import bca.notez.TBC105NOTES.TBC105Unit3Notes;
import bca.notez.TBC105NOTES.TBC105Unit4Notes;
import bca.notez.TBC105NOTES.TBC105Unit5Notes;

public class ManagementTopics extends AppCompatActivity {

    private ConstraintLayout management_topic1_constraint,management_topic2_constraint,management_topic3_constraint,management_topic4_constraint,management_topic5_constraint;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management_topics);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        management_topic1_constraint = findViewById(R.id.management_topic1_constraint);
        management_topic1_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManagementTopics.this, TBC105Unit1Notes.class);
                startActivity(intent);
            }
        });

        management_topic2_constraint = findViewById(R.id.management_topic2_constraint);
        management_topic2_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManagementTopics.this, TBC105Unit2Notes.class);
                startActivity(intent);
            }
        });

        management_topic3_constraint = findViewById(R.id.management_topic3_constraint);
        management_topic3_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManagementTopics.this, TBC105Unit3Notes.class);
                startActivity(intent);
            }
        });

        management_topic4_constraint = findViewById(R.id.management_topic4_constraint);
        management_topic4_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManagementTopics.this, TBC105Unit4Notes.class);
                startActivity(intent);
            }
        });

        management_topic5_constraint = findViewById(R.id.management_topic5_constraint);
        management_topic5_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManagementTopics.this, TBC105Unit5Notes.class);
                startActivity(intent);
            }
        });

    }
}