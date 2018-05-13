package com.visitoslo.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays the hotels page
 */
public class HotelFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> hotels = new ArrayList<>();
        hotels.add(new Place(getString(R.string.hotel_grand),getString(R.string.hotel_grand_address),R.drawable.grand_hotel));
        hotels.add(new Place(getString(R.string.hotel_radisson),getString(R.string.hotel_radisson_address),R.drawable.radisson));
        hotels.add(new Place(getString(R.string.hotel_thon),getString(R.string.hotel_thon_address),R.drawable.thon_hotel));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(),hotels);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}
