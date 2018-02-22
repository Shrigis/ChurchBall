package com.example.android.churchball;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TeamFragment extends Fragment {
    private static final String KEY_TEAM_NAME = "KEY_TEAM_NAME";

    private String mTeamName;

    public static TeamFragment newInstance(String teamName) {
        TeamFragment fragment = new TeamFragment();
        Bundle args = new Bundle();
        args.putString(KEY_TEAM_NAME, teamName);
        fragment.setArguments(args);
        return fragment;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTeamName = getArguments().getString(KEY_TEAM_NAME);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_team, container, false);

        EditText teamName = view.findViewById(R.id.team_name);

        teamName.setHint(mTeamName + " Name");

        final int[] playerPoints = new int[10];
        final int[] playerFouls = new int[10];

        Button[] player3PointButtons = new Button[]{
                view.findViewById(R.id.player_1_3_points),
                view.findViewById(R.id.player_2_3_points),
                view.findViewById(R.id.player_3_3_points),
                view.findViewById(R.id.player_4_3_points),
                view.findViewById(R.id.player_5_3_points),
                view.findViewById(R.id.player_6_3_points),
                view.findViewById(R.id.player_7_3_points),
                view.findViewById(R.id.player_8_3_points),
                view.findViewById(R.id.player_9_3_points),
                view.findViewById(R.id.player_10_3_points)
        };

        Button[] player2PointButtons = new Button[]{
                view.findViewById(R.id.player_1_2_points),
                view.findViewById(R.id.player_2_2_points),
                view.findViewById(R.id.player_3_2_points),
                view.findViewById(R.id.player_4_2_points),
                view.findViewById(R.id.player_5_2_points),
                view.findViewById(R.id.player_6_2_points),
                view.findViewById(R.id.player_7_2_points),
                view.findViewById(R.id.player_8_2_points),
                view.findViewById(R.id.player_9_2_points),
                view.findViewById(R.id.player_10_2_points)
        };

        Button[] player1PointButtons = new Button[]{
                view.findViewById(R.id.player_1_1_points),
                view.findViewById(R.id.player_2_1_points),
                view.findViewById(R.id.player_3_1_points),
                view.findViewById(R.id.player_4_1_points),
                view.findViewById(R.id.player_5_1_points),
                view.findViewById(R.id.player_6_1_points),
                view.findViewById(R.id.player_7_1_points),
                view.findViewById(R.id.player_8_1_points),
                view.findViewById(R.id.player_9_1_points),
                view.findViewById(R.id.player_10_1_points)
        };

        final TextView[] playerTotalPointsTextViews = new TextView[]{
                view.findViewById(R.id.player_1_total_points),
                view.findViewById(R.id.player_2_total_points),
                view.findViewById(R.id.player_3_total_points),
                view.findViewById(R.id.player_4_total_points),
                view.findViewById(R.id.player_5_total_points),
                view.findViewById(R.id.player_6_total_points),
                view.findViewById(R.id.player_7_total_points),
                view.findViewById(R.id.player_8_total_points),
                view.findViewById(R.id.player_9_total_points),
                view.findViewById(R.id.player_10_total_points)
        };

        Button[] playerFoulButtons = new Button[]{
                view.findViewById(R.id.player_1_foul),
                view.findViewById(R.id.player_2_foul),
                view.findViewById(R.id.player_3_foul),
                view.findViewById(R.id.player_4_foul),
                view.findViewById(R.id.player_5_foul),
                view.findViewById(R.id.player_6_foul),
                view.findViewById(R.id.player_7_foul),
                view.findViewById(R.id.player_8_foul),
                view.findViewById(R.id.player_9_foul),
                view.findViewById(R.id.player_10_foul)
        };

        final TextView[] playerFoulsTextViews = new TextView[]{
                view.findViewById(R.id.player_1_total_fouls),
                view.findViewById(R.id.player_2_total_fouls),
                view.findViewById(R.id.player_3_total_fouls),
                view.findViewById(R.id.player_4_total_fouls),
                view.findViewById(R.id.player_5_total_fouls),
                view.findViewById(R.id.player_6_total_fouls),
                view.findViewById(R.id.player_7_total_fouls),
                view.findViewById(R.id.player_8_total_fouls),
                view.findViewById(R.id.player_9_total_fouls),
                view.findViewById(R.id.player_10_total_fouls)
        };

        View.OnClickListener pointButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int playerIndex = (int) view.getTag(R.id.player_index);
                int pointValue = (int) view.getTag(R.id.point_value);

                playerPoints[playerIndex] += pointValue;
                playerTotalPointsTextViews[playerIndex].setText(String.valueOf(playerPoints[playerIndex]));
            }
        };

        View.OnClickListener foulButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int playerIndex = (int) view.getTag(R.id.player_index);

                playerFouls[playerIndex] += 1;
                playerFoulsTextViews[playerIndex].setText(String.valueOf(playerFouls[playerIndex]));
            }
        };

        for (int i = 0; i < player3PointButtons.length; i++) {
            Button player3PointButton = player3PointButtons[i];
            Button player2PointButton = player2PointButtons[i];
            Button player1PointButton = player1PointButtons[i];

            player3PointButton.setTag(R.id.player_index, i);
            player2PointButton.setTag(R.id.player_index, i);
            player1PointButton.setTag(R.id.player_index, i);

            player3PointButton.setTag(R.id.point_value, 3);
            player2PointButton.setTag(R.id.point_value, 2);
            player1PointButton.setTag(R.id.point_value, 1);

            player3PointButton.setOnClickListener(pointButtonOnClickListener);
            player2PointButton.setOnClickListener(pointButtonOnClickListener);
            player1PointButton.setOnClickListener(pointButtonOnClickListener);

            Button playerFoulbutton = playerFoulButtons[i];

            playerFoulbutton.setTag(R.id.player_index, i);
            playerFoulbutton.setOnClickListener(foulButtonOnClickListener);
        }

        return view;

    }
}
