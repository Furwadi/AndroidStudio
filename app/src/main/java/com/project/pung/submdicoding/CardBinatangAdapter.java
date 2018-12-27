package com.project.pung.submdicoding;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardBinatangAdapter extends RecyclerView.Adapter<CardBinatangAdapter.CardViewViewHolder> {
    private ArrayList<Binatang> listBinatang;
    private Context context;



    public CardBinatangAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Binatang> getListBinatang() {
        return listBinatang;
    }

    public void setListBinatang(ArrayList<Binatang> listBinatang) {
        this.listBinatang = listBinatang;
    }



    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_binatang, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {

        Binatang p = getListBinatang().get(position);

        Glide.with(context)
                .load(p.getPhoto())
                //.override(350, 550)
                .into(holder.imgPhoto);

        holder.tvName.setText(p.getName());
        holder.tvRemarks.setText(p.getRemarks());
        //holder.tvDetails.setText(p.getDetails());

        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {

                Intent intent = new Intent(context, BinatangActivity.class);
                //intent.putExtra(BinatangActivity.Extra_Foto, "");
                intent.putExtra("nama", getListBinatang().get(position).getName().toString());
                intent.putExtra("photo", getListBinatang().get(position).getPhoto().toString());
                intent.putExtra("details", getListBinatang().get(position).getRemarks().toString());
                context.startActivity(intent);
            }

            //@Override
            //public void onItemClicked(View view, int position) {


               // public void onClick(View view){
                    //listBinatang.remove(BinatangData);
               // }
                //Toast.makeText(context, "Details "+getListBinatang().get(position).getName(), Toast.LENGTH_SHORT).show();
            //}


        }));

        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share " + getListBinatang().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }




    @Override
    public int getItemCount() {
        return getListBinatang().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks, tvDetails;
        Button btnFavorite, btnShare;
        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            //tvDetails = (TextView)itemView.findViewById(R.id.t_details)
            btnFavorite = (Button)itemView.findViewById(R.id.btn_set_favorite);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);

        }
    }
}
