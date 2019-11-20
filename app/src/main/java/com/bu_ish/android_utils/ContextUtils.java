package com.bu_ish.android_utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

import androidx.annotation.Nullable;

public class ContextUtils {
    @Nullable
    public static Activity getActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        } else if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        } else {
            return null;
        }
    }
}
