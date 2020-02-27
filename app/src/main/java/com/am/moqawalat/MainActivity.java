package com.am.moqawalat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.airbnb.lottie.LottieAnimationView;
import com.am.moqawalat.Aadapter.MainActivityAdapter;
import com.am.moqawalat.Aadapter.SmoilderAdapter;
import com.am.moqawalat.Aadapter.ViewPagerAdapter;
import com.am.moqawalat.Fragment.MachinesVehiclesFragment;
import com.am.moqawalat.Fragment.MaterialsFragmet;
import com.am.moqawalat.model.ModelSmoolider;
import com.am.moqawalat.utils.Tools;
import com.av.smoothviewpager.Smoolider.SmoothViewpager;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import static com.av.smoothviewpager.utils.Smoolider_Utils.autoplay_viewpager;
import static com.av.smoothviewpager.utils.Smoolider_Utils.stop_autoplay_ViewPager;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private RecyclerView recyclerView;
    private MainActivityAdapter mAdapter;
    private SmoothViewpager smoothViewpager;
    private LottieAnimationView animationView;
    private List<ModelSmoolider> feedItemList;
    private boolean is_autoplay = false;
    private int currentPosition;
    private final int[] smoilderImages = {R.drawable.main_image, R.drawable.image_2, R.drawable.image_shop_13, R.drawable.image_shop_11, R.drawable.image_shop_10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        init_widgets();
        generate_items();
//        initComponent();
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewPager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new MaterialsFragmet(), "Materials");
        adapter.AddFragment(new MachinesVehiclesFragment(), "Machines & Equipment");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        Tools.setSystemBarColor(this);
        smoothViewpager.setAdapter(new SmoilderAdapter(feedItemList, getApplicationContext()));
        animationView.setOnClickListener(v -> {
            manage_autoplay();
            Snackbar.make(v, " ▶ Autoplay :  " + is_autoplay, Snackbar.LENGTH_LONG).show();

        });
        smoothViewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                manage_widgets_on_swipe(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void manage_widgets_on_swipe(int pos) {
        int animH[] = new int[]{R.anim.slide_in_right, R.anim.slide_out_left};
        int animV[] = new int[]{R.anim.slide_in_top, R.anim.slide_out_bottom};

        final boolean left2right = pos < currentPosition;
        if (left2right) {
            animH[0] = R.anim.slide_in_left;
            animH[1] = R.anim.slide_out_right;

            animV[0] = R.anim.slide_in_bottom;
            animV[1] = R.anim.slide_out_top;
        }


        currentPosition = pos;
    }

    private void manage_autoplay() {
        animationView.playAnimation();
        if (is_autoplay) {
            is_autoplay = false;
            stop_autoplay_ViewPager();
        } else {
            is_autoplay = true;
            autoplay_viewpager(smoothViewpager, feedItemList.size());
        }

    }

    private void generate_items() {
        feedItemList = new ArrayList<>();
        for (int i = 0; i < smoilderImages.length; i++) {
            ModelSmoolider gift = new ModelSmoolider();
            gift.setImage(smoilderImages[i]);
            gift.setAdvPhone("0599746197");
            feedItemList.add(gift);
        }
    }

    private void init_widgets() {

        smoothViewpager = findViewById(R.id.smoolider);
        animationView = findViewById(R.id.animation_view);
        animationView.setAnimation(R.raw.autoplay_animation);
        manage_widgets_on_swipe(0);
    }


    public void open_webpage(View view) {
        String url = "http://muqawlat.com/en/bazar";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void open_special(View view) {
        startActivity(new Intent(this, SpecialAdsActivity.class));
    }


}
