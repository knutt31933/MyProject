package com.example.knutt.myproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by KNUTT on 7/2/2561.
 */

public class Database3 extends SQLiteOpenHelper {
    private static final int dbVersion = 1;
    private static final String dbName = "databaseword3.sqlite";

    private static final String tableName5 = "Attitudetable3";
    private static final String col3Antitude1 = "AttitudeID";
    private static final String col3Antitude2 = "AttitudeWord";
    private static final String col3Antitude3 = "AttitudeRank";
    private static final String col3Antitude4 = "Emotion";



    public Database3(Context context) {
        super(context, dbName, null, dbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+tableName5+"("+col3Antitude1+" INTEGER PRIMARY KEY AUTOINCREMENT," +
                col3Antitude2+" TEXT,"+col3Antitude3+" INTEGER,"+col3Antitude4+" TEXT)");

        ContentValues attvalue1001 = new ContentValues();
        ContentValues attvalue1002 = new ContentValues();
        ContentValues attvalue1003 = new ContentValues();
        ContentValues attvalue1004 = new ContentValues();
        ContentValues attvalue1005 = new ContentValues();
        ContentValues attvalue1006 = new ContentValues();
        ContentValues attvalue1007 = new ContentValues();
        ContentValues attvalue1008 = new ContentValues();
        ContentValues attvalue1009 = new ContentValues();
        ContentValues attvalue1010 = new ContentValues();
        ContentValues attvalue1011 = new ContentValues();
        ContentValues attvalue1012 = new ContentValues();
        ContentValues attvalue1013 = new ContentValues();
        ContentValues attvalue1014 = new ContentValues();
        ContentValues attvalue1015 = new ContentValues();
        ContentValues attvalue1016 = new ContentValues();
        ContentValues attvalue1017 = new ContentValues();
        ContentValues attvalue1018 = new ContentValues();
        ContentValues attvalue1019 = new ContentValues();
        ContentValues attvalue1020 = new ContentValues();
        ContentValues attvalue1021 = new ContentValues();



        attvalue1001.put("AttitudeID",1001);
        attvalue1001.put("AttitudeWord","อัปมงคล");
        attvalue1001.put("AttitudeRank",-1);
        attvalue1001.put("Emotion","0");

        attvalue1002.put("AttitudeID",1002);
        attvalue1002.put("AttitudeWord","อัปยศ");
        attvalue1002.put("AttitudeRank",-1);
        attvalue1002.put("Emotion","5");

        attvalue1003.put("AttitudeID",1003);
        attvalue1003.put("AttitudeWord","อัปลักษณ์");
        attvalue1003.put("AttitudeRank",-1);
        attvalue1003.put("Emotion","4");

        attvalue1004.put("AttitudeID",1004);
        attvalue1004.put("AttitudeWord","อาฆาต");
        attvalue1004.put("AttitudeRank",-1);
        attvalue1004.put("Emotion","5");

        attvalue1005.put("AttitudeID",1005);
        attvalue1005.put("AttitudeWord","อาภัพ");
        attvalue1005.put("AttitudeRank",-1);
        attvalue1005.put("Emotion","0");

        attvalue1006.put("AttitudeID",1006);
        attvalue1006.put("AttitudeWord","อาย");
        attvalue1006.put("AttitudeRank",-1);
        attvalue1006.put("Emotion","04");

        attvalue1007.put("AttitudeID",1007);
        attvalue1007.put("AttitudeWord","อาวรณ์");
        attvalue1007.put("AttitudeRank",-1);
        attvalue1007.put("Emotion","0");

        attvalue1008.put("AttitudeID",1008);
        attvalue1008.put("AttitudeWord","อำมหิต");
        attvalue1008.put("AttitudeRank",-1);
        attvalue1008.put("Emotion","15");

        attvalue1009.put("AttitudeID",1009);
        attvalue1009.put("AttitudeWord","อิจฉา");
        attvalue1009.put("AttitudeRank",-1);
        attvalue1009.put("Emotion","45");

        attvalue1010.put("AttitudeID",1010);
        attvalue1010.put("AttitudeWord","อิดโรย");
        attvalue1010.put("AttitudeRank",-1);
        attvalue1010.put("Emotion","0");

        attvalue1011.put("AttitudeID",1011);
        attvalue1011.put("AttitudeWord","อึ้ง");
        attvalue1011.put("AttitudeRank",-1);
        attvalue1011.put("Emotion","0");

        attvalue1012.put("AttitudeID",1012);
        attvalue1012.put("AttitudeWord","อึดอัด");
        attvalue1012.put("AttitudeRank",-1);
        attvalue1012.put("Emotion","8");

        attvalue1013.put("AttitudeID",1013);
        attvalue1013.put("AttitudeWord","อุจาด");
        attvalue1013.put("AttitudeRank",-1);
        attvalue1013.put("Emotion","4");

        attvalue1014.put("AttitudeID",1014);
        attvalue1014.put("AttitudeWord","อู้อี้");
        attvalue1014.put("AttitudeRank",-1);
        attvalue1014.put("Emotion","8");

        attvalue1015.put("AttitudeID",1015);
        attvalue1015.put("AttitudeWord","แอนตี้");
        attvalue1015.put("AttitudeRank",-1);
        attvalue1015.put("Emotion","15");

        attvalue1016.put("AttitudeID",1016);
        attvalue1016.put("AttitudeWord","แอบงก");
        attvalue1016.put("AttitudeRank",-1);
        attvalue1016.put("Emotion","8");

        attvalue1017.put("AttitudeID",1017);
        attvalue1017.put("AttitudeWord","แออัด");
        attvalue1017.put("AttitudeRank",-1);
        attvalue1017.put("Emotion","8");

        attvalue1018.put("AttitudeID",1018);
        attvalue1018.put("AttitudeWord","โอ้อวด");
        attvalue1018.put("AttitudeRank",-1);
        attvalue1018.put("Emotion","8");

        attvalue1019.put("AttitudeID",1019);
        attvalue1019.put("AttitudeWord","แฮงก์");
        attvalue1019.put("AttitudeRank",-1);
        attvalue1019.put("Emotion","8");

        attvalue1020.put("AttitudeID",1020);
        attvalue1020.put("AttitudeWord","ไม่");
        attvalue1020.put("AttitudeRank",-1);
        attvalue1020.put("Emotion","8");

        attvalue1021.put("AttitudeID",1021);
        attvalue1021.put("AttitudeWord","รักๆ");
        attvalue1021.put("AttitudeRank",2);
        attvalue1021.put("Emotion","7");




        String table_nameatt3 = "Attitudetable3";
        
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1001);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1002);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1003);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1004);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1005);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1006);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1007);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1008);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1009);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1010);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1011);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1012);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1013);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1014);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1015);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1016);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1017);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1018);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1019);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1020);
        sqLiteDatabase.insert(table_nameatt3,null,attvalue1021);


    }

    public ArrayList<HashMap<String,String>> getAttitudeList3(){
        try{

            ArrayList<HashMap<String,String>> arr = new ArrayList<HashMap<String,String>>();
            HashMap<String,String> map;
            SQLiteDatabase db = this.getReadableDatabase();
            String sql = "SELECT * FROM " + tableName5;
            Cursor cur = db.rawQuery(sql,null);
            if(cur!= null){
                if(cur.moveToFirst()){

                    do{
                        map = new HashMap<String,String>();
                        map.put("AttitudeID",cur.getString(0));
                        map.put("AttitudeWord",cur.getString(1));
                        map.put("AttitudeRank",cur.getString(2));
                        map.put("Emotion",cur.getString(3));
                        arr.add(map);

                    }while (cur.moveToNext());
                }

            }
            cur.close();
            db.close();
            return arr;
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
