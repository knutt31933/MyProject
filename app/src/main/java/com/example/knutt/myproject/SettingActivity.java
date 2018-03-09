package com.example.knutt.myproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.HashSet;

public class SettingActivity extends AppCompatActivity {

    Button backbtnsetting;
    private CheckBox checkBox;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private HashSet<String> map = new HashSet<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting2);

        backbtnsetting = (Button)findViewById(R.id.backbtnsetting);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);

        final Intent intent = getIntent();
        final String jsondata = intent.getStringExtra("userProfile");
        backbtnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AccountActivity.class);
                intent.putExtra("userProfile",jsondata);
                startActivity(intent);
            }
        });


        SharedPreferences sp = getSharedPreferences("App save", Context.MODE_PRIVATE);
        int checkboxstate = sp.getInt("checked",1);
        SharedPreferences sp2 = getSharedPreferences("App save2", Context.MODE_PRIVATE);
        int checkboxstate2 = sp2.getInt("checked2",1);
        SharedPreferences sp3 = getSharedPreferences("App save3", Context.MODE_PRIVATE);
        int checkboxstate3 = sp3.getInt("checked3",1);
        SharedPreferences sp4 = getSharedPreferences("App save4", Context.MODE_PRIVATE);
        int checkboxstate4 = sp4.getInt("checked4",1);
        SharedPreferences sp5 = getSharedPreferences("App save5", Context.MODE_PRIVATE);
        int checkboxstate5 = sp5.getInt("checked5",1);
        SharedPreferences sp6 = getSharedPreferences("App save6", Context.MODE_PRIVATE);
        int checkboxstate6 = sp6.getInt("checked6",1);

        if (checkboxstate == 1) {
            checkBox.setChecked(true);
        }else {
            checkBox.setChecked(false);
        }

        if (checkboxstate2 == 1) {
            checkBox2.setChecked(true);
        }else {
            checkBox2.setChecked(false);
        }
        if (checkboxstate3 == 1) {
            checkBox3.setChecked(true);
        }else {
            checkBox3.setChecked(false);
        }
        if (checkboxstate4 == 1) {
            checkBox4.setChecked(true);
        }else {
            checkBox4.setChecked(false);
        }
        if (checkboxstate5 == 1) {
            checkBox5.setChecked(true);
        }else {
            checkBox5.setChecked(false);
        }
        if (checkboxstate6 == 1) {
            checkBox6.setChecked(true);
        }else {
            checkBox6.setChecked(false);
        }






    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
      boolean checked = ((CheckBox) view).isChecked();

        if (view.getId() == R.id.checkBox) {
            if (checked) {


                SharedPreferences sharedPref = getSharedPreferences("App save", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked", 1);
                editor.commit();
                Toast.makeText(SettingActivity.this, "1", Toast.LENGTH_SHORT).show();
            }else{

                SharedPreferences sharedPref = getSharedPreferences("App save", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked", 0);
                editor.commit();


            }
        }
        if(view.getId() == R.id.checkBox2){
            if (checked) {
                SharedPreferences sharedPref = getSharedPreferences("App save2", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked2", 1);
                editor.commit();
                Toast.makeText(SettingActivity.this, "2", Toast.LENGTH_SHORT).show();
            }else{
                SharedPreferences sharedPref = getSharedPreferences("App save2", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked2", 0);
                editor.commit();
            }
        }
        if(view.getId() == R.id.checkBox3){
            if (checked) {
                SharedPreferences sharedPref = getSharedPreferences("App save3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked3", 1);
                editor.commit();
                Toast.makeText(SettingActivity.this, "3", Toast.LENGTH_SHORT).show();
            }else{
                SharedPreferences sharedPref = getSharedPreferences("App save3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked3", 0);
                editor.commit();

            }
        }
        if(view.getId() == R.id.checkBox4){
            if (checked) {
                SharedPreferences sharedPref = getSharedPreferences("App save4", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked4", 1);
                editor.commit();
                Toast.makeText(SettingActivity.this, "4", Toast.LENGTH_SHORT).show();
            }else{
                SharedPreferences sharedPref = getSharedPreferences("App save4", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked4", 0);
                editor.commit();

            }
        }
        if(view.getId() == R.id.checkBox5){
            if (checked) {
                SharedPreferences sharedPref = getSharedPreferences("App save5", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked5", 1);
                editor.commit();

                Toast.makeText(SettingActivity.this, "5", Toast.LENGTH_SHORT).show();
            }else{
                SharedPreferences sharedPref = getSharedPreferences("App save5", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked5", 0);
                editor.commit();

            }
        }
        if(view.getId() == R.id.checkBox6){
            if (checked) {
                SharedPreferences sharedPref = getSharedPreferences("App save6", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked6", 1);
                editor.commit();
                Toast.makeText(SettingActivity.this, "6", Toast.LENGTH_SHORT).show();
            }else{
                SharedPreferences sharedPref = getSharedPreferences("App save6", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checked6", 0);
                editor.commit();

            }
        }

    }



    @Override
    protected void onResume() {
        super.onResume();

    }








}


