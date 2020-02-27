package com.am.moqawalat.utils;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.am.moqawalat.R;
import com.hootsuite.nachos.NachoTextView;
import com.hootsuite.nachos.terminator.ChipTerminatorHandler;

import java.util.ArrayList;
import java.util.List;

public class ChipTag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip_tag);
        iniComponent();
    }


    private void iniComponent() {
        NachoTextView et_tag = (NachoTextView) findViewById(R.id.et_tag);
        List<String> items = new ArrayList<>();
        items.add("Cars");
        items.add("Vehicles");
        items.add("Machines");
        et_tag.setText(items);
        et_tag.addChipTerminator('\n', ChipTerminatorHandler.BEHAVIOR_CHIPIFY_ALL);
    }


}
