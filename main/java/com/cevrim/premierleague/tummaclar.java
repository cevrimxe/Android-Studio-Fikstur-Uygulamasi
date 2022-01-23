package com.cevrim.premierleague;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tummaclar extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[],s2[],s3[],s4[],s5[];
    int imagesht[]={R.drawable.brighton,
            R.drawable.mancity,
            R.drawable.norwich,
            R.drawable.wolwerhampton,
            R.drawable.newcastle,
            R.drawable.burnley,
            R.drawable.astonvilla,
            R.drawable.westham,
            R.drawable.liverpool,
            R.drawable.tottenham};

    int imagesat[]={R.drawable.crystalpalace,
            R.drawable.chelsea,
            R.drawable.everton,
            R.drawable.southampton,
            R.drawable.watford,
            R.drawable.leicester,
            R.drawable.manu,
            R.drawable.leeds,
            R.drawable.brentford,
            R.drawable.arsenal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tummaclar);
       recyclerView=findViewById(R.id.revivo);
        s1=getResources().getStringArray(R.array.hometeam_names);
        s2=getResources().getStringArray(R.array.awayteam_names);
        s3=getResources().getStringArray(R.array.date);
        s4=getResources().getStringArray(R.array.time);
        s5=getResources().getStringArray(R.array.stadium);

        CevrimRecyclerAdapter2 adpter=new CevrimRecyclerAdapter2(this,s1,s2,s3,s4,s5,imagesht,imagesat);
        recyclerView.setAdapter(adpter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void selam(View view) {
        Toast.makeText(getApplicationContext(), "deneme", Toast.LENGTH_SHORT).show();
    }
}