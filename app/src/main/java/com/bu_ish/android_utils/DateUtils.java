package com.bu_ish.android_utils;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
    public static String getCurrentTime(String pattern) {
        return createSimpleDateFormat(pattern).format(new Date());
    }

    public static String format(String source, String sourcePattern, String destinationPattern) {
        try {
            SimpleDateFormat sourceFormat = createSimpleDateFormat(sourcePattern);
            SimpleDateFormat destinationFormat = createSimpleDateFormat(destinationPattern);
            return destinationFormat.format(Objects.requireNonNull(sourceFormat.parse(source)));
        } catch (ParseException ex) {
            return "";
        }
    }

    public static String timestampToString(int timestampSecs, String pattern) {
        return timestampToString(timestampSecs * 1000L, pattern);
    }

    public static String timestampToString(long timestampMillis, String pattern) {
        return createSimpleDateFormat(pattern).format(new Date(timestampMillis));
    }

    @SuppressLint("SimpleDateFormat")
    private static SimpleDateFormat createSimpleDateFormat(String pattern) {
        return new SimpleDateFormat(pattern);
    }
}
