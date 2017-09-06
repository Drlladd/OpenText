package com.drladd.opentext.opentext.ui.conversationList;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.drladd.opentext.opentext.R;
import com.drladd.opentext.opentext.data.Conversation;
import com.drladd.opentext.opentext.ui.foundation.ClickableViewHolder;

/**
 * Created by Daryl on 06/09/2017.
 */

/***
 * Class used to create objects about the conversations with contacts.
 *
 */
public class ConversationListViewHolder extends ClickableViewHolder<Conversation> {
    //TODO: Research ASyncTasks to handle reading conversation from disk (Would it be better to cache?)
    //TODO: Research how to best store individual messages once read from database API (LinkedList?)
    //^ Created a Class, Adapter, and ViewHolder to store individual messages -> UI -> MessageList
    //are these referenced in ConversationList though?
    //TODO: Get the basics running to test querying database to test the conversation fragment

    View rootView;
    TextView recipientView;
    TextView messageSnippet;
    TextView lastUpdateDate;

    public ConversationListViewHolder(Activity context, View itemView) {
        super(context, itemView);

        /**
         * As the fragment has not been created yet these need to remain commented for the time being.
         */
        //rootView = itemView;
        recipientView = (TextView) rootView.findViewById(R.id.conversation_list_recipient_name);
        messageSnippet = (TextView) rootView.findViewById(R.id.conversation_list_last_message_snippet);
        lastUpdateDate = (TextView) rootView.findViewById(R.id.conversation_list_last_conversation_update_date);

    }
}
