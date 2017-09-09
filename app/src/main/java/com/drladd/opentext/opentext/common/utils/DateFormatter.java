package com.drladd.opentext.opentext.common.utils;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.text.format.DateFormat;
import android.text.format.DateUtils;

import com.drladd.opentext.opentext.R;

/**
 * Created by Daryl on 08/09/2017.
 */

public class DateFormatter {

    public static String getConversationTimeStamp(Context context, long date){
        if(isSameDay(date)){
            return checkForUsing24HourTime(context, new SimpleDateFormat("h:mm a")).format(date);
        } else if (isSameWeek(date)){
            return DateUtils.formatDateTime(context, date, DateUtils.FORMAT_SHOW_WEEKDAY | DateUtils.FORMAT_ABBREV_WEEKDAY);
        } else if (isSameYear(date)){
            return DateUtils.formatDateTime(context, date, DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NO_YEAR | DateUtils.FORMAT_ABBREV_MONTH);
        } else {
            return DateUtils.formatDateTime(context, date, DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_MONTH);
        }
    }

    public static String getConversationMessageTimeStamp(Context context, long date){
        String messageTime = ", " + checkForUsing24HourTime(context, new SimpleDateFormat("h:mm a")).format(date);

        if(isSameDay(date)){
            return checkForUsing24HourTime(context, new SimpleDateFormat("h:mm a")).format(date);
        } else if (isYesterday(date)){
            return context.getString(R.string.date_yesterday) + messageTime;
        } else if (isSameWeek(date)){
            return DateUtils.formatDateTime(context, date, DateUtils.FORMAT_SHOW_WEEKDAY | DateUtils.FORMAT_ABBREV_WEEKDAY) + messageTime;
        } else if(isSameYear(date)){
            return DateUtils.formatDateTime(context, date, DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NO_YEAR | DateUtils.FORMAT_ABBREV_MONTH) + messageTime;
        }

        return DateUtils.formatDateTime(context, date, DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_MONTH) + messageTime;

    }

    public static boolean isSameDay(long date){
        SimpleDateFormat pattern = new SimpleDateFormat("D, y");
        return pattern.format(date).equals(pattern.format(System.currentTimeMillis()));
    }

    public static boolean isSameWeek(long date){
        SimpleDateFormat pattern = new SimpleDateFormat("w, y");
        return pattern.format(date).equals(pattern.format(System.currentTimeMillis()));
    }

    public static boolean isSameYear(long date){
        SimpleDateFormat pattern = new SimpleDateFormat("y");
        return pattern.format(date).equals(pattern.format(System.currentTimeMillis()));
    }

    public static boolean isYesterday(long date){
        SimpleDateFormat pattern = new SimpleDateFormat("yD");
        return pattern.format(date).equals(pattern.format(System.currentTimeMillis()));
    }

    public static SimpleDateFormat checkForUsing24HourTime(Context context, SimpleDateFormat date){
        //First check if the device is using 24H time
        boolean isUsing24HourTime = DateFormat.is24HourFormat(context);

        //If 24H is true then return a simple time format instead
        if(isUsing24HourTime){
            return new SimpleDateFormat(date.toPattern().replace('h','H').replaceAll(" a", ""));
        } else return date;
    }



}
