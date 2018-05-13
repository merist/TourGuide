package com.visitoslo.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 5/6/2018.
 */

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{"Home", "Hotels", "Restaurants", "Museums"};

    /**
     * Create a new {@link CustomFragmentPagerAdapter} object.
     *
     * @param context         is the context of the app
     * @param fragmentManager is the fragment manager that will keep each fragment's state in the adapter
     *                        across swipes.
     */
    public CustomFragmentPagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new HotelFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else if (position == 3) {
            return new MuseumFragment();
        } else {
            return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
