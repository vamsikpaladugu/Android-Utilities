package com.vamsi.androidutilities.utils;

import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;

import com.vamsi.androidutilities.BuildConfig;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Vamsi Smart on 2/27/2018.
 */

public class InstallParams {

    /*
    *@return app version code
    * */
    public static int getAppVersionCode() {
        return BuildConfig.VERSION_CODE;
    }

    /*
    *@return app version name
    * */
    public static String getAppVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    /*
    *@return device OS version name like 8.1.0
    * */
    public static String getDeviceVersionName() {
        return Build.VERSION.RELEASE;
    }

    /*
    *@return device model ex: Nexus 5x
    * */
    public static String getDeviceModel() {
        return Build.MODEL;
    }

    /*
    *@return Manufacturer name ex: LGE
    * */
    public static String getManufacturerName() {
        return Build.MANUFACTURER;
    }

    /*
    *@return user default language
    * */
    public static String getDeviceLanguage() {
        return Locale.getDefault().getDisplayLanguage();
    }

    /*
    *@return device screen size
    * */
    public static String getScreenSize() {

        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();

        return metrics.widthPixels + " x " + metrics.heightPixels;
    }

    /*
    *@return device screen density
    * */
    public static String getScreenDensity() {
        return Resources.getSystem().getDisplayMetrics().densityDpi + "dpi";
    }

    /*
    *@return device timezone
    * */
    public static String getTimeZone() {
        return Calendar.getInstance().getTimeZone().getID();
    }
}
