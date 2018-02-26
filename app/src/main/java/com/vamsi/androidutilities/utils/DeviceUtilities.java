package com.vamsi.androidutilities.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.RequiresPermission;

import com.vamsi.androidutilities.BuildConfig;

/**
 * Created by Vamsi Smart on 2/25/2018.
 */

public class DeviceUtilities {

    /**
     * Return true if device has active Internet connection.
     * @return true if device has active Internet connection.
     */

    @RequiresPermission(android.Manifest.permission.ACCESS_NETWORK_STATE)
    public static boolean isOnline(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();

    }

    /**
     * Return true if device has installed package.
     * @param  packagename is name of the package.
     * @param context is activity context
     * @return true if device has installed package
     */
    public static boolean hasPackageInstalled(String packagename, Context context) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(packagename, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /**
     * Return true if app has @param permission mostly used for dynamic permissions.
     * @param  permission permission to check (EX: Manifest.permission.READ_CONTACTS).
     * @param context is activity context
     * @return true if app has access to @param permission
     */
    public static boolean hasPermission(String permission, Context context) {

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
            return true;

        return context.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;

    }

    /**
     * Return sdk version code (Android version 5.0 - return 21, android 5.1 - return 22).
     * @return sdk version
     */
    public static int getSDKVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    /**
     * Return true id SDK version is Lollipop and above.
     * @return true id SDK version is Lollipop and above
     */
    public static boolean isSDKVersionLollipopAndAbove() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            return true;

        return false;
    }

    /**
     * Return true id SDK version is Marshmallow and above.
     * @return true id SDK version is Marshmallow and above
     */
    public static boolean isSDKVersionMarshmallowAndAbove() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            return true;

        return false;
    }

    /**
     * Return AndroidId for details .
     * @param context is activity context
     * @return true if app has access to @param permission
     * */
    @SuppressLint("HardwareIds")
    public static String getAndroidId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    /**
     * Return app version code.
     * @return app version code
     */
    public static int getAppVersion() {

        return BuildConfig.VERSION_CODE;

    }


}
