package com.vamsi.androidutilities;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.vamsi.androidutilities.utils.DeviceUtilities;
import com.vamsi.androidutilities.utils.LogUtilities;
import com.vamsi.androidutilities.utils.PrefUtilities;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this log only prints in debug mode
        LogUtilities.v(TAG, "sample message");

        //Save and retrieve preferences are that is
        String userName = PrefUtilities.with(this).getUserName();

        //this will return true if user accepts the read contacts permission
        boolean hasPermission = DeviceUtilities.hasPermission(Manifest.permission.READ_CONTACTS, this);

    }
}
