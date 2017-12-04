package com.faridecima.android.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by faride on 04/12/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
