package com.visitoslo.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays the museums page
 */
public class MuseumFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> museums = new ArrayList<>();
        museums.add(new Place(getString(R.string.museum_technology),getString(R.string.museum_technology_address),R.drawable.technical_museum));
        museums.add(new Place(getString(R.string.museum_national),getString(R.string.museum_national_address),R.drawable.national_museum));
        museums.add(new Place(getString(R.string.museum_culture),getString(R.string.museum_culture_address),R.drawable.culture_museum));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),museums);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}
