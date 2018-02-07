package com.adhamenaya.versatileadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by AENAYA on 2/6/2018.
 */

public class VersatileAdapter extends RecyclerView.Adapter {


    private SparseArray<ViewRenderer> mRenderers = new SparseArray<ViewRenderer>();

    private List<ItemModel> mItems;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewRenderer renderer = mRenderers.get(viewType);

        if (renderer != null)
            return renderer.onCreateViewHolder(parent);
        throw new RuntimeException("Not supported Item View Type: " + viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ViewRenderer renderer = mRenderers.get(getItemType(position));

        if (renderer == null)
            renderer.bindView(getItem(position), holder);

        throw new RuntimeException("Not supported Item View Type: " + holder);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setItems(List<ItemModel> items) {
        mItems.addAll(items);
    }

    public void registerRenderer(@NonNull ViewRenderer renderer) {
        if (mRenderers.get(renderer.getType()) == null)
            mRenderers.put(renderer.getType(), renderer);
        else
            throw new RuntimeException("ViewRenderer already exist with this type: " + renderer.getType());
    }

    private ItemModel getItem(int position) {
        return mItems.get(position);
    }

    private int getItemType(int position) {
        return getItem(position).getType();
    }
}
