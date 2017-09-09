package com.drladd.opentext.opentext.ui.conversationList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.drladd.opentext.opentext.R;
import com.drladd.opentext.opentext.data.Conversation;
import com.drladd.opentext.opentext.ui.foundation.RecyclerCursorAdapter;

/**
 * Created by Daryl on 06/09/2017.
 */

public class ConversationListAdapter extends RecyclerCursorAdapter<ConversationListViewHolder, Conversation> {

    public ConversationListAdapter(Activity context) {
        super(context);
    }

    @Override
    public ConversationListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        //TODO: create list object view layout resource for conversation list
        View view = inflater.inflate(R.layout.conversation_list_object, null);
        ConversationListViewHolder holder = new ConversationListViewHolder(mContext, view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ConversationListViewHolder holder, int position) {
        //TODO: currently calling default constructor - Needs replacing.
        Conversation conversation = new Conversation(mContext); //need to set this to default constructor once it's created.

        holder.mData = conversation;
        holder.mContext = mContext;
        holder.mClickListener = mItemClickListener;
        holder.rootView.setOnClickListener(holder);

        //TODO: Set message parameters for each item in the conversation list
        //set conversation date from last message


    }

    /*
    protected Conversation getConversation(int position){
        mCursor.moveToPosition(position);
    }
    */

    @Override
    public int getItemCount() {
        return 0;
    }
}
