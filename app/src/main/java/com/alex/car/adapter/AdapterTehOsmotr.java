package com.alex.car.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alex.car.Data.Item;
import com.alex.car.Data.TehOsmotr;
import com.alex.car.R;
import java.util.List;


public class AdapterTehOsmotr extends RecyclerView.Adapter<AdapterTehOsmotr.ViewHolder> {

    private List<TehOsmotr> mTehOsmotrList;
    private Context context;

    public AdapterTehOsmotr(List<TehOsmotr> tehOsmotrList, Context context) {
        mTehOsmotrList = tehOsmotrList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.items_teh_osmotr, parent,false);
        context = parent.getContext();
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tehOsmTipDocumenta.setText(mTehOsmotrList.get(position).getTehOsmTipDocumenta());
        holder.tehOsmNumber.setText(mTehOsmotrList.get(position).getTehOsmNumber());
        holder.tehOsmVINTC.setText(mTehOsmotrList.get(position).getTehOsmVINTC());
        holder.tehOsmNumberCusovaTC.setText(mTehOsmotrList.get(position).getTehOsmNumberCusovaTC());
        holder.tehOsmRegNumber.setText(mTehOsmotrList.get(position).getTehOsmRegNumber());
        holder.tehOsmDataDiagnost.setText(mTehOsmotrList.get(position).getTehOsmDataDiagnost());
        holder.tehOsmSrokDeistvija.setText(mTehOsmotrList.get(position).getTehOsmSrokDeistvija());

    }

    @Override
    public int getItemCount() {
        return mTehOsmotrList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tehOsmTipDocumenta,tehOsmNumber, tehOsmVINTC, tehOsmNumberCusovaTC, tehOsmRegNumber,
                tehOsmDataDiagnost, tehOsmSrokDeistvija;

        public ViewHolder(View itemView) {
            super(itemView);

            tehOsmTipDocumenta = (TextView) itemView.findViewById(R.id.tehOsmTipDocumenta1);
            tehOsmNumber = (TextView) itemView.findViewById(R.id.tehOsmNumber1);
            tehOsmVINTC = (TextView) itemView.findViewById(R.id.tehOsmVINTC1);
            tehOsmNumberCusovaTC = (TextView) itemView.findViewById(R.id.tehOsmNumberCusovaTC1);
            tehOsmRegNumber = (TextView) itemView.findViewById(R.id.tehOsmRegNumber1);
            tehOsmDataDiagnost = (TextView) itemView.findViewById(R.id.tehOsmDataDiagnost1);
            tehOsmSrokDeistvija = (TextView) itemView.findViewById(R.id.tehOsmSrokDeistvija1);
        }

    }
}
