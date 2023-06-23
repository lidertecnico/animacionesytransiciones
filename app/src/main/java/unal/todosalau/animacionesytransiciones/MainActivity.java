package unal.todosalau.animacionesytransiciones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private FragmentManager fragmentManager;
private Fragment fragmentA;
private Fragment fragmentB;
private Animation fadeOut;
private Animation fadeIn;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Obtener la referencia al TextView
    TextView textView = findViewById(R.id.Titulo);

    // Cargar la animación de desvanecimiento
    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);

    // Iniciar la animación en el TextView
    textView.startAnimation(animation);

    // Inicializar los fragmentos
    fragmentA = new FragmentA();
    fragmentB = new FragmentB();

    // Obtener el administrador de fragmentos
    fragmentManager = getSupportFragmentManager();

    // Cargar las animaciones de desvanecimiento
    fadeOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
    fadeIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);

    // Obtener las referencias a los botones
    Button botonA = findViewById(R.id.btn_fragment_a);
    Button botonB = findViewById(R.id.btn_fragment_b);

    // Configurar el evento onClick para el botón A
    botonA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            goToFragmentA(v);
        }
    });

    // Configurar el evento onClick para el botón B
    botonB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            goToFragmentB(v);
        }
    });
}

// Método para cambiar al Fragmento A
private void showFragmentA(Fragment fragment) {
    FragmentTransaction transaction = fragmentManager.beginTransaction();
    transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out); // Aplicar animaciones de desvanecimiento
    transaction.replace(R.id.fragment_container, fragment);
    transaction.commit();
}

// Método para cambiar al Fragmento B
private void showFragmentB(Fragment fragment) {
    FragmentTransaction transaction = fragmentManager.beginTransaction();
    transaction.setCustomAnimations(R.anim.slide_in_right, 0); // Aplicar animación de desplazamiento horizontal al Fragmento B
    transaction.replace(R.id.fragment_container, fragment);
    transaction.commit();
}

// Evento para cambiar al Fragmento B
public void goToFragmentB(View view) {
    showFragmentB(fragmentB);
}

// Evento para cambiar al Fragmento A
public void goToFragmentA(View view) {
    showFragmentA(fragmentA);
}
}
