package com.example.knutt.myproject;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.widget.ProfilePictureView;

import org.json.JSONException;
import org.json.JSONObject;

public class ProfileActivity extends AppCompatActivity {
    private ProfilePictureView profilePictureView;
    private TextView textname,textemail;
    private JSONObject reponse;
    private CallbackManager callbackManager;
    private Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(this.getApplicationContext());
        callbackManager = CallbackManager.Factory.create();
        AppEventsLogger.activateApp(this);
        setContentView(R.layout.activity_profile);
        btnback = (Button)findViewById(R.id.backbtn);

        final Intent intent = getIntent();
        final String jsondata = intent.getStringExtra("userProfile");

        profilePictureView = (ProfilePictureView)findViewById(R.id.imageView);
        textname = (TextView)findViewById(R.id.textname);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent profile = new Intent(ProfileActivity.this,AccountActivity.class);
               profile.putExtra("userProfile",jsondata);
               startActivity(profile);

            }
        });
        try {

            reponse = new JSONObject(jsondata);
            String fname = reponse.get("first_name").toString();
            String lname = reponse.get("last_name").toString();
            String fullname = fname + " " +lname;
            //String bh = reponse.get("birthday").toString();
            textname.setText(fullname);
            profilePictureView.setProfileId(reponse.get("id").toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }




    }
}
