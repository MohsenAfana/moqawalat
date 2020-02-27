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
import com.am.moqawalat.model.MaterialsAds;

import java.util.List;

public class MaterialRVAdapter extends RecyclerView.Adapter<MaterialRVAdapter.MaterialViewHolder> {
    Context context;
    List<MaterialsAds> mData;
    private OnItemClickListener onItemClickListener;


    public MaterialRVAdapter(Context context, List<MaterialsAds> mData) {
        this.context = context;
        this.mData = mData;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, MaterialsAds obj, int position);
    }

    public void setOnItemClickListener(final MaterialRVAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public MaterialViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_main_advertisement, parent, false);
        MaterialViewHolder vHolder = new MaterialViewHolder(v);
        vHolder.itemView.setOnClickListener(v1 -> Toast.makeText(context, "Test Click" + vHolder.getAdapterPosition(), Toast.LENGTH_SHORT).show());
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MaterialViewHolder holder, int position) {
        MaterialsAds obj = mData.get(position);
        if (holder instanceof MaterialViewHolder) {
            MaterialViewHolder view = holder;

            view.lyt_parent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(view, mData.get(position), position);
                    }
                }
            });

        }
//        holder.tvName.setText(mData.get(position).getAdvName());
//
//        holder.tv_salary.setText(mData.get(position).getAdvSalary());
//
//        holder.tv_phone.setText(mData.get(position).getAdvPhone());
//        holder.tv_date.setText(mData.get(position).getAdvDate());
//        holder.iv_photo.setImageResource(mData.get(position).getAdvPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MaterialViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName;
        private TextView tv_phone;
        private TextView tv_date;
        private TextView tv_salary;
        private ImageView iv_photo;
        private View lyt_parent;


        public MaterialViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.pinned_adv_name_id);
            tv_phone = itemView.findViewById(R.id.pinned_adv_owner_phone_id);
            tv_date = itemView.findViewById(R.id.pinned_adv_date_id);
            tv_salary = itemView.findViewById(R.id.pinned_adv_cost_id);
            iv_photo = itemView.findViewById(R.id.pinned_adv_img_id);
            lyt_parent = itemView.findViewById(R.id.lyt_parent);

        }
    }

}


