package com.example.fernandaochoa.navigationfragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Fernanda Ochoa on 06/07/2015.
 */
public class ViewFragment extends Fragment {
    //Aqui pongo el titulo de cada seccion
    public static final String Seccion_Titulo = "numero";

    public static ViewFragment newInstance(String sectionTitle) {
        ViewFragment fragment = new ViewFragment();
        Bundle args = new Bundle();
        args.putString(Seccion_Titulo, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public ViewFragment() {
    }    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        // Ubicar argumento en el text view de fragment
        String title = getArguments().getString(Seccion_Titulo);
        TextView titulo = (TextView) view.findViewById(R.id.title);
        titulo.setText(title);
        return view;
    }
}
