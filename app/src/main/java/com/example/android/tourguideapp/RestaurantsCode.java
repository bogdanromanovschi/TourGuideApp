package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class RestaurantsCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element);

        //array elements for the Restaurants list
        final ArrayList<TourElement> tourelements = new ArrayList<TourElement>();
        tourelements.add(new TourElement("Demel","Kohlmarkt 14, A-1010 Wien","Specific: Austrian"));
        tourelements.add(new TourElement("DO & CO Hotel Vienna","Stephansplatz 12","Specific: European"));
        tourelements.add(new TourElement("Grand Hotel Wien","Kaerntner Ring 9","Specific: European"));
        tourelements.add(new TourElement("Hilton Vienna","Am Stadtpark 1","Specific: European"));
        tourelements.add(new TourElement("Hotel im Palais Schwarzenberg","Schwarzenbergplatz 9","Specific: European"));
        tourelements.add(new TourElement("Hotel Imperial","Karntner Ring 16 A","Specific: European"));
        tourelements.add(new TourElement("Hotel Sacher","Philharmonikerstasse 4","Specific: Austrian"));
        tourelements.add(new TourElement("InterContinental Vienna","Johannesgasse 28","Specific: European"));
        tourelements.add(new TourElement("Novelli bacaro con cucina","Bräunerstrasse 11a","Specific: European"));
        tourelements.add(new TourElement("Palais Coburg","Coburgbastei 4","Specific: European"));
        tourelements.add(new TourElement("Park Hyatt Vienna","Am Hof 2","Specific: European"));
        tourelements.add(new TourElement("Prilisauer","Linzer Straße 423","Specific: Austrian"));
        tourelements.add(new TourElement("Radisson Blu Palais Hotel","Parkring 16","Specific: European"));
        tourelements.add(new TourElement("Restaurant Magnard","45, Cours Brillier","Specific: Austrian"));
        tourelements.add(new TourElement("Rotisserie Prinz Eugen","Am Stadtpark 3","Specific: Austrian"));
        tourelements.add(new TourElement("Steirereck","Am Heumarkt 2A","Specific: Austrian"));
        tourelements.add(new TourElement("Vienna Airport Airrest Catering","1300 Vienna Airport","Specific: European"));



        TourElementAdapter adapter = new TourElementAdapter(this, tourelements, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
