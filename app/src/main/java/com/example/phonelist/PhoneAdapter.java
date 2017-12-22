package com.example.phonelist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 2017/12/21.
 */

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.ViewHolder>{
    private List<Data> mData;
    private LayoutInflater mlayoutinflater;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView nameTextView;
        TextView numberTextView;
         public ViewHolder(View view){
             super(view);
             nameTextView = view.findViewById(R.id.name_item);
             numberTextView = view.findViewById(R.id.number_item);
         }
    }

    public PhoneAdapter(Context context, List<Data> mData){
        this.mlayoutinflater=LayoutInflater.from(context);
        this.mData= mData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mlayoutinflater.inflate(R.layout.phone_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Data data = mData.get(position);
        holder.nameTextView.setText(data.getName());
        holder.numberTextView.setText(data.getNumber());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
