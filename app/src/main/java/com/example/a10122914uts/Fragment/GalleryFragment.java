package com.example.a10122914uts.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.a10122914uts.R;
import com.example.a10122914uts.datamodel;
import com.example.a10122914uts.myadapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment
{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<datamodel> dataholder;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment datafragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MusicFragment newInstance(String param1, String param2) {
        MusicFragment fragment = new MusicFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerView=view.findViewById(R.id.recview_gallery);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        dataholder=new ArrayList<>();

        datamodel ob1=new datamodel(R.drawable.luffy,"","");
        dataholder.add(ob1);

        datamodel ob2=new datamodel(R.drawable.chopper,"","");
        dataholder.add(ob2);

        datamodel ob3=new datamodel(R.drawable.luffy,"","");
        dataholder.add(ob3);

        datamodel ob4=new datamodel(R.drawable.chopper,"","");
        dataholder.add(ob4);

        datamodel ob5=new datamodel(R.drawable.luffy,"","");
        dataholder.add(ob5);

        datamodel ob6=new datamodel(R.drawable.chopper,"","");
        dataholder.add(ob6);

        datamodel ob7=new datamodel(R.drawable.luffy,"","");
        dataholder.add(ob7);

        datamodel ob8=new datamodel(R.drawable.chopper,"","");
        dataholder.add(ob8);


        recyclerView.setAdapter(new myadapter(dataholder));

        return view;
    }
}