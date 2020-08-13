package com.example.vvceapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemsDataAdapter extends RecyclerView.Adapter<ItemsDataAdapter.SimpleViewHolder> {

    private Context context;

    private int mNumberItems;
    private ArrayList<ItemsData> itemsData;

    public ItemsDataAdapter(ArrayList<ItemsData> itemsData) {
        this.itemsData = itemsData;
    }

    @NonNull
        @Override
        public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater .from(parent.getContext())
            .inflate(R.layout.list, parent, false);
            SimpleViewHolder viewHolder = new SimpleViewHolder(view);
            return viewHolder;
        }

    @Override
    public void onBindViewHolder (@NonNull SimpleViewHolder holder, int position) {
        holder.mImageView.setImageResource(itemsData.get(position).getImageResourceID());
        holder.mNameTv.setText(itemsData.get(position).getName());
        holder.mDesignationTv.setText(itemsData.get(position).getDesignation());
        holder.mQualificationTv.setText(itemsData.get(position).getQualification());
        }

        @Override
        public int getItemCount() {
            return itemsData.size();
        }


        public class SimpleViewHolder extends RecyclerView.ViewHolder {
            private TextView mDesignationTv;
            private ImageView mImageView;
            private TextView mNameTv;
            private TextView mQualificationTv;


            public SimpleViewHolder(View itemView) {
                super(itemView);
                mImageView = itemView.findViewById(R.id.imageView);
                mNameTv = itemView.findViewById(R.id.name);
                mDesignationTv = itemView.findViewById(R.id.designation);
                mQualificationTv = itemView.findViewById(R.id.qualification);
            }
        }
}



