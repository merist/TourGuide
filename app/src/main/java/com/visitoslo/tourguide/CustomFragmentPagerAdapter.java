package com.visitoslo.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 5/6/2018.
 */

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private static final int PAGE_COUNT = 5;

    /**
     * Create a new {@link CustomFragmentPagerAdapter} object.
     *
     * @param context         is the context of the app
     * @param fragmentManager is the fragment manager that will keep each fragment's state in the adapter
     *                        across swipes.
     */
    public CustomFragmentPagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new HotelFragment();
            case 2:
                return new RestaurantFragment();
            case 3:
                return new MuseumFragment();
            case 4:
                return new EventFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Return title based on item position
        switch (position) {
            case 1:
                return mContext.getResources().getString(R.string.hotels);
            case 2:
                return mContext.getResources().getString(R.string.restaurants);
            case 3:
                return mContext.getResources().getString(R.string.museums);
            case 4:
                return mContext.getResources().getString(R.string.events);
            default:
                return mContext.getResources().getString(R.string.home);
        }
    }
}
