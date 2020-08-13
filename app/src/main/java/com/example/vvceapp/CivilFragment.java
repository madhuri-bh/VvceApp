package com.example.vvceapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CivilFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        
        View rootView = inflater.inflate(R.layout.civil_fragment, container, false);
        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewCse);

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));


        // this is data fro recycler view
        final ArrayList<ItemsData> itemsData  = new ArrayList<ItemsData>();
        itemsData.add(new ItemsData(R.drawable.dayanand_cv,"Dr. H S Dayananda", "Dean (Examinations) & Head", "B.E.(CE), M.Tech., Ph. D.,"));
        itemsData.add(new ItemsData(R.drawable.umesha_cv,"Dr. Umesha P. K", "Professor", "B.E.(CE), M.Tech., Ph. D."));
        itemsData.add(new ItemsData(R.drawable.shilpa_cv,"Dr. Shilpa B S", "Associate Professor", "B.E.(EV), M.Tech., Ph. D.,"));
        itemsData.add(new ItemsData(R.drawable.mahesh_cv,"D P Mahesh", "Associate Professor", "B.E.(CE),M.Tech., (Env. Engg.)"));
        itemsData.add(new ItemsData(R.drawable.roopapriya_cv,"Roopa Priya J K", "Assistant Professor", "BE, M.Tech., (Env. Engg.)"));
        itemsData.add(new ItemsData(R.drawable.manoj_cv,"Manoj P", "Assistant Professor", "B.E.(CE), M.Tech."));
        itemsData.add(new ItemsData(R.drawable.chethan_cv,"Chethan L", "Assistant Professor", "B.E.(CE), M.Tech."));
        itemsData.add(new ItemsData(R.drawable.madhushree_cv,"Madhushree C", "Assistant Professor", "B.E.(CE), M.Tech.(Hydraulics)"));
        itemsData.add(new ItemsData(R.drawable.abhi_cv,"Abhilash B.L.", "Assistant Professor", "B.E.(CE), M.Tech."));
        itemsData.add(new ItemsData(R.drawable.bharath_cv,"Bharath Kumara", "Instructor", "B.E (CE)"));
        itemsData.add(new ItemsData(R.drawable.poornima_cv,"Poornima T", "Instructor", "BE (CSE)"));
        itemsData.add(new ItemsData(R.drawable.avinash_cv,"Avinash", "Asst. Instructor", "Diploma (CE)"));

        // 3. create an adapter
        ItemsDataAdapter mAdapter = new ItemsDataAdapter(itemsData);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);



        return rootView;
    }
}
