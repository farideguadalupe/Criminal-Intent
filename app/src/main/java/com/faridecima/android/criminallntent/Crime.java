package com.faridecima.android.criminallntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by faride on 01/12/2017.
 */

public class Crime {

    UUID mId;
    String mTitle;
    Date mDate;
    boolean mSolved;

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Crime (){
        mId = UUID.randomUUID();
        mDate = new Date();

    }
}

