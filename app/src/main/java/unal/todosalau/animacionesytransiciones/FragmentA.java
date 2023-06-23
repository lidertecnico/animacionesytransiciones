package unal.todosalau.animacionesytransiciones;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class FragmentA extends Fragment {
    public FragmentA() {
        // Constructor público vacío requerido
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        // Configurar el contenido y la lógica del FragmentoB aquí
        return view;
    }
}