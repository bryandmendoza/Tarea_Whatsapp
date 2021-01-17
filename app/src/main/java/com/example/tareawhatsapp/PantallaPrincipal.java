package com.example.tareawhatsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tareawhatsapp.databinding.ActivityPantallaPrincipalBinding;
import com.example.tareawhatsapp.fragmentos.Chats;
import com.example.tareawhatsapp.fragmentos.Estados;
import com.example.tareawhatsapp.fragmentos.Llamadas;

import java.util.ArrayList;
import java.util.List;

public class PantallaPrincipal extends AppCompatActivity {

    private ActivityPantallaPrincipalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pantalla_principal);
        configurarViewPager(binding.viewPgr1);
        binding.tbLyt1.setupWithViewPager(binding.viewPgr1);
        setSupportActionBar(binding.toolbar1);
    }

    private void configurarViewPager(ViewPager viewPager) {
        PantallaPrincipal.AdaptadorSeccionPaginador adapter = new AdaptadorSeccionPaginador(getSupportFragmentManager());
        adapter.agregarFragmento(new Chats(), "Chats");
        adapter.agregarFragmento(new Estados(), "Estados");
        adapter.agregarFragmento(new Llamadas(), "Llamadas");
        viewPager.setAdapter(adapter);
    }

    private static class AdaptadorSeccionPaginador extends FragmentPagerAdapter {

        private final List<Fragment> listaFragmentos = new ArrayList<>();
        private final List<String> listaTitulosDeFragmentos = new ArrayList<>();

        public AdaptadorSeccionPaginador(FragmentManager fm) {
            super(fm);
        }

        public void agregarFragmento(Fragment fm, String title) {
            listaFragmentos.add(fm);
            listaTitulosDeFragmentos.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return listaTitulosDeFragmentos.get(position);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return listaFragmentos.get(position);
        }

        @Override
        public int getCount() {
            return listaFragmentos.size();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menuitemBuscar:
                Toast.makeText(PantallaPrincipal.this, "La búsqueda no está disponible", Toast.LENGTH_LONG).show(); break;
            case R.id.menuitemOpciones:
                Toast.makeText(PantallaPrincipal.this, "Las opciones no están disponibles", Toast.LENGTH_LONG).show(); break;
        }
        return super.onOptionsItemSelected(item);
    }
}