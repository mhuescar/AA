package com.example.mhues.miproyecto.activity;

import android.support.v4.app.Fragment;
import android.view.Menu;

import com.example.mhues.miproyecto.R;
import com.example.mhues.miproyecto.fragment.FragmentPager;

//ACTIVIDAD DEL PAGER, CUANDO SE LE LLAMA CREA UN NUEVO PAGER Y LE PONE EL MENU DE LOS 3 PUNTOS
public class PagerActivity extends FragmentContainerActivity  {

    @Override
    protected Fragment createFragment() {
        FragmentPager fragment = new FragmentPager();
        return fragment;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
