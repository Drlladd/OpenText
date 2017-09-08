package com.drladd.opentext.opentext.ui.messagelist;

import android.app.Activity;
import android.view.ViewGroup;

import com.drladd.opentext.opentext.ui.foundation.RecyclerCursorAdapter;

/**
 * Created by Daryl on 06/09/2017.
 */

public class messagelistadapater extends RecyclerCursorAdapter<MessageListViewHolder, MessageItem> {
    public messagelistadapater(Activity context) {
        super(context);
    }

    @Override
    public MessageListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MessageListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
