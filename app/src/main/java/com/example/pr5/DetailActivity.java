package com.example.pr5;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        TextView nameTextView = findViewById(R.id.detail_name);
        TextView surnameTextView = findViewById(R.id.detail_surname);
        TextView middleNameTextView = findViewById(R.id.detail_middleName);
        TextView posTextView = findViewById(R.id.detail_pos);
        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String middleName = getIntent().getStringExtra("middleName");
        int pos = getIntent().getIntExtra("pos", +1);
        nameTextView.setText(name);
        surnameTextView.setText(surname);
        middleNameTextView.setText(middleName);
        posTextView.setText(String.valueOf(pos));
    }
}
