package com.am.moqawalat.Aadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.am.moqawalat.R;
import com.am.moqawalat.model.SpcAdvDetail;

import java.util.List;

public class SpcAdvDetAdapter extends RecyclerView.Adapter<SpcAdvDetAdapter.SpcAdvVH> {
    Context mContext;
    List<SpcAdvDetail> mData;

    public SpcAdvDetAdapter(Context mContext, List<SpcAdvDetail> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    public class SpcAdvVH extends RecyclerView.ViewHolder {
        private TextView tvName;
        private TextView tv_phone;
        private TextView tv_date;
        private TextView tv_place;
        private ImageView iv_photo;
        private View lyt_parent;

        public SpcAdvVH(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.ads_name);
            tv_phone = itemView.findViewById(R.id.adv_owner_phone_id);
            tv_date = itemView.findViewById(R.id.adv_date_id);
            tv_place = itemView.findViewById(R.id.ad_place_id);
            iv_photo = itemView.findViewById(R.id.adv_img_id);
            lyt_parent = itemView.findViewById(R.id.lyt_parent);
        }
    }


    @Override
    public SpcAdvVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_spc_ad_detail, parent, false);
        SpcAdvVH vHolder = new SpcAdvVH(v);
        vHolder.itemView.setOnClickListener(v1 -> {
            Toast.makeText(mContext, "" + vHolder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
        });
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SpcAdvVH holder, int position) {
        holder.tv_phone.setText(mData.get(position).getAdvPhone());
        holder.tv_date.setText(mData.get(position).getAdvDate());
        holder.iv_photo.setImageResource(mData.get(position).getAdvPhoto());
        holder.tvName.setText(mData.get(position).getAdvName());
        holder.tv_place.setText(mData.get(position).getAdvPlace());

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

}
