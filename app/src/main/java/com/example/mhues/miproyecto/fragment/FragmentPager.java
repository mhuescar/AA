package com.example.mhues.miproyecto.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mhues.miproyecto.R;
import com.example.mhues.miproyecto.adapter.PagerAdapter;


public class FragmentPager extends Fragment {

    private ViewPager mPager;
    private android.support.v4.view.PagerAdapter mPagerAdapter;
    private TabLayout tabLayout;

    public FragmentPager() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_pager, container, false);

        mPager = (ViewPager) rootView.findViewById(R.id.pager);
        mPagerAdapter = new PagerAdapter(getFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);

        /*
        TabLayout.newTab() method creates a tab view, Now a Tab view is not the view
        which is below the tabs, its the tab itself.
         */

        final TabLayout.Tab noticias = tabLayout.newTab();
        final TabLayout.Tab eventos = tabLayout.newTab();
        final TabLayout.Tab empleo = tabLayout.newTab();

        /*
        Setting Title text for our tabs respectively
         */

        noticias.setText("Noticias");
        eventos.setText("Eventos");
        empleo.setText("Empleo");

        /*
        Adding the tab view to our tablayout at appropriate positions
        As I want home at first position I am passing home and 0 as argument to
        the tablayout and like wise for other tabs as well
         */
        tabLayout.addTab(noticias, 0);
        tabLayout.addTab(eventos, 1);
        tabLayout.addTab(empleo, 2);

        /*
        TabTextColor sets the color for the title of the tabs, passing a ColorStateList here makes
        tab change colors in different situations such as selected, active, inactive etc

        TabIndicatorColor sets the color for the indiactor below the tabs
         */
        tabLayout.setTabTextColors(ContextCompat.getColorStateList(getActivity(), R.color.tab_selector));
        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(getActivity(), R.color.indicator));


        /*
        Adding a onPageChangeListener to the viewPager
        1st we add the PageChangeListener and pass a TabLayoutPageChangeListener so that Tabs Selection
        changes when a viewpager page changes.
         */
        tabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mPager));
        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        return rootView;



    }


}
