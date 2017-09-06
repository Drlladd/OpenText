package com.drladd.opentext.opentext.ui.foundation;

import android.app.Activity;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Daryl on 03/09/2017.
 */

public abstract class RecyclerCursorAdapter<VH extends RecyclerView.ViewHolder, DataType> extends RecyclerView.Adapter<VH> {

    protected Activity mContext; //which activity the adapter has been attached to (Activity the recyclerview is in)
    protected Cursor mCursor; //link to database
    protected ItemClickListener<DataType> mItemClickListener;

    //Internal interface so that it can be used without needing to pass Context every time.
    public interface ItemClickListener<DataType> {
        void onItemClick(DataType object, View view);

        void onItemLongClick(DataType object, View view);
    }

    //TODO: selecting multiple items
    // need to add iterface for selecting multiple items from an array(?) of recyclerview items

    //Constructor setting the context of the class
    public RecyclerCursorAdapter(Activity context) {
        mContext = context;
    }

    public void setmItemClickListener(ItemClickListener<DataType> conversationClickListener) {
        mItemClickListener = conversationClickListener;
    }

}
