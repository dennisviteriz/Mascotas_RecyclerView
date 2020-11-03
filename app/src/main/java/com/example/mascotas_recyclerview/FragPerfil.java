package com.example.mascotas_recyclerview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragPerfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragPerfil extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView ListaContactos;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragPerfil() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragPerfil.
     */
    // TODO: Rename and change types and number of parameters
    public static FragPerfil newInstance(String param1, String param2) {
        FragPerfil fragment = new FragPerfil();
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
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_frag_perfil, container, false);

        ListaContactos = v.findViewById(R.id.idRecycler2);


        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);

         GridLayoutManager glm = new GridLayoutManager(getActivity(),3);

        ListaContactos.setLayoutManager(glm);

        InicializadorMascotas();
        InicializarAdapatador();

        return v;
    }

    public void InicializadorMascotas(){

        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.mas66,"1","Catty"));
        mascotas.add(new Mascota(R.drawable.mas66,"2","Ronny"));
        mascotas.add(new Mascota(R.drawable.mas5,"3","ROMY"));
        mascotas.add(new Mascota(R.drawable.mas4,"4","Gallo"));
    }
    public void InicializarAdapatador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        ListaContactos.setAdapter(adaptador);
    }


}