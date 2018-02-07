package com.adhamenaya.versatileadapter.models;

import com.adhamenaya.versatileadapter.ItemModel;

/**
 * Created by AENAYA on 2/6/2018.
 */

public class TextBoxModel implements ItemModel {

    public static final int TYPE = 1;

    private String mText;

    public TextBoxModel(String text) {
        mText = text;
    }

    @Override
    public int getType() {
        return TYPE;
    }


    public String getText() {
        return mText;
    }

}
