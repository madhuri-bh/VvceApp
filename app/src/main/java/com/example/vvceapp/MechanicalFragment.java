package com.example.vvceapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MechanicalFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        
        View rootView = inflater.inflate(R.layout.mechanical_fragment, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewCse);

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));


        final ArrayList<ItemsData> itemsData  = new ArrayList<ItemsData>();
        itemsData.add(new ItemsData(R.drawable.principal,"Dr. B Sadashive Gowda", "Prinicipal and Proffesor", "B.E, M.E, Ph.D (IISc), MISTE"));
        itemsData.add(new ItemsData(R.drawable.gvnaveen,"Dr. G V Naveen Prakash", "Professor and Head","B.E, M. Tech, Ph. D"));
        itemsData.add(new ItemsData(R.drawable.sudev,"Dr. L J Sudev", "Professor and Dean (TAP)", "B.E, M. Tech, Ph. D"));
        itemsData.add(new ItemsData(R.drawable.krishna,"Dr. S A Mohan Krishna", "Associate Professor", "B.E, M. Tech, Ph. D"));
        itemsData.add(new ItemsData(R.drawable.khalid,"Dr. Khalid Imran", "Associate Professor","B.E, M. Tech, Ph. D"));
        itemsData.add(new ItemsData(R.drawable.naveen_ankegowda,"Naveen Ankegowda", "Assistant Professor", "B.E, M. Tech,"));
        itemsData.add(new ItemsData(R.drawable.raghu_n,"Raghu N", "Assistant Professor", "B.E, M. Tech"));
        itemsData.add(new ItemsData(R.drawable.shrinivas,"Srinivasa D", "Assistant Professor", "B.E, M. Tech"));
        itemsData.add(new ItemsData(R.drawable.vismay,"Vismay K G", "Assistant Professor", "B.E, M. Tech,"));
        itemsData.add(new ItemsData(R.drawable.bp,"Bhanu Prakash M J","Assistant Professor", "B.E, M. Tech,"));
        itemsData.add(new ItemsData(R.drawable.shivakumar,"Shiva Kumar M", "Instructor", "B E"));
        itemsData.add(new ItemsData(R.drawable.satish_kumar,"Satish Kumar", "Instructor", "Diploma"));

        // 3. create an adapter
        ItemsDataAdapter mAdapter = new ItemsDataAdapter(itemsData);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);



        return rootView;
    }
}
