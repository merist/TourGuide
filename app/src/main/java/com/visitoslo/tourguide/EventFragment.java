package com.visitoslo.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays the most recent events that are happening in Oslo
 */
public class EventFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> events = new ArrayList<>();
        events.add(new Place(getString(R.string.constitutional_day),getString(R.string.constitutional_day_address),R.drawable.constitutional_day));
        events.add(new Place(getString(R.string.medieval_festival),getString(R.string.medieval_festival_address),R.drawable.medieval_festival));
        events.add(new Place(getString(R.string.national_music_day),getString(R.string.national_music_day_address),R.drawable.national_music_day));
        events.add(new Place(getString(R.string.blisett_games),getString(R.string.blisett_games_address),R.drawable.blisett_games));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(),events);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}
