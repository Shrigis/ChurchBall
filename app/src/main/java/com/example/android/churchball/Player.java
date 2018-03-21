package com.example.android.churchball;

/**
 * Created by jeff on 2/21/18.
 */

public class Player {
    private int mNumber;
    private int mPoints;
    private int mFouls;

    public int getNumber() {
        return mNumber;
    }

    public int getPoints() {
        return mPoints;
    }

    public int getFouls() {
        return mFouls;
    }

    public void setNumber(int number) {
        mNumber = number;
    }

    public void addPoints(int points) {
        mPoints += points;
    }

    public void addFoul() {
        mFouls++;
    }
}
