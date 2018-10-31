package com.example.dell.country;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    // list is cantianing FlagModle class
    private List<FlagModle> mData ;


    public RecyclerViewAdapter(Context mContext, List<FlagModle> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      // in here we create view for adpter
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardveiw_item_flag,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
     // in here we bind the created view
        holder.flags_title.setText(mData.get(position).getTitle());
        holder.img.setImageResource(mData.get(position).getImages());

        //seting On ClickListener for 2nd activity
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,Flag_Activity.class);

                // passing data to the flag activity
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Img_flags",mData.get(position).getImages());
                // start the activity
                mContext.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    // this is our view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView flags_title;
        ImageView img;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);

            flags_title = itemView.findViewById(R.id.flag_title_id) ;
            img =  itemView.findViewById(R.id.flag_img_id);
            cardView = itemView.findViewById(R.id.cardview_id);


        }
    }


}

