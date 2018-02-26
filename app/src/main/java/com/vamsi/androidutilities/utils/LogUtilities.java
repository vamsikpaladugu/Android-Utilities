package com.vamsi.androidutilities.utils;

import android.util.Log;

import com.vamsi.androidutilities.BuildConfig;

/**
 * Created by Vamsi Smart on 2/24/2018.
 *
 *Log utilities will reduce the effort to deleting the logs when you are preparing for the
 * release version and will help to continue to work for next version
 */

public class LogUtilities {

    private static boolean isDebugVersion = BuildConfig.DEBUG;

    public static void v(String tag, String msg) {
        if (isDebugVersion) {
            Log.v(tag, msg);
        }
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (isDebugVersion) {
            Log.v(tag, msg, tr);
        }
    }

    public static void d(String tag, String msg) {
        if (isDebugVersion) {
            Log.d(tag, msg);
        }
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (isDebugVersion) {
            Log.d(tag, msg, tr);
        }
    }

    public static void i(String tag, String msg) {
        if (isDebugVersion) {
            Log.i(tag, msg);
        }
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (isDebugVersion) {
            Log.d(tag, msg, tr);
        }
    }

    public static void w(String tag, String msg) {
        if (isDebugVersion) {
            Log.w(tag, msg);
        }
    }

    public static void w(String tag, String msg, Throwable tr) {
        if (isDebugVersion) {
            Log.w(tag, msg, tr);
        }
    }

    public static void w(String tag, Throwable tr) {
        if (isDebugVersion) {
            Log.w(tag, tr);
        }
    }

    public static void e(String tag, String msg) {
        if (isDebugVersion) {
            Log.e(tag, msg);
        }
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (isDebugVersion) {
            Log.e(tag, msg, tr);
        }
    }

}
