package com.example.askme__;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import com.example.askme__.R;
import com.example.askme__.LayoutModel;
import java.util.List;
public class LayoutAdapter extends RecyclerView.Adapter<LayoutAdapter.LayoutViewHolder> {
    private List<LayoutModel> models;

    public LayoutAdapter(List<LayoutModel> models){
        this.models=models;
    }

    @NonNull
    @Override
    public LayoutViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view,viewGroup,false);
        return new LayoutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LayoutViewHolder layoutViewHolder, int i) {
        layoutViewHolder.category.setText(models.get(i).getCategory());
        layoutViewHolder.where.setText(models.get(i).getWhere());
        layoutViewHolder.question.setText(models.get(i).getQuestion());
        layoutViewHolder.answer.setText(models.get(i).getAnswer());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    class LayoutViewHolder extends RecyclerView.ViewHolder{
        TextView category;
        TextView where;
        TextView question;
        TextView answer ;
        public LayoutViewHolder(@NonNull View itemView) {
            super(itemView);
            category=itemView.findViewById(R.id.category);
            where=itemView.findViewById(R.id.where);
            question=itemView.findViewById(R.id.question);
            answer=itemView.findViewById(R.id.answer);
        }
    }
}
