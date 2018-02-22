package com.example.android.churchball;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jeff on 2/21/18.
 */

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {

    private List<Player> mPlayers;
    private LayoutInflater mLayoutInflater;

    public PlayerAdapter(Context context, List<Player> players) {
        mLayoutInflater = LayoutInflater.from(context);
        mPlayers = players;
    }

    @Override
    public PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PlayerViewHolder(mLayoutInflater.inflate(R.layout.item_player, parent, false));
    }

    @Override
    public void onBindViewHolder(PlayerViewHolder holder, int position) {
        Player player = mPlayers.get(position);

        holder.number.setText(String.valueOf(player.getNumber()));
        holder.points.setText(String.valueOf(player.getPoints()));
        holder.fouls.setText(String.valueOf(player.getFouls()));

        // set the tag on the button to the position of the player we are binding
        holder.onePointButton.setTag(position);
        holder.onePointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = (int) view.getTag();

                Player player = mPlayers.get(position);
                player.addPoints(1);

                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPlayers.size();
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder{

        EditText number;
        Button onePointButton;
        Button twoPointButton;
        Button threePointButton;
        TextView points;
        Button foulButton;
        TextView fouls;

        public PlayerViewHolder(View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.number);
            onePointButton = itemView.findViewById(R.id.one_point_button);
            twoPointButton = itemView.findViewById(R.id.two_point_button);
            threePointButton = itemView.findViewById(R.id.three_point_button);
            points = itemView.findViewById(R.id.points);
            foulButton = itemView.findViewById(R.id.foul_button);
            fouls = itemView.findViewById(R.id.fouls);
        }
    }
}
