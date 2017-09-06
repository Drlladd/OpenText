package com.drladd.opentext.opentext.ui.messagelist;

import android.content.Context;

/**
 * Created by Daryl on 06/09/2017.
 */

public class MessageItem {
    // Message set variables
    //final Context mContext;
    //public final String mType;
    //public final int mMessageId;

    public enum DeliveryStatus  { NONE, INFO, FAILED, PENDING, RECEIVED }

    //Delivery variables
    public String mDeliveryStatusString;
    public DeliveryStatus mDeliveryStatus;
    public String mReadReportString;
    public boolean mReadReport;

}
