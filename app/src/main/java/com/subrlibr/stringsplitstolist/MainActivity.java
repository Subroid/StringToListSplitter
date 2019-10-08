package com.subrlibr.stringsplitstolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.subrlibr.stringtolistsplitter.StringToListSplitter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText multiLineEditText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiLineEditText = findViewById(R.id.multiLineEditText);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                List<String> stringList = new ArrayList<>();
               List<String> stringList = StringToListSplitter.splitIt(
                        multiLineEditText.getText().toString(),
                        editText.getText().toString());
                Intent intent = new Intent(MainActivity.this, ViewResultsActivity.class);
                intent.putStringArrayListExtra("list_result", (ArrayList<String>) stringList);
                startActivity(intent);
            }
        });
    }
}
