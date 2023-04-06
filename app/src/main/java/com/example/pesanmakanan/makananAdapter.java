package com.example.pesanmakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class makananAdapter extends RecyclerView.Adapter<makananAdapter.makananviewHolder> {
    Context context;
    List<club> makananList;
    OnClickShowListener mOnClickShowListener;

    public makananAdapter(Context context, List<club> makananList, makananAdapter.OnClickShowListener onClickShowListener) {
        this.context = context;
        this.makananList = makananList;
        this.mOnClickShowListener = onClickShowListener;
    }

    @NonNull
    @Override
    public makananviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_makanan, parent, false);
        return new makananviewHolder(view, mOnClickShowListener);
    }

    @Override
    public void onBindViewHolder(@NonNull makananviewHolder holder, int position) {
        String name = makananList.get(position).getName();
        int logo = makananList.get(position).getLogo();

        holder.tvNamaMakanan.setText(name);
        holder.imgMakanan.setImageResource(logo);

    }

    @Override
    public int getItemCount() {
        return makananList.size();
    }

    public class makananviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvNamaMakanan;
        ImageView imgMakanan;
        OnClickShowListener onClickShowListener;
        public makananviewHolder(@NonNull View itemView, OnClickShowListener OnClickShowListener) {
            super(itemView);
            tvNamaMakanan = itemView.findViewById(R.id.nama_makan);
            imgMakanan = itemView.findViewById(R.id.makanan_logo);
            this.onClickShowListener = makananAdapter.this.mOnClickShowListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickShowListener.onClickShowListener(getAdapterPosition());
        }
    }
    public interface OnClickShowListener {
        void onClickShowListener(int position);
    }
}
