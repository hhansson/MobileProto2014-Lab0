package com.fragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 9/11/14.
 */
public class MyFragment extends Fragment {

    public MyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_frag, container, false);

        ListView myListView = (ListView) rootView.findViewById(R.id.my_list_view);

        String[] listChats = {"Chat", "List", "Hayley", "Boom"};
        myListView.setAdapter(new ChatAdapter(getActivity(), R.layout.chat_item,
                new ArrayList<String>(Arrays.asList(listChats))
        ));

        return rootView;
    }
}
