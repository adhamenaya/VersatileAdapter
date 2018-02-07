package com.adhamenaya.versatileadapter.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import com.adhamenaya.versatileadapter.R;

/**
 * Created by AENAYA on 2/6/2018.
 */

public class TextBoxViewHolder extends RecyclerView.ViewHolder {

    public EditText text;

    public TextBoxViewHolder(View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.editText);
    }
}
