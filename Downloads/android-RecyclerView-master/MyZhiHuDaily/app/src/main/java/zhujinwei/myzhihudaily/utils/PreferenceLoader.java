package zhujinwei.myzhihudaily.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by ZhuJinWei on 2017/6/29.
 */

public class PreferenceLoader {

    private SharedPreferences preferences;

    private Context context;

    public PreferenceLoader(Context context){
        this.context=context;
        preferences= PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void saveBoolean(int keyResId,boolean value){
        String key=context.getString(keyResId);
        saveBoolean(key,value);
    }
    public void saveBoolean(String key,boolean value){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
    }
    public int getInt(String key){

        return preferences.getInt(key,0);
    }

    public void saveInt(String key,int value){

        SharedPreferences.Editor editor=preferences.edit();
        editor.putInt(key,value);
    }


}
