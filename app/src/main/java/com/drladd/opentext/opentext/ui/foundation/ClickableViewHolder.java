package com.drladd.opentext.opentext.ui.foundation;


import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Daryl on 03/09/2017.
 */

public class ClickableViewHolder<DataType> extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    public RecyclerCursorAdapter.ItemClickListener<DataType> mClickListener;
    public DataType mData;
    public Activity mContext;

    public ClickableViewHolder(Activity context, View itemView) {
        super(itemView);
        mContext = context;
    }

    @Override
    public void onClick(View view) {
        if(mClickListener != null){
            mClickListener.onItemClick(mData, view);
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (mClickListener != null) {
            mClickListener.onItemLongClick(mData, view);
        }
        return true;
    }
}
