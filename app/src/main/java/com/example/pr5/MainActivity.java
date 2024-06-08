package com.example.pr5;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rec);
        String[] names = {"Алексей", "Ольга", "Иван", "Мария", "Дмитрий", "Екатерина", "Сергей", "Анна", "Александр", "Наталья"};
        String[] surnames = {"Иванов", "Смирнова", "Петров", "Кузнецова", "Соколов", "Попова", "Лебедев", "Козлова", "Новиков", "Морозова"};
        String[] middleNames = {"Алексеевич", "Олеговна", "Иванович", "Марковна", "Дмитриевич", "Евгеньевна", "Сергеевич", "Андреевна", "Александрович", "Николаевна"};
        ArrayList<CardData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new CardData(names[i], surnames[i], middleNames[i], i+1));
        }
        CustomRecyclerViewAdapter adapter = new CustomRecyclerViewAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
