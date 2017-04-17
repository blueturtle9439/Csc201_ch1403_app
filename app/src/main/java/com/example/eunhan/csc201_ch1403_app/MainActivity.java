package com.example.eunhan.csc201_ch1403_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private int[] ran = {R.drawable.card7, R.drawable.card20, R.drawable.card9, R.drawable.card36, R.drawable.card27, R.drawable.card44, R.drawable.card22, R.drawable.card8, R.drawable.card33, R.drawable.card10, R.drawable.card48, R.drawable.card5, R.drawable.card24, R.drawable.card37, R.drawable.card14, R.drawable.card15, R.drawable.card21, R.drawable.card46, R.drawable.card1, R.drawable.card43, R.drawable.card51, R.drawable.card13, R.drawable.card18, R.drawable.card38, R.drawable.card39, R.drawable.card2, R.drawable.card42, R.drawable.card12, R.drawable.card28, R.drawable.card11, R.drawable.card40, R.drawable.card34, R.drawable.card32, R.drawable.card25, R.drawable.card47, R.drawable.card3, R.drawable.card4, R.drawable.card49, R.drawable.card30, R.drawable.card29, R.drawable.card17, R.drawable.card16, R.drawable.card52, R.drawable.card26, R.drawable.card6, R.drawable.card50, R.drawable.card45, R.drawable.card31, R.drawable.card19, R.drawable.card23, R.drawable.card35, R.drawable.card41};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int index = (int) (Math.random() * 52);
        int index2 = (int) (Math.random() * 52);
        while(index == index2){
            index2 = (int) (Math.random() * 52);
        }

        int index3 = (int) (Math.random() * 52);
        while(index3 == index2 || index3 == index){
            index2 = (int) (Math.random() * 52);
        }


        ImageView iv1 = (ImageView)findViewById(R.id.iv1);
        ImageView iv2 = (ImageView)findViewById(R.id.iv2);
        ImageView iv3 = (ImageView)findViewById(R.id.iv3);
        int res = ran[index];
        iv1.setImageResource(res);
        res = ran[index2];
        iv2.setImageResource(res);
        res = ran[index3];
        iv3.setImageResource(res);

    }
}
