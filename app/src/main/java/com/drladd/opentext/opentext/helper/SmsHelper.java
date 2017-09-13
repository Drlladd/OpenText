package com.drladd.opentext.opentext.helper;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.SmsManager;

import com.drladd.opentext.opentext.data.Message;

/**
 * Created by Daryl on 09/09/2017.
 */

public class SmsHelper {
    /**
     * Content provider Uris for sms and mms
     */
    public static final Uri SMS_CONTENT_PROVIDER = Uri.parse("content://sms/");
    public static final Uri MMS_CONTENT_PROVIDER = Uri.parse("content://mms/");
    public static final Uri SMS_MMS_CONTENT_PROVIDER = Uri.parse("content://mms-sms/conversations/");
    public static final Uri DRAFTS_CONTENT_PROVIDER = Uri.parse("content://sms/draft/");
    public static final Uri PENDING_MESSAGE_CONTENT_PROVIDER = Uri.parse("content://sms/outbox/");
    public static final Uri CONVERSATION_LIST_CONTENT_PROVIDER = Uri.parse("content://mms-sms/conversations?simple=true");
    public static final Uri RECEIVED_MESSAGE_CONTENT_PROVIDER = Uri.parse("content://mms-sms/conversations?simple=true");
    public static final Uri SENT_MESSAGE_CONTENT_PROVIDER = Uri.parse("content://sms/sent/");
    public static final Uri ADDRESS_CONTENT_PROVIDER = Uri.parse("content://mms-sms/canonical-addresses");

    //Read/Unread byte variables for cursor
    public static final byte UNREAD = 0;
    public static final byte READ = 1;


    //Sort variables
    public static final String sortDateDesc = "date DESC";
    public static final String sortDateAsc = "date ASC";

    //Columns for SMS content providers
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_THREAD_ID = "thread_id";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_RECIPIENT = "recipient_ids";
    public static final String COLUMN_PERSON = "person";
    public static final String COLUMN_SNIPPET = "snippet";
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_DATE_NORMALISED = "normalised_dates";
    public static final String COLUMN_DATE_SENT = "date_sent";
    public static final String COLUMN_STATUS = "status";
    public static final String COLUMN_ERROR = "error";
    public static final String COLUMN_READ = "read";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_MMS = "ct_t";
    public static final String COLUMN_TEXT = "text";
    public static final String COLUMN_SUB = "sub";
    public static final String COLUMN_MSG_BOX = "msg_box";
    public static final String COLUMN_SUBJECT = "subject";
    public static final String COLUMN_BODY = "body";
    public static final String COLUMN_SEEN = "seen";

    public static final String READ_SELECTION = COLUMN_READ + " = " + READ;
    public static final String UNREAD_SELECTION = COLUMN_READ + " = " + UNREAD;
    public static final String UNSEEN_SELECTION = COLUMN_SEEN + " = " + UNREAD;
    public static final String FAILED_SELECTION = COLUMN_TYPE + " = " + Message.FAILED;

    private SmsManager sms;

    //Message Types
    public static final int MESSAGE_TYPE_ALL = 0;
    public static final int MESSAGE_TYPE_INBOX = 1;
    public static final int MESSAGE_TYPE_SENT = 2;
    public static final int MESSAGE_TYPE_DRAFT = 3;
    public static final int MESSAGE_TYPE_OUTBOX = 4;
    public static final int MESSAGE_TYPE_FAILED = 5;
    public static final int MESSAGE_TYPE_QUED = 6;



    //Default Constructor
    public SmsHelper() {

    }

    public static void markSmsAsSeen(Context context){
        Cursor cursor = context.getContentResolver().query(RECEIVED_MESSAGE_CONTENT_PROVIDER, new String[]{SmsHelper.COLUMN_ID}, SmsHelper.UNSEEN_SELECTION + " AND " + SmsHelper.UNREAD_SELECTION, null, null);


        //MessageColumns.ColumnsMap map = new MessageColumns.ColumnsMap(cursor);
    }

}
