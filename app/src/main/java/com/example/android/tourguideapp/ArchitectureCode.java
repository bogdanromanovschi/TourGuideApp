package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class ArchitectureCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element);

        //array elements for the Architecture list
        final ArrayList<TourElement> tourelements = new ArrayList<TourElement>();
        tourelements.add(new TourElement("Secession Cupole","Art Nouveau Museum","Joseph Maria Olbrich",R.drawable.secession));
        tourelements.add(new TourElement("Karlsplatz Pavilion","Underground Station","Otto Wagner",R.drawable.karlsplatz));
        tourelements.add(new TourElement("Kalr Marx Hof","Social Housing","Karl Ehn",R.drawable.kalrmarx));
        tourelements.add(new TourElement("Loss Haus","Bank","Adolf Loos",R.drawable.michaelerplatz));
        tourelements.add(new TourElement("Gasometer","Housing","Jean Nouvel",R.drawable.gasometer));
        tourelements.add(new TourElement("Albertina Ramp","Museum Entry","Hans Hollein",R.drawable.albertinaramp));
        tourelements.add(new TourElement("WU Learning Center","University Library","Zaha Hadid",R.drawable.wuuni));
        tourelements.add(new TourElement("Schemerlbruecke","Bridge","Otto Wagner",R.drawable.schmerlbrucke));
        tourelements.add(new TourElement("Stadtopera","Opera House","August von Sicardsburg",R.drawable.opera));
        tourelements.add(new TourElement("Rathaus","City Hall","Friedrich von Schmidt",R.drawable.rathaus));

        TourElementAdapter adapter = new TourElementAdapter(this, tourelements, R.color.category_architecture);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
