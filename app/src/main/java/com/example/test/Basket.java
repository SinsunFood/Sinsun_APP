package com.example.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class Basket extends AppCompatActivity implements View.OnClickListener{

    ScrollView mScrollview;
    private ListView m_oListView = null;

    // 일단 데이터 생성 , 여기 데이터를 가게마다 따로 받아야 함 힘듦
    //가게의 메뉴를 입력받는 데이터
    String[] strDate = {"제육볶음", "묵은지", "콩자반", "파래무침", "감자조림", "파김치"};
    int nDatCnt=0;
    ArrayList<ItemDataBastket> oData = new ArrayList<>(); // CustomList의 목록
    boolean del = false;



    // 장바구니 리스트 출력하는 함수 나중에 서버에서 가져와서 출력하는걸로 바꿔야함
    private void print(){
        for (int i=0; i<6; ++i)
        {
            ItemDataBastket oItem = new ItemDataBastket();
            oItem.strMenu = strDate[nDatCnt++];
            oItem.strCount = (i+1) + "개";
            oItem.strCost = ((i+1)*1000) + "원";
            oItem.onClickListener = this;
            oData.add(oItem);
            if (nDatCnt >= strDate.length) nDatCnt = 0; //로테이션 돌리려고 하는 if문
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        // 장바구니 리스트 한 번 출력;
        print();


// ListViewBasket, ListAdapter 생성 및 연결
        m_oListView = (ListView)findViewById(R.id.listView);
        ListAdapter oAdapter = new ListAdapter(oData);
        m_oListView.setAdapter(oAdapter);
        mScrollview = findViewById(R.id.scrollView);

    }

    @Override
    public void onClick(View view) {
        View oParentView = (View)view.getParent(); // 부모의 View 가져온다. 즉, 아이템 View
        String position = (String) oParentView.getTag();
        int index = Integer.parseInt(position);

        oData.remove(index);

        m_oListView = (ListView)findViewById(R.id.listView);
        ListAdapter oAdapter = new ListAdapter(oData);
        m_oListView.setAdapter(oAdapter);
        mScrollview = findViewById(R.id.scrollView);
    }

    public void upButton(View view) {
        View oParentView = (View)view.getParent(); // 부모의 View 가져온다. 즉, 아이템 View
        String position = (String) oParentView.getTag();
        int index = Integer.parseInt(position);


    }

    public void downButton(View view){

    }

    public void toHome(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void toBasket(View view){
        // 맨위로 이동
        mScrollview.fullScroll(ScrollView.FOCUS_UP);
    }
}