package com.example.simplequiz;

import android.graphics.Typeface;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        TextView tv_resources = findViewById(R.id.textVal);
        String text = "Recycling \n" +
                "\n" +
                "Recycling is the process of converting waste materials into new materials and objects.\n" +
                "\n" +
                "Benefits of Recycling\n" +
                "\n" +
                "\to Reduces the amount of waste sent to landfills and incinerators\n" +
                "\to Conserves natural resources such as timber, water and minerals\n" +
                "\to Increases economic security by tapping a domestic source of materials\n" +
                "\to Prevents pollution by reducing the need to collect new raw materials\n" +
                "\to Saves energy\n" +
                "\to Supports American manufacturing and conserves valuable resources\n" +
                "\to Helps create jobs in the recycling and manufacturing industries in the United States\n" +
                "\n" +
                "Common Recycling Mistakes\n" +
                "\n" +
                "\to It can’t be recycled if it’s covered in food.\n" +
                "\to Putting recyclables in plastic bags.\n" +
                "\t\t- Any recycling that’s thrown out in a plastic bag will go straight to landfill, so it’s really just a waste of your time. \n" +
                "\to Batteries and electrical products can’t be recycled.\n" +
                "\n" +
                "Composting\n" +
                "\n" +
                "Composting turns household wastes into valuable fertilizer and soil organic matter.\n" +
                "\n" +
                "Composting Basics\n" +
                "\n" +
                "All composting requires three basic ingredients:\n" +
                "\to Browns - This includes materials such as dead leaves, branches, and twigs. \n" +
                "\to Greens - This includes materials such as grass clippings, vegetable waste, fruit scraps, and coffee grounds.\n" +
                "\to Water - Having the right amount of water, greens, and browns is important for compost development.\n" +
                "\n" +
                "What Not To Compost and Why\n" +
                "\n" +
                "\to Black walnut tree leaves or twigs\n" +
                "\t    \t-Releases substances that might be harmful to plants\n" +
                "\to Coal or charcoal ash\n" +
                "\t\t- Might contain substances harmful to plants\n" +
                "\to Dairy products (e.g., butter, milk, sour cream, yogurt) and eggs*\n" +
                "\t\t- Create odor problems and attract pests such as rodents and flies\n" +
                "\to Diseased or insect-ridden plants\n" +
                "\t\t- Diseases or insects might survive and be transferred back to other plants\n" +
                "\to Fats, grease, lard, or oils*\n" +
                "\t\t- Create odor problems and attract pests such as rodents and flies\n" +
                "\to Meat or fish bones and scraps*\n" +
                "\t\t- Create odor problems and attract pests such as rodents and flies\n" +
                "\to Pet wastes (e.g., dog or cat feces, soiled cat litter)*\n" +
                "\t\t- Might contain parasites, bacteria, germs, pathogens, and viruses harmful to humans\n" +
                "\to Yard trimmings treated with chemical pesticides\n" +
                "\t\t- Might kill beneficial composting organisms\n" +
                "* Check with your local composting or recycling coordinator to see if these organics are accepted by your community curbside or drop-off composting program.\n" +
                "\n" +
                "Benefits of Composting\n" +
                "\n" +
                "\to Enriches soil, helping retain moisture and suppress plant diseases and pests.\n" +
                "\to Reduces the need for chemical fertilizers.\n" +
                "\to Encourages the production of beneficial bacteria and fungi that break down organic matter to create humus, a rich nutrient-filled material.\n" +
                "\to Reduces methane emissions from landfills and lowers your carbon footprint.\n\n" +
                "Check out these links to learn more!";

        SpannableString ss = new SpannableString(text);

        RelativeSizeSpan titleSize = new RelativeSizeSpan(2f);

        ss.setSpan(new RelativeSizeSpan(1.6f), 0, 10, 0);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new ForegroundColorSpan(0xFF008000), 0, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ss.setSpan(new RelativeSizeSpan(1.2f), 98, 121, 0);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 98, 121, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new ForegroundColorSpan(0xFF008000), 98, 121, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ss.setSpan(new RelativeSizeSpan(1.2f), 571, 598, 0);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 571, 598, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new ForegroundColorSpan(0xFF008000), 571, 598, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ss.setSpan(new RelativeSizeSpan(1.6f), 871, 882, 0);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 871, 882, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new ForegroundColorSpan(0xFF008000), 871, 882, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ss.setSpan(new RelativeSizeSpan(1.2f), 967, 986, 0);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 967, 986, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new ForegroundColorSpan(0xFF008000), 967, 986, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ss.setSpan(new RelativeSizeSpan(1.2f), 1329, 1358, 0);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 1329, 1358, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new ForegroundColorSpan(0xFF008000), 1329, 1358, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ss.setSpan(new RelativeSizeSpan(1.2f), 2384, 2407, 0);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 2384, 2407, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new ForegroundColorSpan(0xFF008000), 2384, 2407, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ss.setSpan(new RelativeSizeSpan(1.6f), 2758, 2794, 0);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 2758, 2794, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new ForegroundColorSpan(0xFF008000), 2758, 2794, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        tv_resources.setText(ss);

        // adding back arrow
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupHyperlinks();
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

    private void setupHyperlinks() {
        TextView linkTextView1 = findViewById(R.id.link1);
        linkTextView1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView2 = findViewById(R.id.link2);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView3 = findViewById(R.id.link3);
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());
    }

}