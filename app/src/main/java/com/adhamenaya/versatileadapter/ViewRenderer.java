package com.adhamenaya.versatileadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by AENAYA on 2/6/2018.
 */

public abstract class ViewRenderer<M extends ItemModel, VH extends RecyclerView.ViewHolder> {

    private int mType;
    private Context mContext;

    public ViewRenderer(int type, Context context) {
        mType = type;
        mContext = context;
    }

    public abstract void bindView(@NonNull M model, @NonNull VH holder);

    public abstract VH onCreateViewHolder(@NonNull ViewGroup group);

    public int getType() {
        return mType;
    }

    public Context getContext() {
        return mContext;
    }
}
