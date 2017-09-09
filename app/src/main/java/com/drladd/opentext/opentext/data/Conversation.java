package com.drladd.opentext.opentext.data;

import android.content.Context;

/**
 * Created by Daryl on 06/09/2017.
 */

public class Conversation {
    /**
     * TODO: build data model for a conversation object
     * is this going to be an array of messages?
     */

    private final Context mContext;


    //private constructors
    public Conversation (Context context){
        mContext = context;
        //mRecipients = new ContactList();
    }


    public static Conversation createNew(Context context){
        return new Conversation(context);
    }

}

