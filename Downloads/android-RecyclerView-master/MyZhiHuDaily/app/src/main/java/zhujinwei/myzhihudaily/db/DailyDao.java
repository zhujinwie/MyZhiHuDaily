package zhujinwei.myzhihudaily.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

import zhujinwei.myzhihudaily.bean.HistoryData;
import zhujinwei.myzhihudaily.constants.Constants;

/**
 * Created by ZhuJinWei on 2017/6/28.
 *
 *实现对数据库的增删改查
 * */

public class DailyDao {

    private DBHelper dbHelper;
    private Context context;
    private SQLiteDatabase db;
    private String[] allColumns={DBHelper.COLUMN_ID,DBHelper.COLUMN_DATE,DBHelper.COLUMN_CONTENT};

    public DailyDao(Context context){
        this.context=context;
        dbHelper=new DBHelper(context);
    }

    /**初始化*/
    public void init(){
        db=dbHelper.getWritableDatabase();
    }

    public List<HistoryData> insertDailyNews(String date,String content){

        ContentValues values=new ContentValues();
        values.put(DBHelper.COLUMN_DATE,date);
        values.put(DBHelper.COLUMN_CONTENT,date);

        long insertId=db.insert(DBHelper.TABLE_NAME,null,values);
        Cursor cursor=db.query(DBHelper.TABLE_NAME,allColumns,DBHelper.COLUMN_ID+"="+insertId,null,null,null,null);
        cursor.moveToFirst();
        List<HistoryData> datas=cursorToNewsList(cursor);
        cursor.close();
        return datas;
    }
    public void updateDailyNews(String date,String content){

        ContentValues values=new ContentValues();
        values.put(DBHelper.COLUMN_DATE,date);
        values.put(DBHelper.COLUMN_CONTENT,date);

        db.update(DBHelper.TABLE_NAME,values,DBHelper.COLUMN_DATE+"="+date,null);

    }

    public void insertOrUpdateNewsList(String date,String content){

        if(newsOfTheDay(date)!=null){
            updateDailyNews(date,content);
        }
        else{
            insertDailyNews(date,content);
        }

    }
    public List<HistoryData> newsOfTheDay(String date) {
        Cursor cursor = db.query(DBHelper.TABLE_NAME,
                allColumns, DBHelper.COLUMN_DATE + " = " + date, null, null, null, null);

        cursor.moveToFirst();
        List<HistoryData> newsList = cursorToNewsList(cursor);
        cursor.close();
        return newsList;
    }

    private List<HistoryData> cursorToNewsList(Cursor cursor) {
        if (cursor != null && cursor.getCount() > 0) {
            return new GsonBuilder().create().fromJson(cursor.getString(2),new TypeToken<List<HistoryData>>() {
            }.getType());
        } else {
            return null;
        }
    }





}
