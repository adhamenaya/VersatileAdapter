package com.adhamenaya.versatileadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.adhamenaya.versatileadapter.Renderers.TextBoxRenderer;
import com.adhamenaya.versatileadapter.models.TextBoxModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VersatileAdapter adapter = new VersatileAdapter();
        adapter.setItems(getItems());
        adapter.registerRenderer(new TextBoxRenderer(TextBoxModel.TYPE, this));

        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private List<ItemModel> getItems() {
        List<ItemModel> models = new ArrayList<ItemModel>();
        TextBoxModel textBoxModel = new TextBoxModel("Text box 1");
        models.add(textBoxModel);
        return models;
    }
}
