package com.example.venessa.recyclerdemo;

import android.nfc.Tag;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Venessa on 4/1/2017.
 */

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.MyViewHolder> {
    private int cardNo;
    public TextView cardText;
    public TextView cardTitle;
    private List<containsNotification> notificationList = new ArrayList<containsNotification>();
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView cardText;
        public TextView cardTitle;

        public MyViewHolder(View view)
        {
            super(view);
            this.cardTitle = (TextView)view.findViewById(R.id.textView3);
            this.cardText = (TextView)view.findViewById(R.id.textView4);
        }
    }
    public cardAdapter(int cardNo, List<containsNotification> notificationList)
    {
        this.cardNo = cardNo;
        this.notificationList = notificationList;
    }
    public int getNotificationCount()
    {
        return cardNo;
    }

    @Override
    public  MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardactivity, parent, false);
        return new MyViewHolder(item);
    }

    /*@Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.i("cardAdapter", "Reached");

        containsNotification notifHolder = notificationList.get(position);
        holder.cardText.setText(notifHolder.get_notification());
        holder.cardTitle.setText(notifHolder.get_title());
        Log.i("cardAdapter", "Reached");
    }*/

    @Override
    public int getItemCount() {
        return cardNo;
    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        containsNotification notifHolder = notificationList.get(position);
        holder.cardText.setText(notifHolder.get_notification());
        holder.cardTitle.setText(notifHolder.get_title());
        Log.i("cardAdapter", "Reached");
    }





    /*@Override
    public void onBindViewHolder(final MyViewHolder myViewHolder, int pos)
    {
        containsNotification notifHolder = notificationList.get(pos);

        myViewHolder.cardText.setText(notifHolder.get_notification());
        myViewHolder.cardTitle.setText(notifHolder.get_title());
    }*/
}
