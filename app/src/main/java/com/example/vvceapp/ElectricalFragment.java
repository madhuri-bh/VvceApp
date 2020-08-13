package com.example.vvceapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ElectricalFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.electrical_fragment, container, false);
        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewCse);

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

// this is data fro recycler view
        final ArrayList<ItemsData> itemsData  = new ArrayList<ItemsData>();
        itemsData.add(new ItemsData(R.drawable.shobha_shankar_eee,"Dr. Shobha Shankar", "Professor & Head", "B.E.(EE), M.Tech, Ph.D."));
        itemsData.add(new ItemsData(R.drawable.mohammad_eee,"Mohamed Jalaluddin", "Associate Professor", "B.E.(EE), M.Tech.(Power Systems)"));
        itemsData.add(new ItemsData(R.drawable.rashmi_eee,"Dr. Rashmi S", "Assoicate Professor", "B.E.(EE), M.Tech, Ph.D."));
        itemsData.add(new ItemsData(R.drawable.lokesh_eee,"Dr. Lokesh C", "Assistant Professor", "B.E, M Tech, Phd"));
        itemsData.add(new ItemsData(R.drawable.raghunath_eee,"Raghunath M J", "Assistant Professor", "B.E.(EE), M.Tech.(CAID)"));
        itemsData.add(new ItemsData(R.drawable.gowtham_eee,"Gowtham N", "Assistant Professor", "B.E.(EE), M.Tech.(Micro Electronics)"));
        itemsData.add(new ItemsData(R.drawable.avinash_eee,"Avinash R", "Assistant Professor", "B.E.(EE), M.Tech."));
        itemsData.add(new ItemsData(R.drawable.gouthamb_eee,"Goutham B", "Assistant Professor", "B.E.(EE), M.Tech.(CAID)"));
        itemsData.add(new ItemsData(R.drawable.upanya_eee,"Upanya M", "Assistant Professor", "B.E.(EE), M.Tech."));
        itemsData.add(new ItemsData(R.drawable.vasanth_eee,"Vasanthkumar S T", "Foreman", "B.E., MIE, MISTE"));
        itemsData.add(new ItemsData(R.drawable.mohan_hr_eee,"Mohan H R", "Asst. Instructor", "ITI, NAC, Diploma (EEE)"));

        // 3. create an adapter
        ItemsDataAdapter mAdapter = new ItemsDataAdapter(itemsData);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);


        return rootView;
    }
}
