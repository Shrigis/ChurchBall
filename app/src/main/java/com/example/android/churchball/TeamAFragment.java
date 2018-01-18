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
 * {@link TeamAFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TeamAFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TeamAFragment extends Fragment {

    int playerOnePointsA = 0;
    int playerTwoPointsA = 0;
    int playerThreePointsA = 0;
    int playerFourPointsA = 0;
    int playerFivePointsA = 0;
    int playerSixPointsA = 0;
    int playerSevenPointsA = 0;
    int playerEightPointsA = 0;
    int playerNinePointsA = 0;
    int playerTenPointsA = 0;

    int playerOneFoulsA = 0;
    int playerTwoFoulsA = 0;
    int playerThreeFoulsA = 0;
    int playerFourFoulsA = 0;
    int playerFiveFoulsA = 0;
    int playerSixFoulsA = 0;
    int playerSevenFoulsA = 0;
    int playerEightFoulsA = 0;
    int playerNineFoulsA = 0;
    int playerTenFoulsA = 0;

    private OnFragmentInteractionListener mListener;

    public TeamAFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TeamAFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TeamAFragment newInstance(String param1, String param2) {
        TeamAFragment fragment = new TeamAFragment();
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
        return inflater.inflate(R.layout.fragment_team_a, container, false);
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
    public void addThreePointsPlayerOneA(View view) {
        playerOnePointsA += 3;
        displayPlayerOnePointsA(playerOnePointsA);
    };

    // Adds two points to Player One's total points
    public void addTwoPointsPlayerOneA(View view) {
        playerOnePointsA += 2;
        displayPlayerOnePointsA(playerOnePointsA);
    };

    // Adds one point to Player One's total points
    public void addOnePointPlayerOneA(View view) {
        playerOnePointsA += 1;
        displayPlayerOnePointsA(playerOnePointsA);
    };

    // Updates Player One's total points after button click
    private void displayPlayerOnePointsA (int playerOnePointsA) {
        TextView playerOneTotalPointsA = getView().findViewById(R.id.player_1a_total_points);
        playerOneTotalPointsA.setText("" + playerOnePointsA);
    };

    // Adds one foul to Player One's total fouls
    public void addPlayerOneFoulA(View view) {
        ++playerOneFoulsA;
        displayPlayerOneFoulsA(playerOneFoulsA);
    }

    // Updates Player One's total fouls after button click
    private void displayPlayerOneFoulsA (int playerOneFoulsA) {
        TextView playerOneTotalFoulsA = getView().findViewById(R.id.player_1a_total_fouls);
        playerOneTotalFoulsA.setText("" + playerOneFoulsA);
    }

    // PLAYER TWO METHODS

    // Adds three points to Player Two's total points
    public void addThreePointsPlayerTwoA(View view) {
        playerTwoPointsA += 3;
        displayPlayerTwoPointsA(playerTwoPointsA);
    };

    // Adds two points to Player Two's total points
    public void addTwoPointsPlayerTwoA(View view) {
        playerTwoPointsA += 2;
        displayPlayerTwoPointsA(playerTwoPointsA);
    };

    // Adds one point to Player Two's total points
    public void addOnePointPlayerTwoA(View view) {
        playerTwoPointsA += 1;
        displayPlayerTwoPointsA(playerTwoPointsA);
    };

    // Updates Player Two's total points after button click
    private void displayPlayerTwoPointsA (int playerTwoPointsA) {
        TextView playerTwoTotalPointsA = getView().findViewById(R.id.player_2a_total_points);
        playerTwoTotalPointsA.setText("" + playerTwoPointsA);
    };

    // Adds one foul to Player Two's total fouls
    public void addPlayerTwoFoulA(View view) {
        ++playerTwoFoulsA;
        displayPlayerTwoFoulsA(playerTwoFoulsA);
    }

    // Updates Player Two's total fouls after button click
    private void displayPlayerTwoFoulsA (int playerTwoFoulsA) {
        TextView playerTwoTotalFoulsA = getView().findViewById(R.id.player_2a_total_fouls);
        playerTwoTotalFoulsA.setText("" + playerTwoFoulsA);
    }

    // PLAYER THREE METHODS

    // Adds three points to Player Three's total points
    public void addThreePointsPlayerThreeA(View view) {
        playerThreePointsA += 3;
        displayPlayerThreePointsA(playerThreePointsA);
    };

    // Adds two points to Player Three's total points
    public void addTwoPointsPlayerThreeA(View view) {
        playerThreePointsA += 2;
        displayPlayerThreePointsA(playerThreePointsA);
    };

    // Adds one point to Player Three's total points
    public void addOnePointPlayerThreeA(View view) {
        playerThreePointsA += 1;
        displayPlayerThreePointsA(playerThreePointsA);
    };

    // Updates Player Three's total points after button click
    private void displayPlayerThreePointsA (int playerThreePointsA) {
        TextView playerThreeTotalPointsA = getView().findViewById(R.id.player_3a_total_points);
        playerThreeTotalPointsA.setText("" + playerThreePointsA);
    };

    // Adds one foul to Player Three's total fouls
    public void addPlayerThreeFoulA(View view) {
        ++playerThreeFoulsA;
        displayPlayerThreeFoulsA(playerThreeFoulsA);
    }

    // Updates Player Three's total fouls after button click
    private void displayPlayerThreeFoulsA (int playerThreeFoulsA) {
        TextView playerThreeTotalFoulsA = getView().findViewById(R.id.player_3a_total_fouls);
        playerThreeTotalFoulsA.setText("" + playerThreeFoulsA);
    }

    // PLAYER FOUR METHODS

    // Adds three points to Player Four's total points
    public void addThreePointsPlayerFourA(View view) {
        playerFourPointsA += 3;
        displayPlayerFourPointsA(playerFourPointsA);
    };

    // Adds two points to Player Four's total points
    public void addTwoPointsPlayerFourA(View view) {
        playerFourPointsA += 2;
        displayPlayerFourPointsA(playerFourPointsA);
    };

    // Adds one point to Player Four's total points
    public void addOnePointPlayerFourA(View view) {
        playerFourPointsA += 1;
        displayPlayerFourPointsA(playerFourPointsA);
    };

    // Updates Player Four's total points after button click
    private void displayPlayerFourPointsA (int playerFourPointsA) {
        TextView playerFourTotalPointsA = getView().findViewById(R.id.player_4a_total_points);
        playerFourTotalPointsA.setText("" + playerFourPointsA);
    };

    // Adds one foul to Player Four's total fouls
    public void addPlayerFourFoulA(View view) {
        ++playerFourFoulsA;
        displayPlayerFourFoulsA(playerFourFoulsA);
    }

    // Updates Player Four's total fouls after button click
    private void displayPlayerFourFoulsA (int playerFourFoulsA) {
        TextView playerFourTotalFoulsA = getView().findViewById(R.id.player_4a_total_fouls);
        playerFourTotalFoulsA.setText("" + playerFourFoulsA);
    }

    // PLAYER FIVE METHODS

    // Adds three points to Player Five's total points
    public void addThreePointsPlayerFiveA(View view) {
        playerFivePointsA += 3;
        displayPlayerFivePointsA(playerFivePointsA);
    };

    // Adds two points to Player Five's total points
    public void addTwoPointsPlayerFiveA(View view) {
        playerFivePointsA += 2;
        displayPlayerFivePointsA(playerFivePointsA);
    };

    // Adds one point to Player Five's total points
    public void addOnePointPlayerFiveA(View view) {
        playerFivePointsA += 1;
        displayPlayerFivePointsA(playerFivePointsA);
    };

    // Updates Player Five's total points after button click
    private void displayPlayerFivePointsA (int playerFivePointsA) {
        TextView playerFiveTotalPointsA = getView().findViewById(R.id.player_5a_total_points);
        playerFiveTotalPointsA.setText("" + playerFivePointsA);
    };

    // Adds one foul to Player Five's total fouls
    public void addPlayerFiveFoulA(View view) {
        ++playerFiveFoulsA;
        displayPlayerFiveFoulsA(playerFiveFoulsA);
    }

    // Updates Player Five's total fouls after button click
    private void displayPlayerFiveFoulsA (int playerFiveFoulsA) {
        TextView playerFiveTotalFoulsA = getView().findViewById(R.id.player_5a_total_fouls);
        playerFiveTotalFoulsA.setText("" + playerFiveFoulsA);
    }

    // PLAYER SIX METHODS

    // Adds three points to Player Six's total points
    public void addThreePointsPlayerSixA(View view) {
        playerSixPointsA += 3;
        displayPlayerSixPointsA(playerSixPointsA);
    };

    // Adds two points to Player Six's total points
    public void addTwoPointsPlayerSixA(View view) {
        playerSixPointsA += 2;
        displayPlayerSixPointsA(playerSixPointsA);
    };

    // Adds one point to Player Six's total points
    public void addOnePointPlayerSixA(View view) {
        playerSixPointsA += 1;
        displayPlayerSixPointsA(playerSixPointsA);
    };

    // Updates Player Six's total points after button click
    private void displayPlayerSixPointsA (int playerSixPointsA) {
        TextView playerSixTotalPointsA = getView().findViewById(R.id.player_6a_total_points);
        playerSixTotalPointsA.setText("" + playerSixPointsA);
    };

    // Adds one foul to Player Six's total fouls
    public void addPlayerSixFoulA(View view) {
        ++playerSixFoulsA;
        displayPlayerSixFoulsA(playerSixFoulsA);
    }

    // Updates Player Six's total fouls after button click
    private void displayPlayerSixFoulsA (int playerSixFoulsA) {
        TextView playerSixTotalFoulsA = getView().findViewById(R.id.player_6a_total_fouls);
        playerSixTotalFoulsA.setText("" + playerSixFoulsA);
    }

    // PLAYER SEVEN METHODS

    // Adds three points to Player Seven's total points
    public void addThreePointsPlayerSevenA(View view) {
        playerSevenPointsA += 3;
        displayPlayerSevenPointsA(playerSevenPointsA);
    };

    // Adds two points to Player Seven's total points
    public void addTwoPointsPlayerSevenA(View view) {
        playerSevenPointsA += 2;
        displayPlayerSevenPointsA(playerSevenPointsA);
    };

    // Adds one point to Player Seven's total points
    public void addOnePointPlayerSevenA(View view) {
        playerSevenPointsA += 1;
        displayPlayerSevenPointsA(playerSevenPointsA);
    };

    // Updates Player Seven's total points after button click
    private void displayPlayerSevenPointsA (int playerSevenPointsA) {
        TextView playerSevenTotalPointsA = getView().findViewById(R.id.player_7a_total_points);
        playerSevenTotalPointsA.setText("" + playerSevenPointsA);
    };

    // Adds one foul to Player Seven's total fouls
    public void addPlayerSevenFoulA(View view) {
        ++playerSevenFoulsA;
        displayPlayerSevenFoulsA(playerSevenFoulsA);
    }

    // Updates Player Seven's total fouls after button click
    private void displayPlayerSevenFoulsA (int playerSevenFoulsA) {
        TextView playerSevenTotalFoulsA = getView().findViewById(R.id.player_7a_total_fouls);
        playerSevenTotalFoulsA.setText("" + playerSevenFoulsA);
    }

    // PLAYER EIGHT METHODS

    // Adds three points to Player Eight's total points
    public void addThreePointsPlayerEightA(View view) {
        playerEightPointsA += 3;
        displayPlayerEightPointsA(playerEightPointsA);
    };

    // Adds two points to Player Eight's total points
    public void addTwoPointsPlayerEightA(View view) {
        playerEightPointsA += 2;
        displayPlayerEightPointsA(playerEightPointsA);
    };

    // Adds one point to Player Eight's total points
    public void addOnePointPlayerEightA(View view) {
        playerEightPointsA += 1;
        displayPlayerEightPointsA(playerEightPointsA);
    };

    // Updates Player Eight's total points after button click
    private void displayPlayerEightPointsA (int playerEightPointsA) {
        TextView playerEightTotalPointsA = getView().findViewById(R.id.player_8a_total_points);
        playerEightTotalPointsA.setText("" + playerEightPointsA);
    };

    // Adds one foul to Player Eight's total fouls
    public void addPlayerEightFoulA(View view) {
        ++playerEightFoulsA;
        displayPlayerEightFoulsA(playerEightFoulsA);
    }

    // Updates Player Eight's total fouls after button click
    private void displayPlayerEightFoulsA (int playerEightFoulsA) {
        TextView playerEightTotalFoulsA = getView().findViewById(R.id.player_8a_total_fouls);
        playerEightTotalFoulsA.setText("" + playerEightFoulsA);
    }

    // PLAYER NINE METHODS

    // Adds three points to Player Nine's total points
    public void addThreePointsPlayerNineA(View view) {
        playerNinePointsA += 3;
        displayPlayerNinePointsA(playerNinePointsA);
    };

    // Adds two points to Player Nine's total points
    public void addTwoPointsPlayerNineA(View view) {
        playerNinePointsA += 2;
        displayPlayerNinePointsA(playerNinePointsA);
    };

    // Adds one point to Player Nine's total points
    public void addOnePointPlayerNineA(View view) {
        playerNinePointsA += 1;
        displayPlayerNinePointsA(playerNinePointsA);
    };

    // Updates Player Nine's total points after button click
    private void displayPlayerNinePointsA (int playerNinePointsA) {
        TextView playerNineTotalPointsA = getView().findViewById(R.id.player_9a_total_points);
        playerNineTotalPointsA.setText("" + playerNinePointsA);
    };

    // Adds one foul to Player Nine's total fouls
    public void addPlayerNineFoulA(View view) {
        ++playerNineFoulsA;
        displayPlayerNineFoulsA(playerNineFoulsA);
    }

    // Updates Player Nine's total fouls after button click
    private void displayPlayerNineFoulsA (int playerNineFoulsA) {
        TextView playerNineTotalFoulsA = getView().findViewById(R.id.player_9a_total_fouls);
        playerNineTotalFoulsA.setText("" + playerNineFoulsA);
    }

    // PLAYER TEN METHODS

    // Adds three points to Player Ten's total points
    public void addThreePointsPlayerTenA(View view) {
        playerTenPointsA += 3;
        displayPlayerTenPointsA(playerTenPointsA);
    };

    // Adds two points to Player Ten's total points
    public void addTwoPointsPlayerTenA(View view) {
        playerTenPointsA += 2;
        displayPlayerTenPointsA(playerTenPointsA);
    };

    // Adds one point to Player Ten's total points
    public void addOnePointPlayerTenA(View view) {
        playerTenPointsA += 1;
        displayPlayerTenPointsA(playerTenPointsA);
    };

    // Updates Player Ten's total points after button click
    private void displayPlayerTenPointsA (int playerTenPointsA) {
        TextView playerTenTotalPointsA = getView().findViewById(R.id.player_10a_total_points);
        playerTenTotalPointsA.setText("" + playerTenPointsA);
    };

    // Adds one foul to Player Ten's total fouls
    public void addPlayerTenFoulA(View view) {
        ++playerTenFoulsA;
        displayPlayerTenFoulsA(playerTenFoulsA);
    }

    // Updates Player Ten's total fouls after button click
    private void displayPlayerTenFoulsA (int playerTenFoulsA) {
        TextView playerTenTotalFoulsA = getView().findViewById(R.id.player_10a_total_fouls);
        playerTenTotalFoulsA.setText("" + playerTenFoulsA);
    }
    
}
