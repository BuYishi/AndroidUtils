package com.bu_ish.android_utils;

import android.content.Context;
import android.os.Vibrator;

import androidx.annotation.RequiresPermission;

import java.util.Objects;

public class VibrateUtils {
    @RequiresPermission(android.Manifest.permission.VIBRATE)
    public static void vibrate(Context context, long milliseconds) {
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        Objects.requireNonNull(vibrator).vibrate(milliseconds);
    }
}
