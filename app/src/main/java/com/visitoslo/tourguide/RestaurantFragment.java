package com.visitoslo.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays the restaurants page
 */
public class RestaurantFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place(getString(R.string.restaurant_statholdergaarden), getString(R.string.restaurant_statholdergaarden_address), R.drawable.statholdergaarden));
        restaurants.add(new Place(getString(R.string.restaurant_ruffino), getString(R.string.restaurant_ruffino_address), R.drawable.ruffino_restaurant));
        restaurants.add(new Place(getString(R.string.restaurant_fjord), getString(R.string.restaurant_fjord_address), R.drawable.fjord_restaurant));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), restaurants);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}
