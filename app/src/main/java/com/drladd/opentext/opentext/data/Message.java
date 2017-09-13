package com.drladd.opentext.opentext.data;

import android.content.Context;
import android.net.Uri;

/**
 * Created by Daryl on 09/09/2017.
 */

public class Message {

    public static final int RECEIVED = 1;
    public static final int SENT = 2;
    public static final int DRAFT = 3;
    public static final int SENDING = 4;
    public static final int FAILED = 5;

    public static final Uri SMS_CONTENT_PROVIDER = Uri.parse("content://sms/");
    public static final Uri MMS_SMS_CONTENT_PROVIDER = Uri.parse("content://mms-sms/conversations/");
    public static final Uri SENT_MESSAGE_CONTENT_PROVIDER = Uri.parse("contect://sms/inbox");

    //ContentResolver columns
    static final Uri RECEIVED_MESSAGE_CONTENT_PROVIDER = Uri.parse("content://sms/inbox");
    private Context context;
    private Uri uri;
    private long id;
    private long threadId;
    private String body;
    private String address;
    private String name;
    private long contectId;
    private boolean read;




}
