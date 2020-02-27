package com.am.moqawalat.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.am.moqawalat.Aadapter.MachinesRVAdapter;
import com.am.moqawalat.Ads_detail;
import com.am.moqawalat.R;
import com.am.moqawalat.model.MachAndVehichAds;
import com.am.moqawalat.utils.Tools;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;

import java.util.ArrayList;

public class MachinesVehiclesFragment extends Fragment {
    View v;
    private RecyclerView myrecyclerView;
    private ArrayList<MachAndVehichAds> lstAds;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.machines_vehicles_fragmet, container, false);
        myrecyclerView = v.findViewById(R.id.machines_recyclerView);
        myrecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        myrecyclerView.addItemDecoration(new SpacingItemDecoration(2, Tools.dip2px(this, 3)));
        myrecyclerView.setHasFixedSize(true);

        MachinesRVAdapter machinesRVAdapter = new MachinesRVAdapter(getContext(), lstAds);
        machinesRVAdapter.setOnItemClickListener((view, obj, position) -> startActivity(new Intent(getContext(), Ads_detail.class)));
        myrecyclerView.setAdapter(machinesRVAdapter);

        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstAds = new ArrayList<>();
        lstAds.add(new MachAndVehichAds("Mohsen", "0599746197", "13.12.11", R.drawable.main_image));
        lstAds.add(new MachAndVehichAds("Ali", "0599746197", "13.12.11", R.drawable.image_shop_11));
        lstAds.add(new MachAndVehichAds("Mohsen", "0599746197", "13.12.11", R.drawable.image_shop_9));
        lstAds.add(new MachAndVehichAds("M", "0599746197", "13.12.11", R.drawable.image_shop_9));
        lstAds.add(new MachAndVehichAds("A", "0599746197", "13.12.11", R.drawable.image_shop_10));
        lstAds.add(new MachAndVehichAds("C", "0599746197", "13.12.11", R.drawable.image_shop_12));
        lstAds.add(new MachAndVehichAds("image_shop_13", "0599746197", "13.12.11", R.drawable.main_image));
        lstAds.add(new MachAndVehichAds("Mohsen", "0599746197", "13.12.11", R.drawable.image_2));
        lstAds.add(new MachAndVehichAds("D", "0599746197", "13.12.11", R.drawable.main_image));
        lstAds.add(new MachAndVehichAds("MWohsen", "0599746197", "13.12.11", R.drawable.ic_star));
        lstAds.add(new MachAndVehichAds("G", "0599746197", "13.12.11", R.drawable.instagram));
        lstAds.add(new MachAndVehichAds("BBB", "0599746197", "13.12.11", R.drawable.image_shop_13));
        lstAds.add(new MachAndVehichAds("wwww", "0599746197", "13.12.11", R.drawable.main_image));
        lstAds.add(new MachAndVehichAds("mmmmm", "0599746197", "13.12.11", R.drawable.image_shop_10));
        lstAds.add(new MachAndVehichAds("kkkk", "0599746197", "13.12.11", R.drawable.image_shop_13));
        lstAds.add(new MachAndVehichAds("mmmmmm", "0599746197", "13.12.11", R.drawable.main_image));

    }
}
