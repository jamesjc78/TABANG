package com.example.owner.tabang;

import android.app.FragmentTransaction;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.support.design.widget.TabLayout;
import android.widget.TextView;

public class healthinsurance_providers_profile extends AppCompatActivity {
    private TableLayout tabLayout;
    private AppBarLayout  appBarLayout ;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthinsurance_providers_profile);

        TabLayout tabLayout= (TabLayout) findViewById(R.id.tablelayout_id);
        appBarLayout=(AppBarLayout)findViewById(R.id.appbarid);
        viewPager=(ViewPager) findViewById(R.id.viewpager_id);
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        //adding fragments
        adapter.AddFragment(new aboutfragment(),"ABOUT");
        adapter.AddFragment(new programsfragment(),"PROGRAMS");
        adapter.AddFragment(new legitimacyfragment(),"LEGITIMACY");
        //adapter Setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



    }

}
