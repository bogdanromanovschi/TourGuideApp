package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class MonumentsCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element);

        //array elements for the Monuments list
        final ArrayList<TourElement> tourelements = new ArrayList<TourElement>();
        tourelements.add(new TourElement("Johann Strauss Junior","Category: Composers","Stadtpark",R.drawable.schubert));
        tourelements.add(new TourElement("W.A. Mozart","Category: Composers","Burggarten",R.drawable.mozart));
        tourelements.add(new TourElement("Eugenio of Savoy","Category: Historical Figures","Heldenplatz",R.drawable.savoy));
        tourelements.add(new TourElement("Archangel Michael","Category: Mythology","Saint Michael Church",R.drawable.michael));
        tourelements.add(new TourElement("Pallas Athene","Category: Mythology","Parlament",R.drawable.athene));
        tourelements.add(new TourElement("Emperor Joseph II","Category: Historical Figures","Belvedere",R.drawable.joseph));
        tourelements.add(new TourElement("Plague Column","Category: History","Graben",R.drawable.plague));
        tourelements.add(new TourElement("Iranian luminaries","Category: Historical Figures","UNO City",R.drawable.iranian));
        tourelements.add(new TourElement("Ludwig van Beethoven","Category: Composers","Beethoven Platz",R.drawable.beethoven));
        tourelements.add(new TourElement("Empress Maria Theresa","Category: Historical Figures","Maria Theresien Platz",R.drawable.theresa));

        TourElementAdapter adapter = new TourElementAdapter(this, tourelements, R.color.category_monuments);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}