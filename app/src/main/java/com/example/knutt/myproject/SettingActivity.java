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
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
    int countcheck = 0;
    private RadioGroup radioGroup;
    private RadioButton day1,day2,day3,day4,day5,day6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting2);


        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);

        day1 = (RadioButton)findViewById(R.id.day1);
        day2 = (RadioButton)findViewById(R.id.day2);
        day3 = (RadioButton)findViewById(R.id.day3);
        day4 = (RadioButton)findViewById(R.id.day4);
        day5 = (RadioButton)findViewById(R.id.day5);
        day6 = (RadioButton)findViewById(R.id.day6);

        final Intent intent = getIntent();
        final String jsondata = intent.getStringExtra("userProfile");



        SharedPreferences sp = getSharedPreferences("App save", Context.MODE_PRIVATE);
        int checkboxstate = sp.getInt("checked",0);
        SharedPreferences sp2 = getSharedPreferences("App save2", Context.MODE_PRIVATE);
        int checkboxstate2 = sp2.getInt("checked2",0);
        SharedPreferences sp3 = getSharedPreferences("App save3", Context.MODE_PRIVATE);
        int checkboxstate3 = sp3.getInt("checked3",0);
        SharedPreferences sp4 = getSharedPreferences("App save4", Context.MODE_PRIVATE);
        int checkboxstate4 = sp4.getInt("checked4",0);
        SharedPreferences sp5 = getSharedPreferences("App save5", Context.MODE_PRIVATE);
        int checkboxstate5 = sp5.getInt("checked5",0);
        SharedPreferences sp6 = getSharedPreferences("App save6", Context.MODE_PRIVATE);
        int checkboxstate6 = sp6.getInt("checked6",0);




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

        SharedPreferences spradio = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
        int checkboxRadio = spradio.getInt("checkedRadio",0);

        if(checkboxRadio == 1){
            day1.setChecked(true);

        }else if(checkboxRadio == 2){
            day2.setChecked(true);
        }else if(checkboxRadio == 3){
            day3.setChecked(true);
        }else if(checkboxRadio == 4){
            day4.setChecked(true);
        }else if(checkboxRadio == 5){
            day5.setChecked(true);
        }else if(checkboxRadio == 6){
            day6.setChecked(true);
        }

//        radioGroup = (RadioGroup) findViewById(R.id.radio_g);
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                if(i == R.id.day1){
//                    Toast.makeText(SettingActivity.this,"day1",Toast.LENGTH_SHORT).show();
//                    SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPref.edit();
//                    editor.putInt("checkedRadio", 1);
//                    editor.commit();
//
//                }else if(i == R.id.day2){
//                    Toast.makeText(SettingActivity.this,"day2",Toast.LENGTH_SHORT).show();
//                    SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPref.edit();
//                    editor.putInt("checkedRadio", 2);
//                    editor.commit();
//                }else if(i == R.id.day3){
//                    Toast.makeText(SettingActivity.this,"day3",Toast.LENGTH_SHORT).show();
//                    SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPref.edit();
//                    editor.putInt("checkedRadio", 3);
//                    editor.commit();
//                }else if(i == R.id.day4){
//                    Toast.makeText(SettingActivity.this,"day4",Toast.LENGTH_SHORT).show();
//                    SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPref.edit();
//                    editor.putInt("checkedRadio", 4);
//                    editor.commit();
//                }else if(i == R.id.day5){
//                    Toast.makeText(SettingActivity.this,"day5",Toast.LENGTH_SHORT).show();
//                    SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPref.edit();
//                    editor.putInt("checkedRadio", 5);
//                    editor.commit();
//                }else if(i == R.id.day6){
//                    Toast.makeText(SettingActivity.this,"day6",Toast.LENGTH_SHORT).show();
//                    SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPref.edit();
//                    editor.putInt("checkedRadio", 6);
//                    editor.commit();
//                }
//            }
//        });













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
    public void onCheckboxClicked2(View view){
        boolean checked2 = ((RadioButton) view).isChecked();
        if(view.getId() == R.id.day1){
            if(checked2){
                Toast.makeText(SettingActivity.this,"day1",Toast.LENGTH_SHORT).show();
                SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checkedRadio", 1);
                editor.commit();
            }

        }else if(view.getId() == R.id.day2){
            if(checked2){
                Toast.makeText(SettingActivity.this,"day2",Toast.LENGTH_SHORT).show();
                SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checkedRadio", 2);
                editor.commit();
            }

        }else if(view.getId() == R.id.day3){
            if(checked2){
                Toast.makeText(SettingActivity.this,"day3",Toast.LENGTH_SHORT).show();
                SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checkedRadio", 3);
                editor.commit();
            }

        }else if(view.getId() == R.id.day4){
            if(checked2){
                Toast.makeText(SettingActivity.this,"day4",Toast.LENGTH_SHORT).show();
                SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checkedRadio", 4);
                editor.commit();
            }

        }else if(view.getId() == R.id.day5){
            if(checked2){
                Toast.makeText(SettingActivity.this,"day5",Toast.LENGTH_SHORT).show();
                SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checkedRadio", 5);
                editor.commit();
            }

        }else if(view.getId() == R.id.day6){
            if(checked2){
                Toast.makeText(SettingActivity.this,"day6",Toast.LENGTH_SHORT).show();
                SharedPreferences sharedPref = getSharedPreferences("App save radio", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("checkedRadio", 6);
                editor.commit();
            }

        }
    }



    @Override
    protected void onResume() {
        super.onResume();

    }








}


