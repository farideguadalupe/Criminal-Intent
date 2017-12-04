package com.faridecima.android.criminallntent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by faride on 04/12/2017.
 */

public class CrimeLab {

    private static CrimeLab sCrimelab;
    private List<Crime> mCrimes;

    public static CrimeLab get (Context context) {
        if (sCrimelab == null){
            sCrimelab  = new CrimeLab(context);
        }
        return sCrimelab;

    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for (int i=1; i<=100; ++i){
            Crime crime = new Crime();
            crime.setmTitle("crime #" + i);
            crime.setmSolved(i%2==0);
            mCrimes.add(crime);
        }
    }
    public List<Crime>getmCrimes () { return mCrimes; }
    public Crime getCrime(UUID id){
        for (Crime crime : mCrimes){
            if (crime.getmId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}
