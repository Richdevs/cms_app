package com.pgl;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class JobsAdapter extends FragmentStateAdapter {
    public JobsAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0:
                return new NewJobFragment();
            default:
                return new MyJobsFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
