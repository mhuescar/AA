package com.example.mhues.miproyecto.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mhues.miproyecto.fragment.FragmentEmpleo;
import com.example.mhues.miproyecto.fragment.FragmentNoticias;
import com.example.mhues.miproyecto.fragment.FragmentEventos;

import java.util.Locale;

//ACTIVIDAD QUE CONTROLA EL FUNCIOANMIENTO DEL PAGER, QUÉ PAGINA VISUALIZAMOS CREANDO
//EL FRAGMENT CORRESPONDIENTE A VISUALIZAR
public class PagerAdapter extends FragmentPagerAdapter {


    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentNoticias();

            case 1:
                return new FragmentEventos();

            case 2:
                return new FragmentEmpleo();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Section 1".toUpperCase(l);
            case 1:
                return "Section 2".toUpperCase(l);
            case 2:
                return "Section 3".toUpperCase(l);
        }
        return null;
    }


}
