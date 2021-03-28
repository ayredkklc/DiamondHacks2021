package com.example.simplequiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;

public class FactsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_rdm_fct;

    TextView tv_fact;
    private RandomFacts fact = new RandomFacts();

    private int numberOfFacts = fact.facts.length;
    private int currentFact = 0;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        btn_rdm_fct = (Button) findViewById(R.id.btn_rdm_fct);
        btn_rdm_fct.setOnClickListener(this);

        tv_fact = (TextView) findViewById(R.id.tv_fact);

        random = new Random();
        NextFact(random.nextInt(numberOfFacts));


        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_rdm_fct) {
            NextFact(random.nextInt(numberOfFacts));
        }
    }


    private void NextFact(int num) {
        tv_fact.setText(fact.getFact(num));

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
