package com.example.android.churchball;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TeamAFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TeamAFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TeamAFragment extends Fragment {
    private OnFragmentInteractionListener mListener;
    private String mTitle;
    private int mPage;

    public TeamAFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param mPage Parameter 1.
     * @param mTitle Parameter 2.
     * @return A new instance of fragment TeamAFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TeamAFragment newInstance(int mPage, String mTitle) {
        TeamAFragment fragmentA = new TeamAFragment();
        Bundle args = new Bundle();
        args.putInt("Page", mPage);
        args.putString("Title", mTitle);
        fragmentA.setArguments(args);
        return fragmentA;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt("Page", 0);
        mTitle = getArguments().getString("Title");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_team_a, container, false);

        final int[] playerPoints = new int[10];
        final int[] playerFouls = new int[10];

        Button[] player3PointButtons = new Button[] {
                view.findViewById(R.id.player_1a_3_points),
                view.findViewById(R.id.player_2a_3_points),
                view.findViewById(R.id.player_3a_3_points),
                view.findViewById(R.id.player_4a_3_points),
                view.findViewById(R.id.player_5a_3_points),
                view.findViewById(R.id.player_6a_3_points),
                view.findViewById(R.id.player_7a_3_points),
                view.findViewById(R.id.player_8a_3_points),
                view.findViewById(R.id.player_9a_3_points),
                view.findViewById(R.id.player_10a_3_points)
        };

        Button[] player2PointButtons = new Button[] {
                view.findViewById(R.id.player_1a_2_points),
                view.findViewById(R.id.player_2a_2_points),
                view.findViewById(R.id.player_3a_2_points),
                view.findViewById(R.id.player_4a_2_points),
                view.findViewById(R.id.player_5a_2_points),
                view.findViewById(R.id.player_6a_2_points),
                view.findViewById(R.id.player_7a_2_points),
                view.findViewById(R.id.player_8a_2_points),
                view.findViewById(R.id.player_9a_2_points),
                view.findViewById(R.id.player_10a_2_points)
        };

        Button[] player1PointButtons = new Button[] {
                view.findViewById(R.id.player_1a_1_points),
                view.findViewById(R.id.player_2a_1_points),
                view.findViewById(R.id.player_3a_1_points),
                view.findViewById(R.id.player_4a_1_points),
                view.findViewById(R.id.player_5a_1_points),
                view.findViewById(R.id.player_6a_1_points),
                view.findViewById(R.id.player_7a_1_points),
                view.findViewById(R.id.player_8a_1_points),
                view.findViewById(R.id.player_9a_1_points),
                view.findViewById(R.id.player_10a_1_points)
        };

        final TextView[] playerTotalPointsTextViews = new TextView[] {
                view.findViewById(R.id.player_1a_total_points),
                view.findViewById(R.id.player_2a_total_points),
                view.findViewById(R.id.player_3a_total_points),
                view.findViewById(R.id.player_4a_total_points),
                view.findViewById(R.id.player_5a_total_points),
                view.findViewById(R.id.player_6a_total_points),
                view.findViewById(R.id.player_7a_total_points),
                view.findViewById(R.id.player_8a_total_points),
                view.findViewById(R.id.player_9a_total_points),
                view.findViewById(R.id.player_10a_total_points)
        };

        Button[] playerFoulButtons = new Button[] {
                view.findViewById(R.id.player_1a_foul),
                view.findViewById(R.id.player_2a_foul),
                view.findViewById(R.id.player_3a_foul),
                view.findViewById(R.id.player_4a_foul),
                view.findViewById(R.id.player_5a_foul),
                view.findViewById(R.id.player_6a_foul),
                view.findViewById(R.id.player_7a_foul),
                view.findViewById(R.id.player_8a_foul),
                view.findViewById(R.id.player_9a_foul),
                view.findViewById(R.id.player_10a_foul)
        };

        final TextView[] playerFoulsTextViews = new TextView[] {
                view.findViewById(R.id.player_1a_total_fouls),
                view.findViewById(R.id.player_2a_total_fouls),
                view.findViewById(R.id.player_3a_total_fouls),
                view.findViewById(R.id.player_4a_total_fouls),
                view.findViewById(R.id.player_5a_total_fouls),
                view.findViewById(R.id.player_6a_total_fouls),
                view.findViewById(R.id.player_7a_total_fouls),
                view.findViewById(R.id.player_8a_total_fouls),
                view.findViewById(R.id.player_9a_total_fouls),
                view.findViewById(R.id.player_10a_total_fouls)
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

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
