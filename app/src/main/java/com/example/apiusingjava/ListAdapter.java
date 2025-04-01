package com.example.apiusingjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CustomViewholder> {

    private List<PostPojo> datalist;
    private Context context;

    public ListAdapter(List<PostPojo> datalist, Context context)
    {
        this.datalist=datalist;
        this.context=context;
    }


    @NonNull
    @Override
    public ListAdapter.CustomViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.itemview,parent,false);
        return new CustomViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.CustomViewholder holder, int position) {
        holder.title.setText(datalist.get(position).getTitle());
        holder.body.setText(datalist.get(position).getBody());
        holder.id.setText(String.valueOf(datalist.get(position).getid()));

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }


    public class CustomViewholder extends RecyclerView.ViewHolder {
        TextView title;
        TextView body;
        TextView id;
        public CustomViewholder(@NonNull View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.id);
            title=itemView.findViewById(R.id.title);
            body=itemView.findViewById(R.id.body);

        }
    }
}
