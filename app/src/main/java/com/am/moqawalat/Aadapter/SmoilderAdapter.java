package com.am.moqawalat.Aadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.am.moqawalat.R;
import com.am.moqawalat.model.ModelSmoolider;

import java.util.List;

import static com.av.smoothviewpager.utils.Smoolider_Utils.decodeSampledBitmapFromResource;

public class SmoilderAdapter extends PagerAdapter {
    private Context mContext;
    private List<ModelSmoolider> specialAds;

    public SmoilderAdapter(List<ModelSmoolider> specialAds, Context mContext) {
        this.mContext = mContext;
        this.specialAds = specialAds;
    }

    @Override
    public int getCount() {
        return specialAds.size();
    }

    @NonNull
    @Override
    public View instantiateItem(ViewGroup container, int position) {
        final ModelSmoolider card_gift = specialAds.get(position);

        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.smooilder_item, container, false);

        ImageView spcAdv_Img = view.findViewById(R.id.img_slider);
        TextView txt_spcAdv_name = view.findViewById(R.id.spc_adv_name);



        spcAdv_Img.setImageBitmap(decodeSampledBitmapFromResource(mContext.getResources(),
                card_gift.getImage(), 400, 400));

        spcAdv_Img.setOnClickListener(v -> {
            //Slider action
            Toast.makeText(mContext, "test"+ specialAds.get(position), Toast.LENGTH_SHORT).show();
        });

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}
