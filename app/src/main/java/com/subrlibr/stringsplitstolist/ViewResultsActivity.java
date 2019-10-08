package com.subrlibr.stringsplitstolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ViewResultsActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_results);
        textView = findViewById(R.id.textView);
//        List<String> stringList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        if (getIntent().getExtras() != null) {
           List<String> stringList = getIntent().getStringArrayListExtra("list_result");
            for (String string:
                    stringList
                 ) {
                stringBuilder.append(string + " ");
            }
            textView.setText(stringBuilder.toString());
        }
    }
}
