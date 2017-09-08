package com.drladd.opentext.opentext.ui.conversationList;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.drladd.opentext.opentext.R;
import com.drladd.opentext.opentext.data.Conversation;
import com.drladd.opentext.opentext.ui.foundation.RecyclerCursorAdapter;

/**
 * Created by Daryl on 07/09/2017.
 */

public class FragmentConversationList extends Fragment implements LoaderManager.LoaderCallbacks<Cursor>, RecyclerCursorAdapter.ItemClickListener<Conversation>{

    private ConversationListAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;
    private FloatingActionButton mNewMsgFab;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        /**
         * bind fragment objects on load of fragment
         */
        mAdapter = new ConversationListAdapter(getActivity());
        mAdapter.setmItemClickListener(this);
        mLayoutManager = new LinearLayoutManager(getActivity());

        mRecyclerView = (RecyclerView)getView().findViewById(R.id.conversations_list);
        mNewMsgFab = (FloatingActionButton)getView().findViewById(R.id.mFab);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_conversation_list, null);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        //initLoaderManager();

        return view;
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }

    @Override
    public void onItemClick(Conversation object, View view) {

    }

    @Override
    public void onItemLongClick(Conversation object, View view) {

    }
}
