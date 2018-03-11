package com.example.knutt.myproject;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimelineActivity extends AppCompatActivity {

    private ListView listView;
    private static String[] arrmessage = new String[100000];
    private AccessToken accessToken = AccessToken.getCurrentAccessToken();
    private ArrayList<String> idlist = new ArrayList<>();
    private final String LOG_TAG = "PROCESS";
    private ArrayList<String> allPostsStory = new ArrayList<String>();
    private ArrayList<String> allPostsMessages = new ArrayList<String>();
    private CallbackManager callbackManager;
    private DatabaseRealtime databaseRealtime;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

databaseRealtime = new DatabaseRealtime(getApplicationContext());
databaseRealtime.getReadableDatabase();

        listView = (ListView)findViewById(R.id.listview);

        //Toast.makeText(this,"Year : " + gc.get(Calendar.YEAR) , Toast.LENGTH_SHORT).show();


        Calendar check = Calendar.getInstance();
        check.add(Calendar.DATE,0);




        SimpleDateFormat realdatecurrent = new SimpleDateFormat("yyyy-MM-dd");


        String datecurrent = realdatecurrent.format(check.getTime());



         SimpleDateFormat df ;
        SimpleDateFormat df2;
        SimpleDateFormat df3 ;
        SimpleDateFormat df4 ;
        SimpleDateFormat df5 ;
        SimpleDateFormat df6 ;
        SimpleDateFormat df7 ;
        SimpleDateFormat df8 ;

        final String formattedDate ;
        final String formattedDate2 ;
        final String formattedDate3 ;
        final String formattedDate4 ;
        final String formattedDate5 ;
        final String formattedDate6 ;
        final String formattedDate7 ;
        final String formattedDate8 ;


        boolean Date1 ;
        boolean Date2 ;
        boolean Date3;
        boolean Date4;
        boolean Date5;
        boolean Date6;
        boolean Date7;
        boolean Date8;




        final ArrayList<HashMap<String, String>> datetime = databaseRealtime.getDaterealtime();

        final String datecheck1 = datetime.get(0).get("Date");
        final String datecheck2 = datetime.get(1).get("Date");
        final String datecheck3 = datetime.get(2).get("Date");
        final String datecheck4 = datetime.get(3).get("Date");
        final String datecheck5 = datetime.get(4).get("Date");
        final String datecheck6 = datetime.get(5).get("Date");
        final String datecheck7 = datetime.get(6).get("Date");
        final String datecheck8 = datetime.get(7).get("Date");

        final String pattern = "([0-9-]{10})";

        final Pattern regex = Pattern.compile(pattern);





        if(!(datecurrent.contains(datecheck8))){

            GraphRequest request = new GraphRequest(
                    AccessToken.getCurrentAccessToken(),
                    "/me/feed?limit=500",
                    null,
                    HttpMethod.GET,
                    new GraphRequest.Callback() {
                        public void onCompleted(GraphResponse response) {

                            // JSON GETS THE DATA
                            JSONObject jsonData = response.getJSONObject();

                            try {

                                JSONArray postsData = jsonData.getJSONArray("data");
                                if (postsData != null) {

                                    for (int i = 0; i < postsData.length(); i++) {
                                        JSONObject story = postsData.getJSONObject(i);

//                                    if (story.has("message")) {
//                                        String postMessage = story.getString("message");
//
//                                        allPostsMessages.add(postMessage);
//
//
//                                        //Toast.makeText(TimelineActivity.this,postMessage,Toast.LENGTH_SHORT).show();
//                                    }
                                        if(story.has("created_time")){
                                            String timeMessage = story.getString("created_time");
                                            //allPostsMessages.add(timeMessage);
                                            Matcher m = regex.matcher(timeMessage);
                                            if(m.find()){
                                                //allPostsMessages.add(m.group(0));

                                                if(m.group(0).contains(datecheck1) ){
                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }

                                                }else if(m.group(0).contains(datecheck2)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }else if(m.group(0).contains(datecheck3)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }

                                                }else if(m.group(0).contains(datecheck4)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }else if(m.group(0).contains(datecheck5)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }else if(m.group(0).contains(datecheck6)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }else if(m.group(0).contains(datecheck7)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }
                                            }
                                            //Toast.makeText(TimelineActivity.this,timeMessage,Toast.LENGTH_SHORT).show();
                                        }



                                    }





                                    //Toast.makeText(TimelineActivity.this,allPostsMessages.size(),Toast.LENGTH_SHORT).show();

//                                for(int i = 0;i<allPostsMessages.size();i++){
//
//                                }


                                }

                                ArrayAdapter<String> adapter = new ArrayAdapter<String>(TimelineActivity.this,R.layout.index_timeline,allPostsMessages);
                                listView.setAdapter(adapter);


                                Log.d("Array of Stories", "" + allPostsStory);
                                Log.d("Array of Messages", "" + allPostsMessages);
                            } catch (Exception e) {
                                Log.d("JSON", "error" + e.toString());
                            }

                        }
                    }
            );
            Bundle parameters = new Bundle();
            parameters.putString("fields", "created_time,message");
            request.setParameters(parameters);
            request.executeAsync();

        }else{

            Calendar c = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            Calendar c3 = Calendar.getInstance();
            Calendar c4 = Calendar.getInstance();
            Calendar c5 = Calendar.getInstance();
            Calendar c6 = Calendar.getInstance();
            Calendar c7 = Calendar.getInstance();
            Calendar c8 = Calendar.getInstance();

            c.add(Calendar.DATE,0);
            c2.add(Calendar.DATE,+1);
            c3.add(Calendar.DATE,+2);
            c4.add(Calendar.DATE,+3);
            c5.add(Calendar.DATE,+4);
            c6.add(Calendar.DATE,+5);
            c7.add(Calendar.DATE,+6);
            c8.add(Calendar.DATE,+7);


            df = new SimpleDateFormat("yyyy-MM-dd");
            df2 = new SimpleDateFormat("yyyy-MM-dd");
            df3 = new SimpleDateFormat("yyyy-MM-dd");
            df4 = new SimpleDateFormat("yyyy-MM-dd");
            df5 = new SimpleDateFormat("yyyy-MM-dd");
            df6 = new SimpleDateFormat("yyyy-MM-dd");
            df7 = new SimpleDateFormat("yyyy-MM-dd");
            df8 = new SimpleDateFormat("yyyy-MM-dd");

            formattedDate = df.format(c.getTime());
            formattedDate2 = df2.format(c2.getTime());
            formattedDate3 = df3.format(c3.getTime());
            formattedDate4 = df4.format(c4.getTime());
            formattedDate5 = df5.format(c5.getTime());
            formattedDate6 = df6.format(c6.getTime());
            formattedDate7 = df7.format(c7.getTime());
            formattedDate8 = df8.format(c8.getTime());

            Date1 = databaseRealtime.updateData("1",formattedDate);
           Date2 = databaseRealtime.updateData("2",formattedDate2);
            Date3 = databaseRealtime.updateData("3",formattedDate3);
           Date4 = databaseRealtime.updateData("4",formattedDate4);
             Date5 = databaseRealtime.updateData("5",formattedDate5);
             Date6 = databaseRealtime.updateData("6",formattedDate6);
             Date7 = databaseRealtime.updateData("7",formattedDate7);
            Date8 = databaseRealtime.updateData("8",formattedDate8);

            final String datecheck11 = datetime.get(0).get("Date");
            final String datecheck22 = datetime.get(1).get("Date");
            final String datecheck33 = datetime.get(2).get("Date");
            final String datecheck44 = datetime.get(3).get("Date");
            final String datecheck55 = datetime.get(4).get("Date");
            final String datecheck66 = datetime.get(5).get("Date");
            final String datecheck77 = datetime.get(6).get("Date");
            final String datecheck88 = datetime.get(7).get("Date");

            GraphRequest request = new GraphRequest(
                    AccessToken.getCurrentAccessToken(),
                    "/me/feed?limit=500",
                    null,
                    HttpMethod.GET,
                    new GraphRequest.Callback() {
                        public void onCompleted(GraphResponse response) {

                            // JSON GETS THE DATA
                            JSONObject jsonData = response.getJSONObject();

                            try {

                                JSONArray postsData = jsonData.getJSONArray("data");
                                if (postsData != null) {

                                    for (int i = 0; i < postsData.length(); i++) {
                                        JSONObject story = postsData.getJSONObject(i);

//                                    if (story.has("message")) {
//                                        String postMessage = story.getString("message");
//
//                                        allPostsMessages.add(postMessage);
//
//
//                                        //Toast.makeText(TimelineActivity.this,postMessage,Toast.LENGTH_SHORT).show();
//                                    }
                                        if(story.has("created_time")){
                                            String timeMessage = story.getString("created_time");
                                            //allPostsMessages.add(timeMessage);
                                            Matcher m = regex.matcher(timeMessage);
                                            if(m.find()){
                                                //allPostsMessages.add(m.group(0));

                                                if(m.group(0).contains(datecheck11) ){
                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }

                                                }else if(m.group(0).contains(datecheck22)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }else if(m.group(0).contains(datecheck33)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }

                                                }else if(m.group(0).contains(datecheck44)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }else if(m.group(0).contains(datecheck55)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }else if(m.group(0).contains(datecheck66)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }else if(m.group(0).contains(datecheck77)){

                                                    if(story.has("message")) {

                                                        String postMessage = story.getString("message");

                                                        allPostsMessages.add("โพสต์เมื่อ : "+m.group(0)+"\n"+"ข้อความที่โพสต์ : "+postMessage);

                                                    }


                                                }
                                            }
                                            //Toast.makeText(TimelineActivity.this,timeMessage,Toast.LENGTH_SHORT).show();
                                        }



                                    }





                                    //Toast.makeText(TimelineActivity.this,allPostsMessages.size(),Toast.LENGTH_SHORT).show();

//                                for(int i = 0;i<allPostsMessages.size();i++){
//
//                                }


                                }

                                ArrayAdapter<String> adapter = new ArrayAdapter<String>(TimelineActivity.this,R.layout.index_timeline,allPostsMessages);
                                listView.setAdapter(adapter);


                                Log.d("Array of Stories", "" + allPostsStory);
                                Log.d("Array of Messages", "" + allPostsMessages);
                            } catch (Exception e) {
                                Log.d("JSON", "error" + e.toString());
                            }

                        }
                    }
            );
            Bundle parameters = new Bundle();
            parameters.putString("fields", "created_time,message");
            request.setParameters(parameters);
            request.executeAsync();





        }


        //int result = Integer.parseInt(formattedDate);
// Now formattedDate have current date/time
        Toast.makeText(this,datecheck7 , Toast.LENGTH_SHORT).show();
        Toast.makeText(this,datecurrent, Toast.LENGTH_SHORT).show();





//
//        GraphRequest graphRequest = new GraphRequest(
//                accessToken,
//                "/me/feed",
//                null,
//                HttpMethod.GET,
//                new GraphRequest.Callback() {
//                    public void onCompleted(GraphResponse response) {
//                        Toast.makeText(TimelineActivity.this,response.toString(),Toast.LENGTH_SHORT).show();
//                    }
//                }
//        );
//        Bundle parameters = new Bundle();
//        parameters.putString("fields", "message");
//        parameters.putString("limit", "1");
//        graphRequest.setParameters(parameters);
//        graphRequest.executeAsync();





    }


}



