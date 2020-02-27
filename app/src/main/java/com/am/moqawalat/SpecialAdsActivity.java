package com.am.moqawalat;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.am.moqawalat.Aadapter.SpcAdvDetAdapter;
import com.am.moqawalat.model.SpcAdvDetail;
import com.am.moqawalat.utils.Tools;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class SpecialAdsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<SpcAdvDetail> lstAds;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_ads_details_layout);
        recyclerView = findViewById(R.id.spc_adv_detail_rv);
        recyclerView.addItemDecoration(new SpacingItemDecoration(2, Tools.dpToPx(this, 3)));
        recyclerView.setHasFixedSize(true);
        SpcAdvDetAdapter spcAdvDetAdapter = new SpcAdvDetAdapter(context, lstAds);
        recyclerView.setAdapter(spcAdvDetAdapter);
        lstAds = new ArrayList<>();
        lstAds.add(new SpcAdvDetail("Mohsen", "0599746197", "", "", "13.12.11", R.drawable.main_image));

    }


}
