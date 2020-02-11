package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static RecyclerView rc;
    private static RecyclerView.Adapter ada;
    private RecyclerView.LayoutManager rlm;
    private static ArrayList<constr> ac;
    static View.OnClickListener tst;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tst=new Myon(this);
        rc=findViewById(R.id.rec1);
        rc.setHasFixedSize(true);
        rlm=new LinearLayoutManager(this);
        rc.setLayoutManager(rlm);
        ac=new ArrayList<constr>();
        String a[]={"cupcake","Donut","Eclair"};

        Integer ad[]={R.drawable.icon,R.drawable.icon,R.drawable.icon};

         for(int i=0;i<a.length;i++)
         {
             ac.add(new constr(a[i],ad[i]));
         }
         ada=new adapter(ac);
         rc.setAdapter(ada);




    }

    private static class Myon implements View.OnClickListener{
        private final Context context;

        private Myon(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "Hi", Toast.LENGTH_SHORT).show();
        }
    }
}
