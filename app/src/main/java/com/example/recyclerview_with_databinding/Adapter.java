package com.example.recyclerview_with_databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    String[] data;
    public Adapter(String[] data) {
        this.data = data;
    }

    @Override
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_item_name, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final Adapter.MyViewHolder holder, int position) {
        holder.textView.setText(data[position]);
        return;
    }

    @Override
    public int getItemCount() {
        return data.length;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public MyViewHolder(View view) {
            super(view);

            textView= view.findViewById(R.id.textView);
        }
    }
}
