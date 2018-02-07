package com.adhamenaya.versatileadapter.Renderers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.adhamenaya.versatileadapter.R;
import com.adhamenaya.versatileadapter.ViewRenderer;
import com.adhamenaya.versatileadapter.models.TextBoxModel;
import com.adhamenaya.versatileadapter.viewholders.TextBoxViewHolder;

/**
 * Created by AENAYA on 2/6/2018.
 */

public class TextBoxRenderer extends ViewRenderer<TextBoxModel, TextBoxViewHolder> {


    public TextBoxRenderer(int type, Context context) {
        super(type, context);
    }

    @Override
    public TextBoxViewHolder onCreateViewHolder(@NonNull ViewGroup group) {
        return new TextBoxViewHolder(
                LayoutInflater.from(getContext())
                        .inflate(R.layout.cell_text_box, group, false));
    }

    @Override
    public void bindView(@NonNull TextBoxModel model, @NonNull TextBoxViewHolder holder) {
        holder.text.setText(model.getText());
    }
}
