package com.drladd.opentext.opentext.ui.messagelist;

import android.app.Activity;

import com.drladd.opentext.opentext.ui.foundation.RecyclerCursorAdapter;

/**
 * Created by Daryl on 06/09/2017.
 */

public class messagelistadapater extends RecyclerCursorAdapter<MessageListViewHolder, MessageItem> {
    public messagelistadapater(Activity context) {
        super(context);
    }
}
