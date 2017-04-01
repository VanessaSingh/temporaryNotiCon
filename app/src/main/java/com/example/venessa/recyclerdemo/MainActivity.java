package com.example.venessa.recyclerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private cardAdapter cardAdapter;
    private int cardNo;
    List<containsNotification> notificationList = new ArrayList<containsNotification>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        containsNotification notif = new containsNotification(1, "Notification1", "#Sort");
        notificationList.add(notif);
        containsNotification notif1 = new containsNotification(2, "Notification2", "#:)");
        notificationList.add(notif1);
        containsNotification notif2 = new containsNotification(3, "Notification3", "#Dicks out for Harambe");
        notificationList.add(notif2);

        cardNo = 3;
        cardAdapter = new cardAdapter(cardNo, notificationList);
        //cardAdapter.notifyDataSetChanged();

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cardAdapter);

    }
}