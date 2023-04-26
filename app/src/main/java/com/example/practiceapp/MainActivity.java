package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.Display;
import android.view.View;

import com.example.practiceapp.Model.ModelClass;
import com.example.practiceapp.databinding.ActivityMainBinding;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    ArrayList<Integer> listOfInteger;
    ArrayList<ModelClass> listOfModel;

    HashSet<Integer> integerHashSet;
    HashSet<ModelClass> modelClassHashSet;

    LinkedList<String> stringLinkedList;
    LinkedList<ModelClass> modelClassLinkedList;

    HashMap<Integer, String> integerStringHashMap;
    HashMap<Integer, ModelClass> integerModelClassHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listOfInteger = new ArrayList<>();
        listOfModel = new ArrayList<>();
        integerHashSet = new HashSet<>();
        modelClassHashSet = new HashSet<>();
        stringLinkedList = new LinkedList<>();
        modelClassLinkedList = new LinkedList<>();
        integerStringHashMap = new HashMap<>();
        integerModelClassHashMap = new HashMap<>();


        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(3);
        listOfInteger.add(4);
        listOfInteger.add(5);

        listOfModel.add(new ModelClass("yogesh", "7999717423"));
        listOfModel.add(new ModelClass("shubham", "7000563591"));
        listOfModel.add(new ModelClass("sakshi", "1234567890"));
        listOfModel.add(new ModelClass("pragati", "0987654321"));

        integerHashSet.add(3);
        integerHashSet.add(1);
        integerHashSet.add(5);
        integerHashSet.add(6);
        integerHashSet.add(2);

        modelClassHashSet.add(new ModelClass("yogesh", "8225055150"));
        modelClassHashSet.add(new ModelClass("shubham", "7000563591"));
        modelClassHashSet.add(new ModelClass("pragati", "0987654321"));
        modelClassHashSet.add(new ModelClass("sakshi", "1234567890"));

        stringLinkedList.offer("yogesh");
        stringLinkedList.offer("sakshi");
        stringLinkedList.offer("shubham");
        stringLinkedList.offer("pragati");

        modelClassLinkedList.offer(new ModelClass("yogesh", "8225055150"));
        modelClassLinkedList.offer(new ModelClass("shubham", "7000563591"));
        modelClassLinkedList.offer(new ModelClass("pragati", "0987654321"));
        modelClassLinkedList.offer(new ModelClass("sakshi", "1234567890"));

        integerStringHashMap.put(1, "yogesh");
        integerStringHashMap.put(2, "shubham");
        integerStringHashMap.put(3, "pragati");
        integerStringHashMap.put(4, "sakshi");

        integerModelClassHashMap.put(1, new ModelClass("yogesh", "7999717423"));
        integerModelClassHashMap.put(2, new ModelClass("shubham", "7000562591"));
        integerModelClassHashMap.put(3, new ModelClass("sakshi", "1234567890"));
        integerModelClassHashMap.put(4, new ModelClass("pragati", "0987654321"));


        binding.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tabs.class);

                Bundle bundle = new Bundle();
                bundle.putInt("int", 1);
                bundle.putDouble("double", 3.14159);
                bundle.putChar("char", 'c');
                bundle.putString("string", "yogesh");

                //  ArrayList (integer and model)
                bundle.putIntegerArrayList("listOfInt", listOfInteger);
                bundle.putSerializable("serializableListOfInt", listOfInteger);
                bundle.putSerializable("serializableListOfModel", listOfModel);

                //  HashSet (integer and model)
                bundle.putSerializable("serializableIntegerHashSet", integerHashSet);
                bundle.putSerializable("serializableModelClassHashSet", modelClassHashSet);

                //  LinkedList (String and model)
                bundle.putSerializable("serializableStringLinkedList", (new ArrayList<>(stringLinkedList)));
                bundle.putSerializable("serializableModelClassLinkedList", new ArrayList<>(modelClassLinkedList));

                //  HashMap (integer,String and integer,model)
                bundle.putSerializable("serializableIntegerStringHashMap", integerStringHashMap);
                bundle.putSerializable("serializableIntegerModelClassHashMap", integerModelClassHashMap);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


}
