package com.am.moqawalat.Aadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.am.moqawalat.R;
import com.am.moqawalat.model.MachAndVehichAds;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MachinesRVAdapter extends RecyclerView.Adapter {
    Context mContext;
    ArrayList<MachAndVehichAds> mData;
    int total_types;

    public static class FreeMachVH extends RecyclerView.ViewHolder {
        private TextView tvName;
        private TextView tv_phone;
        private TextView tv_date;

        private TextView tv_salary;

        private ImageView iv_photo;
        private View lyt_parent;


        public FreeMachVH(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.Free_adv_name_id);
            tv_phone = itemView.findViewById(R.id.Free_adv_owner_phone_id);
            tv_date = itemView.findViewById(R.id.Free_adv_date_id);
            tv_salary = itemView.findViewById(R.id.Free_adv_cost_id);
            iv_photo = itemView.findViewById(R.id.Free_adv_img_id);
            lyt_parent = itemView.findViewById(R.id.lyt_parent);

        }

    }

    public static class PinnedMachVH extends RecyclerView.ViewHolder {
        private TextView tvName;
        private TextView tv_phone;
        private TextView tv_date;

        private TextView tv_salary;

        private ImageView iv_photo;
        private View lyt_parent;


        public PinnedMachVH(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.pinned_adv_name_id);
            tv_phone = itemView.findViewById(R.id.pinned_adv_owner_phone_id);
            tv_date = itemView.findViewById(R.id.pinned_adv_date_id);
            tv_salary = itemView.findViewById(R.id.pinned_adv_cost_id);
            iv_photo = itemView.findViewById(R.id.pinned_adv_img_id);
            lyt_parent = itemView.findViewById(R.id.lyt_parent);

        }

    }

    private OnItemClickListener onItemClickListener;


    public MachinesRVAdapter(Context mContext, ArrayList<MachAndVehichAds> mData) {
        this.mContext = mContext;
        this.mData = mData;
        total_types = mData.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case MachAndVehichAds.FREE_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_advertisement, parent, false);
                return new FreeMachVH(view);
            case MachAndVehichAds.PINNED_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pinned_main_adv, parent, false);
                return new PinnedMachVH(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NotNull final RecyclerView.ViewHolder holder, final int position) {
        MachAndVehichAds object = mData.get(position);
        if (object != null) {
            switch (object.type) {
                case MachAndVehichAds.FREE_TYPE:
                    ((FreeMachVH) holder).iv_photo.setImageResource(object.getAdvPhoto());
                    ((FreeMachVH) holder).tv_date.setText(object.getAdvDate());
                    ((FreeMachVH) holder).tv_phone.setText(object.getAdvPhone());
                    ((FreeMachVH) holder).tvName.setText(object.getAdvName());
//                    ((FreeMachVH) holder).tv_salary.setText(object.getAdvSalary());
                    break;

                case MachAndVehichAds.PINNED_TYPE:
                    ((PinnedMachVH) holder).iv_photo.setImageResource(object.getAdvPhoto());
                    ((PinnedMachVH) holder).tv_date.setText(object.getAdvDate());
                    ((PinnedMachVH) holder).tv_phone.setText(object.getAdvPhone());
                    ((PinnedMachVH) holder).tvName.setText(object.getAdvName());
//                    ((PinnedMachVH) holder).tv_salary.setText(object.getAdvSalary());
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public interface OnItemClickListener {
        void onItemClick(View view, MachAndVehichAds obj, int position);
    }

    public void setOnItemClickListener(final OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getItemViewType(int position) {
        switch (mData.get(position).type) {
            case 0:
                return MachAndVehichAds.FREE_TYPE;
            case 1:
                return MachAndVehichAds.PINNED_TYPE;
            default:
                return -1;
        }

    }


}
