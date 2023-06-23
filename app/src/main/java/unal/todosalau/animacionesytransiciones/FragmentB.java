package unal.todosalau.animacionesytransiciones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
        public FragmentB() {
        // Constructor público vacío requerido
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        // Configurar el contenido y la lógica del FragmentoB aquí
        return view;
    }
}