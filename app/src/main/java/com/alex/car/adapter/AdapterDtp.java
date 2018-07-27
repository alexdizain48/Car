package com.alex.car.adapter;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alex.car.Data.Dtp;
import com.alex.car.R;

import java.util.List;

public class AdapterDtp extends RecyclerView.Adapter<AdapterDtp.ViewHolder> {

    private List<Dtp> dtpList;
    private Context context;

    public AdapterDtp(List<Dtp> dtpList, Context context) {
        this.dtpList = dtpList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.items_dtp, parent,false);
        context = parent.getContext();
        return  new AdapterDtp.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.dtpData.setText(dtpList.get(position).getDtpData());
        holder.dtpTip.setText(dtpList.get(position).getDtpTip());
        holder.dtpRegionProishestwija.setText(dtpList.get(position).getDtpRegionProishestwija());
       // holder.dtpImg.setImageBitmap(BitmapFactory.decodeByteArray());

    }

    @Override
    public int getItemCount() {
        return dtpList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView dtpData, dtpTip, dtpRegionProishestwija;
        private ImageView dtpImg;

        public ViewHolder(View itemView) {
            super(itemView);

            dtpData = (TextView) itemView.findViewById(R.id.dtpData);
            dtpTip = (TextView) itemView.findViewById(R.id.dtpTip);
            dtpRegionProishestwija = (TextView) itemView.findViewById(R.id.dtpRegionProishestwija);
            dtpImg = (ImageView) itemView.findViewById(R.id.dtpImg);
        }
    }
}
