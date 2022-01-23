package com.cevrim.premierleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class takimlaractivity extends AppCompatActivity {
    ListView listView;
    ArrayList<teams> teamsArrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takimlaractivity);
        listView=findViewById(R.id.listView);
        teamsArrayList.add(new teams("Manchester City",R.drawable.mancity));
        teamsArrayList.add(new teams("Chelsea",R.drawable.chelsea));
        teamsArrayList.add(new teams("Liverpool",R.drawable.liverpool));
        teamsArrayList.add(new teams("Arsenal",R.drawable.arsenal));
        teamsArrayList.add(new teams("West Ham United",R.drawable.westham));
        teamsArrayList.add(new teams("Tottenham Hotspur",R.drawable.tottenham));
        teamsArrayList.add(new teams("Manchester United",R.drawable.manu));
        teamsArrayList.add(new teams("Wolverhampton",R.drawable.wolwerhampton));
        teamsArrayList.add(new teams("Brighton",R.drawable.brighton));
        teamsArrayList.add(new teams("Leicester City",R.drawable.leicester));
        teamsArrayList.add(new teams("Crystal Palace",R.drawable.crystalpalace));
        teamsArrayList.add(new teams("Brentford",R.drawable.brentford));
        teamsArrayList.add(new teams("Aston Villa",R.drawable.astonvilla));
        teamsArrayList.add(new teams("Southampton",R.drawable.southampton));
        teamsArrayList.add(new teams("Everton",R.drawable.everton));
        teamsArrayList.add(new teams("Leeds United",R.drawable.leeds));
        teamsArrayList.add(new teams("Watford",R.drawable.watford));
        teamsArrayList.add(new teams("Burnley",R.drawable.burnley));
        teamsArrayList.add(new teams("Newcastle United",R.drawable.newcastle));
        teamsArrayList.add(new teams("Norwich City",R.drawable.norwich));

        CevrimAdapter adptr=new CevrimAdapter(teamsArrayList,this);
        listView.setAdapter(adptr);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent kafayiyemeceler= new Intent(getApplicationContext(),maclaractivity.class);
                kafayiyemeceler.putExtra("pozisyon",position);
                startActivity(kafayiyemeceler);
            }
        });
    }

    public void btnall(View view) {
        Intent i=new Intent(getApplicationContext(),tummaclar.class);
        startActivity(i);
    }
}