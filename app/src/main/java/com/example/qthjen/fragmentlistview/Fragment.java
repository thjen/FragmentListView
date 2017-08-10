package com.example.qthjen.fragmentlistview;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Fragment extends ListFragment {

    String list[] = { "Q.ThjeN", "Tun hentai", "Quốc Thiện", "Adc carry", "Q.ThjeN Adc", "Thjenit98", "Hi Q.ThjeN"};
    ArrayAdapter arrayAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, list);
        setListAdapter(arrayAdapter);



        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        Toast.makeText(getActivity(), list[position], Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);
    }
}
