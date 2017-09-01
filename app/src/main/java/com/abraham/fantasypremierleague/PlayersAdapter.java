package com.abraham.fantasypremierleague;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Abraham on 01-Sep-17.
 */


public class PlayersAdapter extends RecyclerView.Adapter<PlayersHolder>{

    Context context;
    private ArrayList<Players> playersList = new ArrayList<Players>();
    public PlayersAdapter(Context context, ArrayList<Players> playersList)
    {
        this.context = context;
        this.playersList = playersList;
    }

    @Override
    public PlayersHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_list,null);
        PlayersHolder playersHolder = new PlayersHolder(view, context);
        return playersHolder;
    }



    @Override
    public void onBindViewHolder(PlayersHolder holder, final int position) {

        final Players players = playersList.get(position);

        holder.nameView.setText(players.getName());
        holder.currentValueView.setText(players.getCurrentValue());
        holder.profilePic.setImageResource(players.getImage());
        holder.netTransfersView.setText(players.getNetTransfer());
        holder.positionView.setText(players.getPosition());

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("image", dept.getImage());
                intent.putExtra("deptName",dept.getDepName());
                context.startActivity(intent);
            }
        });*/
    }


    @Override
    public int getItemCount() {
        return playersList.size();
    }
}