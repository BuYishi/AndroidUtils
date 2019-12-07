package com.bu_ish.android_utils;

import android.content.Context;
import android.util.DisplayMetrics;

public class PixelUtils {
    public static int dpToPx(Context context, float dp) {
        return (int) (dp * getDisplayMetrics(context).density + 0.5f);
    }

    public static int pxToDp(Context context, float px) {
        return (int) (px / getDisplayMetrics(context).density + 0.5f);
    }

    public static int spToPx(Context context, float sp) {
        return (int) (sp * getDisplayMetrics(context).scaledDensity + 0.5f);
    }

    public static int pxToSp(Context context, float px) {
        return (int) (px / getDisplayMetrics(context).scaledDensity + 0.5f);
    }

    public static int getDisplayWidth(Context context) {
        return getDisplayMetrics(context).widthPixels;
    }

    public static int getDisplayHeight(Context context) {
        return getDisplayMetrics(context).heightPixels;
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        return context.getResources().getDisplayMetrics();
    }
}
