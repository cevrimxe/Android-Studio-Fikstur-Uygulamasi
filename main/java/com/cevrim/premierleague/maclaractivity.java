package com.cevrim.premierleague;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class maclaractivity extends AppCompatActivity {
    RecyclerView denemerecycler;

    String s1[];
    int images[]={R.drawable.mancity
            ,R.drawable.chelsea
            ,R.drawable.liverpool
            ,R.drawable.arsenal
            ,R.drawable.westham
            ,R.drawable.tottenham
            ,R.drawable.manu
            ,R.drawable.wolwerhampton
            ,R.drawable.brighton
            ,R.drawable.leicester
            ,R.drawable.crystalpalace
            ,R.drawable.brentford
            ,R.drawable.astonvilla
            ,R.drawable.southampton
            ,R.drawable.everton
            ,R.drawable.leeds
            ,R.drawable.watford
            ,R.drawable.burnley
            ,R.drawable.newcastle
            ,R.drawable.norwich};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maclaractivity);
        denemerecycler=findViewById(R.id.denemerecycler);
        s1=getResources().getStringArray(R.array.team_names);
        int val=getIntent().getIntExtra("pozisyon",0);

        CevrimRecyclerAdapter adptr=new CevrimRecyclerAdapter(this,s1,images,val);
        denemerecycler.setAdapter(adptr);
        denemerecycler.setLayoutManager(new LinearLayoutManager(this));
    }
}