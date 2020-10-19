package com.example.test;

import android.content.Intent;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;


public class Market1 extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market1);
        //정원이꺼 map뷰
        ViewPager mapVp = findViewById(R.id.mapview);
        VPAdapter mapAdapter = new VPAdapter(getSupportFragmentManager());
        mapAdapter.items.add(new MapsFragment());
        mapVp.setAdapter(mapAdapter);
        //시우꺼 슬라이드뷰
        ViewPager vp = findViewById(R.id.viewpager);
        VPAdapter adapter = new VPAdapter(getSupportFragmentManager());
        adapter.items.add(new FragmentMenu1());
        adapter.items.add(new FragmentMenu2());
        adapter.items.add(new FragmentMenu3());
        vp.setAdapter(adapter);

    }

    public void toHome(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}