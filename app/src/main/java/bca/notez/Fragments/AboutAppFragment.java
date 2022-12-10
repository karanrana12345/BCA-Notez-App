package bca.notez.Fragments;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import bca.notez.R;

public class AboutAppFragment extends Fragment {

    public AboutAppFragment() {
        // Required empty public constructor
    }

    private ImageView whatsappBtn;
    private TextView abouttheapp,forthequeries;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_app, container, false);

        whatsappBtn = view.findViewById(R.id.whatsappBtn);
        abouttheapp = view.findViewById(R.id.aboutapp);
        forthequeries = view.findViewById(R.id.queries);
        abouttheapp.setPaintFlags(abouttheapp.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        forthequeries.setPaintFlags(forthequeries.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);

        whatsappBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String whatsappURL = "https://wa.me/+918126861767?text=Hello there!";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(whatsappURL));
                startActivity(intent);

            }
        });
        return view;
    }
}