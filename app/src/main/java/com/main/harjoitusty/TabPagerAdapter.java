package com.main.harjoitusty;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.main.harjoitusty.fragments.BattleFragment;
import com.main.harjoitusty.fragments.DodFragment;
import com.main.harjoitusty.fragments.TrainingFragment;
import com.main.harjoitusty.fragments.HomeFragment;

public class TabPagerAdapter extends FragmentStateAdapter {


    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new TrainingFragment();
            case 2:
                return new BattleFragment();
            case 3:
                return new DodFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
