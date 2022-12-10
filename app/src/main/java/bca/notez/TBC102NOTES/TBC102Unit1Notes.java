package bca.notez.TBC102NOTES;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import bca.notez.R;
import bca.notez.TBC101NOTES.TBC101Unit1Notes;
import bca.notez.TBC101NOTES.TBC101Unit5Notes;

public class TBC102Unit1Notes extends AppCompatActivity {

    private TextView text1;
    private PDFView pdfView;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mref = database.getReference("tbc_102_unit_1_notes");
    private ProgressDialog pd;
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbc102_unit1_notes);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pd = new ProgressDialog(TBC102Unit1Notes.this);
        pd.setTitle("Please wait");
        pd.setMessage("Retrieving from Database...");
        pd.setCanceledOnTouchOutside(false);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        pdfView = findViewById(R.id.pdfView);
        text1 = findViewById(R.id.text1);

        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                text1.setText(value);
                String url = text1.getText().toString();
                new TBC102Unit1Notes.RetrivedPDFStream().execute(url);
                pd.show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
    class RetrivedPDFStream extends AsyncTask<String,Void, InputStream>
    {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try {
                URL url = new URL(strings[0]);
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();
                if (urlConnection.getResponseCode()==200)
                {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            }
            catch (IOException e)
            {
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();
            pd.dismiss();

            MobileAds.initialize(TBC102Unit1Notes.this, new OnInitializationCompleteListener() {
                @Override
                public void onInitializationComplete(InitializationStatus initializationStatus) {}
            });
            AdRequest iadRequest = new AdRequest.Builder().build();

            InterstitialAd.load(TBC102Unit1Notes.this, "ca-app-pub-7566995768958514/1443008486", iadRequest,
                    new InterstitialAdLoadCallback() {
                        @Override
                        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                            // The mInterstitialAd reference will be null until
                            // an ad is loaded.
                            mInterstitialAd = interstitialAd;
                            mInterstitialAd.show(TBC102Unit1Notes.this);
                            Log.i(TAG, "onAdLoaded");
                        }
                        @Override
                        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                            // Handle the error
                            Log.d(TAG, loadAdError.toString());
                            mInterstitialAd = null;
                        }
                    });
        }
    }
}