package com.apnatutorials.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String months[] = null;
    ArrayAdapter<String> monthAdapter = null;
    AutoCompleteTextView autoCompleteTvMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        months = getResources().getStringArray(R.array.months);
        monthAdapter = new ArrayAdapter<String>(this, R.layout.hint_completion_layout, R.id.tvHintCompletion, months);
        // monthAdapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item, months);
        autoCompleteTvMonth = (AutoCompleteTextView) findViewById(R.id.autoCompleteTvMonth);
        autoCompleteTvMonth.setAdapter(monthAdapter);

    }


}
