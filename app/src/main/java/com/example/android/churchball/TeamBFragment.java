package com.example.android.churchball;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TeamBFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TeamBFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TeamBFragment extends Fragment {

    int playerOnePointsB = 0;
    int playerTwoPointsB = 0;
    int playerThreePointsB = 0;
    int playerFourPointsB = 0;
    int playerFivePointsB = 0;
    int playerSixPointsB = 0;
    int playerSevenPointsB = 0;
    int playerEightPointsB = 0;
    int playerNinePointsB = 0;
    int playerTenPointsB = 0;

    int playerOneFoulsB = 0;
    int playerTwoFoulsB = 0;
    int playerThreeFoulsB = 0;
    int playerFourFoulsB = 0;
    int playerFiveFoulsB = 0;
    int playerSixFoulsB = 0;
    int playerSevenFoulsB = 0;
    int playerEightFoulsB = 0;
    int playerNineFoulsB = 0;
    int playerTenFoulsB = 0;

    private OnFragmentInteractionListener mListener;

    public TeamBFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TeamBFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TeamBFragment newInstance(String param1, String param2) {
        TeamBFragment fragment = new TeamBFragment();
        Bundle args = new Bundle();
        // args.putString(ARG_PARAM1, param1);
        // args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_team_b, container, false);
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

    // PLAYER ONE METHODS

    // Adds three points to Player One's total points
    public void addThreePointsPlayerOneB(View view) {
        playerOnePointsB += 3;
        displayPlayerOnePointsB(playerOnePointsB);
    };

    // Adds two points to Player One's total points
    public void addTwoPointsPlayerOneB(View view) {
        playerOnePointsB += 2;
        displayPlayerOnePointsB(playerOnePointsB);
    };

    // Adds one point to Player One's total points
    public void addOnePointPlayerOneB(View view) {
        playerOnePointsB += 1;
        displayPlayerOnePointsB(playerOnePointsB);
    };

    // Updates Player One's total points after button click
    private void displayPlayerOnePointsB (int playerOnePointsB) {
        TextView playerOneTotalPointsB = getView().findViewById(R.id.player_1b_total_points);
        playerOneTotalPointsB.setText("" + playerOnePointsB);
    };

    // Adds one foul to Player One's total fouls
    public void addPlayerOneFoulB(View view) {
        ++playerOneFoulsB;
        displayPlayerOneFoulsB(playerOneFoulsB);
    }

    // Updates Player One's total fouls after button click
    private void displayPlayerOneFoulsB (int playerOneFoulsB) {
        TextView playerOneTotalFoulsB = getView().findViewById(R.id.player_1b_total_fouls);
        playerOneTotalFoulsB.setText("" + playerOneFoulsB);
    }

    // PLAYER TWO METHODS

    // Adds three points to Player Two's total points
    public void addThreePointsPlayerTwoB(View view) {
        playerTwoPointsB += 3;
        displayPlayerTwoPointsB(playerTwoPointsB);
    };

    // Adds two points to Player Two's total points
    public void addTwoPointsPlayerTwoB(View view) {
        playerTwoPointsB += 2;
        displayPlayerTwoPointsB(playerTwoPointsB);
    };

    // Adds one point to Player Two's total points
    public void addOnePointPlayerTwoB(View view) {
        playerTwoPointsB += 1;
        displayPlayerTwoPointsB(playerTwoPointsB);
    };

    // Updates Player Two's total points after button click
    private void displayPlayerTwoPointsB (int playerTwoPointsB) {
        TextView playerTwoTotalPointsB = getView().findViewById(R.id.player_2b_total_points);
        playerTwoTotalPointsB.setText("" + playerTwoPointsB);
    };

    // Adds one foul to Player Two's total fouls
    public void addPlayerTwoFoulB(View view) {
        ++playerTwoFoulsB;
        displayPlayerTwoFoulsB(playerTwoFoulsB);
    }

    // Updates Player Two's total fouls after button click
    private void displayPlayerTwoFoulsB (int playerTwoFoulsB) {
        TextView playerTwoTotalFoulsB = getView().findViewById(R.id.player_2b_total_fouls);
        playerTwoTotalFoulsB.setText("" + playerTwoFoulsB);
    }

    // PLAYER THREE METHODS

    // Adds three points to Player Three's total points
    public void addThreePointsPlayerThreeB(View view) {
        playerThreePointsB += 3;
        displayPlayerThreePointsB(playerThreePointsB);
    };

    // Adds two points to Player Three's total points
    public void addTwoPointsPlayerThreeB(View view) {
        playerThreePointsB += 2;
        displayPlayerThreePointsB(playerThreePointsB);
    };

    // Adds one point to Player Three's total points
    public void addOnePointPlayerThreeB(View view) {
        playerThreePointsB += 1;
        displayPlayerThreePointsB(playerThreePointsB);
    };

    // Updates Player Three's total points after button click
    private void displayPlayerThreePointsB (int playerThreePointsB) {
        TextView playerThreeTotalPointsB = getView().findViewById(R.id.player_3b_total_points);
        playerThreeTotalPointsB.setText("" + playerThreePointsB);
    };

    // Adds one foul to Player Three's total fouls
    public void addPlayerThreeFoulB(View view) {
        ++playerThreeFoulsB;
        displayPlayerThreeFoulsB(playerThreeFoulsB);
    }

    // Updates Player Three's total fouls after button click
    private void displayPlayerThreeFoulsB (int playerThreeFoulsB) {
        TextView playerThreeTotalFoulsB = getView().findViewById(R.id.player_3b_total_fouls);
        playerThreeTotalFoulsB.setText("" + playerThreeFoulsB);
    }

    // PLAYER FOUR METHODS

    // Adds three points to Player Four's total points
    public void addThreePointsPlayerFourB(View view) {
        playerFourPointsB += 3;
        displayPlayerFourPointsB(playerFourPointsB);
    };

    // Adds two points to Player Four's total points
    public void addTwoPointsPlayerFourB(View view) {
        playerFourPointsB += 2;
        displayPlayerFourPointsB(playerFourPointsB);
    };

    // Adds one point to Player Four's total points
    public void addOnePointPlayerFourB(View view) {
        playerFourPointsB += 1;
        displayPlayerFourPointsB(playerFourPointsB);
    };

    // Updates Player Four's total points after button click
    private void displayPlayerFourPointsB (int playerFourPointsB) {
        TextView playerFourTotalPointsB = getView().findViewById(R.id.player_4b_total_points);
        playerFourTotalPointsB.setText("" + playerFourPointsB);
    };

    // Adds one foul to Player Four's total fouls
    public void addPlayerFourFoulB(View view) {
        ++playerFourFoulsB;
        displayPlayerFourFoulsB(playerFourFoulsB);
    }

    // Updates Player Four's total fouls after button click
    private void displayPlayerFourFoulsB (int playerFourFoulsB) {
        TextView playerFourTotalFoulsB = getView().findViewById(R.id.player_4b_total_fouls);
        playerFourTotalFoulsB.setText("" + playerFourFoulsB);
    }

    // PLAYER FIVE METHODS

    // Adds three points to Player Five's total points
    public void addThreePointsPlayerFiveB(View view) {
        playerFivePointsB += 3;
        displayPlayerFivePointsB(playerFivePointsB);
    };

    // Adds two points to Player Five's total points
    public void addTwoPointsPlayerFiveB(View view) {
        playerFivePointsB += 2;
        displayPlayerFivePointsB(playerFivePointsB);
    };

    // Adds one point to Player Five's total points
    public void addOnePointPlayerFiveB(View view) {
        playerFivePointsB += 1;
        displayPlayerFivePointsB(playerFivePointsB);
    };

    // Updates Player Five's total points after button click
    private void displayPlayerFivePointsB (int playerFivePointsB) {
        TextView playerFiveTotalPointsB = getView().findViewById(R.id.player_5b_total_points);
        playerFiveTotalPointsB.setText("" + playerFivePointsB);
    };

    // Adds one foul to Player Five's total fouls
    public void addPlayerFiveFoulB(View view) {
        ++playerFiveFoulsB;
        displayPlayerFiveFoulsB(playerFiveFoulsB);
    }

    // Updates Player Five's total fouls after button click
    private void displayPlayerFiveFoulsB (int playerFiveFoulsB) {
        TextView playerFiveTotalFoulsB = getView().findViewById(R.id.player_5b_total_fouls);
        playerFiveTotalFoulsB.setText("" + playerFiveFoulsB);
    }

    // PLAYER SIX METHODS

    // Adds three points to Player Six's total points
    public void addThreePointsPlayerSixB(View view) {
        playerSixPointsB += 3;
        displayPlayerSixPointsB(playerSixPointsB);
    };

    // Adds two points to Player Six's total points
    public void addTwoPointsPlayerSixB(View view) {
        playerSixPointsB += 2;
        displayPlayerSixPointsB(playerSixPointsB);
    };

    // Adds one point to Player Six's total points
    public void addOnePointPlayerSixB(View view) {
        playerSixPointsB += 1;
        displayPlayerSixPointsB(playerSixPointsB);
    };

    // Updates Player Six's total points after button click
    private void displayPlayerSixPointsB (int playerSixPointsB) {
        TextView playerSixTotalPointsB = getView().findViewById(R.id.player_6b_total_points);
        playerSixTotalPointsB.setText("" + playerSixPointsB);
    };

    // Adds one foul to Player Six's total fouls
    public void addPlayerSixFoulB(View view) {
        ++playerSixFoulsB;
        displayPlayerSixFoulsB(playerSixFoulsB);
    }

    // Updates Player Six's total fouls after button click
    private void displayPlayerSixFoulsB (int playerSixFoulsB) {
        TextView playerSixTotalFoulsB = getView().findViewById(R.id.player_6b_total_fouls);
        playerSixTotalFoulsB.setText("" + playerSixFoulsB);
    }

    // PLAYER SEVEN METHODS

    // Adds three points to Player Seven's total points
    public void addThreePointsPlayerSevenB(View view) {
        playerSevenPointsB += 3;
        displayPlayerSevenPointsB(playerSevenPointsB);
    };

    // Adds two points to Player Seven's total points
    public void addTwoPointsPlayerSevenB(View view) {
        playerSevenPointsB += 2;
        displayPlayerSevenPointsB(playerSevenPointsB);
    };

    // Adds one point to Player Seven's total points
    public void addOnePointPlayerSevenB(View view) {
        playerSevenPointsB += 1;
        displayPlayerSevenPointsB(playerSevenPointsB);
    };

    // Updates Player Seven's total points after button click
    private void displayPlayerSevenPointsB (int playerSevenPointsB) {
        TextView playerSevenTotalPointsB = getView().findViewById(R.id.player_7b_total_points);
        playerSevenTotalPointsB.setText("" + playerSevenPointsB);
    };

    // Adds one foul to Player Seven's total fouls
    public void addPlayerSevenFoulB(View view) {
        ++playerSevenFoulsB;
        displayPlayerSevenFoulsB(playerSevenFoulsB);
    }

    // Updates Player Seven's total fouls after button click
    private void displayPlayerSevenFoulsB (int playerSevenFoulsB) {
        TextView playerSevenTotalFoulsB = getView().findViewById(R.id.player_7b_total_fouls);
        playerSevenTotalFoulsB.setText("" + playerSevenFoulsB);
    }

    // PLAYER EIGHT METHODS

    // Adds three points to Player Eight's total points
    public void addThreePointsPlayerEightB(View view) {
        playerEightPointsB += 3;
        displayPlayerEightPointsB(playerEightPointsB);
    };

    // Adds two points to Player Eight's total points
    public void addTwoPointsPlayerEightB(View view) {
        playerEightPointsB += 2;
        displayPlayerEightPointsB(playerEightPointsB);
    };

    // Adds one point to Player Eight's total points
    public void addOnePointPlayerEightB(View view) {
        playerEightPointsB += 1;
        displayPlayerEightPointsB(playerEightPointsB);
    };

    // Updates Player Eight's total points after button click
    private void displayPlayerEightPointsB (int playerEightPointsB) {
        TextView playerEightTotalPointsB = getView().findViewById(R.id.player_8b_total_points);
        playerEightTotalPointsB.setText("" + playerEightPointsB);
    };

    // Adds one foul to Player Eight's total fouls
    public void addPlayerEightFoulB(View view) {
        ++playerEightFoulsB;
        displayPlayerEightFoulsB(playerEightFoulsB);
    }

    // Updates Player Eight's total fouls after button click
    private void displayPlayerEightFoulsB (int playerEightFoulsB) {
        TextView playerEightTotalFoulsB = getView().findViewById(R.id.player_8b_total_fouls);
        playerEightTotalFoulsB.setText("" + playerEightFoulsB);
    }

    // PLAYER NINE METHODS

    // Adds three points to Player Nine's total points
    public void addThreePointsPlayerNineB(View view) {
        playerNinePointsB += 3;
        displayPlayerNinePointsB(playerNinePointsB);
    };

    // Adds two points to Player Nine's total points
    public void addTwoPointsPlayerNineB(View view) {
        playerNinePointsB += 2;
        displayPlayerNinePointsB(playerNinePointsB);
    };

    // Adds one point to Player Nine's total points
    public void addOnePointPlayerNineB(View view) {
        playerNinePointsB += 1;
        displayPlayerNinePointsB(playerNinePointsB);
    };

    // Updates Player Nine's total points after button click
    private void displayPlayerNinePointsB (int playerNinePointsB) {
        TextView playerNineTotalPointsB = getView().findViewById(R.id.player_9b_total_points);
        playerNineTotalPointsB.setText("" + playerNinePointsB);
    };

    // Adds one foul to Player Nine's total fouls
    public void addPlayerNineFoulB(View view) {
        ++playerNineFoulsB;
        displayPlayerNineFoulsB(playerNineFoulsB);
    }

    // Updates Player Nine's total fouls after button click
    private void displayPlayerNineFoulsB (int playerNineFoulsB) {
        TextView playerNineTotalFoulsB = getView().findViewById(R.id.player_9b_total_fouls);
        playerNineTotalFoulsB.setText("" + playerNineFoulsB);
    }

    // PLAYER TEN METHODS

    // Adds three points to Player Ten's total points
    public void addThreePointsPlayerTenB(View view) {
        playerTenPointsB += 3;
        displayPlayerTenPointsB(playerTenPointsB);
    };

    // Adds two points to Player Ten's total points
    public void addTwoPointsPlayerTenB(View view) {
        playerTenPointsB += 2;
        displayPlayerTenPointsB(playerTenPointsB);
    };

    // Adds one point to Player Ten's total points
    public void addOnePointPlayerTenB(View view) {
        playerTenPointsB += 1;
        displayPlayerTenPointsB(playerTenPointsB);
    };

    // Updates Player Ten's total points after button click
    private void displayPlayerTenPointsB (int playerTenPointsB) {
        TextView playerTenTotalPointsB = getView().findViewById(R.id.player_10b_total_points);
        playerTenTotalPointsB.setText("" + playerTenPointsB);
    };

    // Adds one foul to Player Ten's total fouls
    public void addPlayerTenFoulB(View view) {
        ++playerTenFoulsB;
        displayPlayerTenFoulsB(playerTenFoulsB);
    }

    // Updates Player Ten's total fouls after button click
    private void displayPlayerTenFoulsB (int playerTenFoulsB) {
        TextView playerTenTotalFoulsB = getView().findViewById(R.id.player_10b_total_fouls);
        playerTenTotalFoulsB.setText("" + playerTenFoulsB);
    }
    
}
