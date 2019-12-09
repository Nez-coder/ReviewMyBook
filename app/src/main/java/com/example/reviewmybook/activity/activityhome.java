package com.example.reviewmybook.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.reviewmybook.R;

public class activityhome extends AppCompatActivity {
    public void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_home);
        Button btnsearch = findViewById(R.id.button_search);
        final EditText title = findViewById(R.id.etTitle);
        final EditText author = findViewById(R.id.etAuthor);
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String title_value = title.getText().toString();
                String author_value = author.getText().toString();
                if (title_value.isEmpty() && author_value.isEmpty())
                    Toast.makeText(getApplicationContext(), "Enter valid data", Toast.LENGTH_LONG).show();

                else {
                    String search_data = title_value.toString() + " " + author_value.toString();
                    Intent intent = new Intent(getBaseContext(), activityresults.class);
                    //to pass data to target activity
                    intent.putExtra("message", search_data);
                    startActivity(intent);
                }

            }
        });
    }
}

