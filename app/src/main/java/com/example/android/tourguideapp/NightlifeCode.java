package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class NightlifeCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element);

        //array elements for the Nightlife list
        final ArrayList<TourElement> tourelements = new ArrayList<TourElement>();
        tourelements.add(new TourElement("Sass Music Club","Karlsplatz 1","Reservations: 01 5041669"));
        tourelements.add(new TourElement("lutz - der club","Mariahilfer Str. 3","Reservations: 0664 80305405"));
        tourelements.add(new TourElement("Rhiz","U-Bahnbogen 37","Reservations: 01 4092505"));
        tourelements.add(new TourElement("Babylon Nightclub","Seilerstätte 1","Reservations: 01 5128495"));
        tourelements.add(new TourElement("Cabaret Fledermaus","Spiegelgasse 2","Reservations: 01 5870196"));
        tourelements.add(new TourElement("Radio . The LabelBar","Neustiftgasse 38","Reservations: 04367 69363128"));
        tourelements.add(new TourElement("Tanzcafe Jenseits","Nelkengasse 3","Reservations: 01 5871233"));
        tourelements.add(new TourElement("Flex","Augartenbrücke","Reservations: 01 5337525"));
        tourelements.add(new TourElement("Primi","Neuer Markt 10-11","Reservations: 0676 5610398"));
        tourelements.add(new TourElement("Why Not Clubdisco","Tiefer Graben 22","Reservations: 01 9204714"));
        tourelements.add(new TourElement("Celeste Cafe","Hamburgerstr. 18","Reservations: 01 5865314"));


        TourElementAdapter adapter = new TourElementAdapter(this, tourelements, R.color.category_nightlife);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
