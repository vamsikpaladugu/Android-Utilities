package com.vamsi.androidutilities.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.vamsi.androidutilities.R;

/**
 * Created by Vamsi Smart on 2/25/2018.
 *
 * here is my favorite utils class
 * <pre>Use this class to save and retrieve the SharedPreferences, add required getter and setter methods</pre>
 *
 * Example usage
 *@<code> PrefUtilities.with(this).getUserName();</code>
 *
 *
 */

public class PrefUtilities {

    private SharedPreferences preferences;
    Context context;


    private PrefUtilities(Context context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.context = context;
    }


    public static PrefUtilities with(Context context){
        return new PrefUtilities(context);
    }



    /*
    * Add required methods
    *
    * */
    public void saveUserName(String username){

        preferences.edit().putString(context.getString(R.string.pref_key_user_name),username).apply();

    }

    public String getUserName(){
        return preferences.getString(context.getString(R.string.pref_key_user_name),"");
    }


}
