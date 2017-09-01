package com.abraham.fantasypremierleague;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class PlayersHolder extends RecyclerView.ViewHolder {
    public ImageView profilePic;
    public TextView nameView;
    public TextView positionView;
    public TextView currentValueView;
    public TextView netTransfersView;
    public PlayersHolder(View itemView, Context context) {
        super(itemView);
        profilePic = (ImageView) itemView.findViewById(R.id.pic);
        nameView = (TextView) itemView.findViewById(R.id.name);
        positionView = (TextView) itemView.findViewById(R.id.position);
        currentValueView = (TextView) itemView.findViewById(R.id.currentValue);
        netTransfersView = (TextView) itemView.findViewById(R.id.netTransfers);
    }
}