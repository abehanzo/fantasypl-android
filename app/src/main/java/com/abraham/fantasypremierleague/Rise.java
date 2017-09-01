package com.abraham.fantasypremierleague;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abraham on 01-Sep-17.
 */

public class Rise extends android.support.v4.app.Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.rise,container,false);
        RecyclerView recyclerView;
        final ArrayList<Players> players = new ArrayList<> ();
        players.add(new Players("Gibbs","Defender",R.drawable.profile_pic, "9.2","921731"));
        players.add(new Players("Gibbs","Defender",R.drawable.profile_pic, "9.2","921731"));
        players.add(new Players("Gibbs","Defender",R.drawable.profile_pic, "9.2","921731"));
        players.add(new Players("Gibbs","Defender",R.drawable.profile_pic, "9.2","921731"));
        players.add(new Players("Gibbs","Defender",R.drawable.profile_pic, "9.2","921731"));
        players.add(new Players("Gibbs","Defender",R.drawable.profile_pic, "9.2","921731"));
        players.add(new Players("Gibbs","Defender",R.drawable.profile_pic, "9.2","921731"));





        recyclerView = (RecyclerView) view.findViewById(R.id.rise_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PlayersAdapter departmentAdapter = new PlayersAdapter(getContext(),players);
        departmentAdapter.setHasStableIds(true);
        recyclerView.setAdapter(departmentAdapter);


        return view;
    }

}