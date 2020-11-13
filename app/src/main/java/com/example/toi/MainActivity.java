package com.example.toi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewshopee;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean_shopee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewshopee  = (ListView)findViewById(R.id.listviewCauthu);

        arr_bean_shopee = new ArrayList<ListViewBean>();
        arr_bean_shopee.add(new ListViewBean(R.drawable.khuyenmai, "Khuyến mãi"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.shopeelive, "Shopee Live & Feed"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.activity, "Hoạt động"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.capnhat, "Cập nhật Shoppe"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.nowfood, "NowFood"));
        adapter = new ListViewBaseAdapter(arr_bean_shopee, this);
        listViewshopee.setAdapter(adapter);
    }
}