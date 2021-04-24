package com.example.calculresistance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import com.example.calculresistance.AdaptateurSection;
import com.example.calculresistance.Bandes_4;
import com.example.calculresistance.Bandes_5;
import com.example.calculresistance.Bandes_6;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    final Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptateurSection adaptateurSection = new AdaptateurSection(this, getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.vue_page);
        viewPager.setAdapter(adaptateurSection);
        TabLayout section = findViewById(R.id.sections);

        section.setupWithViewPager(viewPager);

    }



}