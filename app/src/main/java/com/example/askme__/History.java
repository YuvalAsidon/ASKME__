package com.example.askme__;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private LayoutAdapter mLayoutAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        mLayoutAdapter=new LayoutAdapter(getLayout());
        mRecyclerView=(RecyclerView)findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mLayoutAdapter);
    }
/*here we put what we want to display in the recyclerview*/

    private List<LayoutModel> getLayout (){
        ArrayList<LayoutModel> models =new ArrayList<>();
        models.add(new LayoutModel("movie","yes palent",
                "what movie should i go see?","the Avengers"));
        models.add(new LayoutModel("parking","city hall",
                "there is a slot?","yes"));
        models.add(new LayoutModel("restaurants","d area",
                "is little indea is good?","NO"));
        models.add(new LayoutModel("activity","yes plante",
                "is the performance is good?","yes"));
        models.add(new LayoutModel("parking","the old city",
                "there is parking near the water service?","no"));
        models.add(new LayoutModel("restaurants","BIG",
                "is BBB good?","yes"));
        models.add(new LayoutModel("movie","globus max",
                "should i go see captain marvil","yes"));
        models.add(new LayoutModel("activity","BIG",
                "should i go to see sttatic and benal","NO"));
        models.add(new LayoutModel("restaurants","IKEA",
                "is brakefest in IKEA is good","yes"));
        return models;
    }

}
