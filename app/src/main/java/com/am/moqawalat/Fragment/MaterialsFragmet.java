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

import com.am.moqawalat.Aadapter.MaterialRVAdapter;
import com.am.moqawalat.Ads_detail;
import com.am.moqawalat.R;
import com.am.moqawalat.model.MaterialsAds;
import com.am.moqawalat.utils.Tools;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MaterialsFragmet extends Fragment {
    View v;
    private RecyclerView myrecyclerView;
    private List<MaterialsAds> lstAds;


    public MaterialsFragmet() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.material_fragment, container, false);
        myrecyclerView = v.findViewById(R.id.material_recyclerView);
        myrecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        myrecyclerView.addItemDecoration(new SpacingItemDecoration(2, Tools.dip2px(this, 3)));
        myrecyclerView.setHasFixedSize(true);
        MaterialRVAdapter recyclerViewAdapter = new MaterialRVAdapter(getContext(), lstAds);

        recyclerViewAdapter.setOnItemClickListener((view, obj, position) -> {
            startActivity(new Intent(getContext(), Ads_detail.class));
        });
        myrecyclerView.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstAds = new ArrayList<>();
        lstAds.add(new MaterialsAds("Mohsen", "0599746197", "13.12.11", R.drawable.main_image));
        lstAds.add(new MaterialsAds("Ali", "0599746197", "13.12.11", R.drawable.image_shop_9));
        lstAds.add(new MaterialsAds("Hasan", "0599746197", "13.12.11", R.drawable.image_2));
        lstAds.add(new MaterialsAds("Saeeed", "0599746197", "13.12.11", R.drawable.image_shop_11));
        lstAds.add(new MaterialsAds("BBB", "0599746197", "13.12.11", R.drawable.image_shop_13));
        lstAds.add(new MaterialsAds("wwww", "0599746197", "13.12.11", R.drawable.main_image));
        lstAds.add(new MaterialsAds("mmmmm", "0599746197", "13.12.11", R.drawable.image_shop_10));
        lstAds.add(new MaterialsAds("kkkk", "0599746197", "13.12.11", R.drawable.image_shop_13));
        lstAds.add(new MaterialsAds("mmmmmm", "0599746197", "13.12.11", R.drawable.main_image));
        lstAds.add(new MaterialsAds("mmmmmm", "0599746197", "13.12.11", R.drawable.main_image));
        lstAds.add(new MaterialsAds("mmmmmm", "0599746197", "13.12.11", R.drawable.main_image));
        lstAds.add(new MaterialsAds("mmmmmm", "0599746197", "13.12.11", R.drawable.main_image));


    }
}
