package com.example.vvceapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ComputerScienceFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        
        View rootView = inflater.inflate(R.layout.computer_science_fragment, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewCse);

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));



        // this is data fro recycler view
        final ArrayList<ItemsData> itemsData  = new ArrayList<ItemsData>();
        itemsData.add(new ItemsData(R.drawable.ravikumar_cse,"Dr.Ravikumar V","Professor & head", "B.E.(EEE),M.Tech.(CSE),Ph.D." ));
        itemsData.add(new ItemsData(R.drawable.paramesh_cse, "Dr. Paramesha K", "Professor" , "B.E.(CSE), M.Tech.(CNE), Ph.D"));
        itemsData.add(new ItemsData(R.drawable.gururaj_cse,"Dr. Gururaj H L","Associate Professor","B.E.(CSE), M.Tech.(CSE), Ph.D"));
        itemsData.add(new ItemsData(R.drawable.hamsaveni_cse,"Hamsaveni M","Assistant Professor", "B.E.(CSE), M.Tech.(MEM),(Ph.D)" ));
        itemsData.add(new ItemsData(R.drawable.shraddha_cse,"Shraddha C", "Assistant Professor", "B.E.(CSE), M.Tech.(DCN)"));
        itemsData.add(new ItemsData(R.drawable.usha_cse,"Usha C S", "Assistant Professor", "B.E.(CSE), M.Tech.(CSE)"));
        itemsData.add(new ItemsData(R.drawable.ambika_cse,"Ambika V","Assistant Professor", "B.E.(CSE), M.Tech.(CNE)"));
        itemsData.add(new ItemsData(R.drawable.nithin_cse,"Nithin Kumar", "Assistant Professor", "B.E.(CSE), M.Tech.(CSE)"));
        itemsData.add(new ItemsData(R.drawable.mohan_cse,"Mohan H S", "System Analyst", "M.Sc (IT)"));
        itemsData.add(new ItemsData(R.drawable.pushkin_cse,"Pushkin K M", "Asst. Instructor", "Diploma in CSE"));
        itemsData.add(new ItemsData(R.drawable.pradeep_cse,"Pradeep", "Asst. Instructor", "Diploma in CSE"));

        // 3. create an adapter
        ItemsDataAdapter mAdapter = new ItemsDataAdapter(itemsData);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);


        return rootView;
    }
}
