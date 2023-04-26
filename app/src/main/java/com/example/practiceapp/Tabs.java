package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.practiceapp.Model.ModelClass;
import com.example.practiceapp.databinding.ActivityTabsBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Tabs extends AppCompatActivity {
    ActivityTabsBinding binding;
    private static final String TAG = "javajavajava";
    int i;
    double d;
    char c;
    String str;

    List<Integer> listOfInteger;
    List<Integer> listOfInteger2;
    List<ModelClass> listOfModel;

    HashSet<Integer> integerHashSet;
    HashSet<ModelClass> modelClassHashSet;

    LinkedList<String> stringLinkedList;
    LinkedList<ModelClass> modelClassLinkedList;

    HashMap<Integer, String> integerStringHashMap;
    HashMap<Integer, ModelClass> integerModelClassHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTabsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listOfInteger = new ArrayList<>();
        listOfInteger2 = new ArrayList<>();
        listOfModel = new ArrayList<>();

        integerHashSet = new HashSet<>();
        modelClassHashSet = new HashSet<>();


        integerStringHashMap = new HashMap<>();
        integerModelClassHashMap = new HashMap<>();

        if (getIntent().getExtras() != null) {

            i = getIntent().getExtras().getInt("int", 0);
            d = getIntent().getExtras().getDouble("double", 0);
            c = getIntent().getExtras().getChar("char", ' ');
            str = getIntent().getExtras().getString("string");

            listOfInteger = getIntent().getExtras().getIntegerArrayList("listOfInt");
            listOfInteger2 = (List<Integer>) getIntent().getExtras().getSerializable("serializableListOfInt");
            listOfModel = (List<ModelClass>) getIntent().getExtras().getSerializable("serializableListOfModel");

            integerHashSet = (HashSet<Integer>) getIntent().getExtras().getSerializable("serializableIntegerHashSet");
            modelClassHashSet = (HashSet<ModelClass>) getIntent().getExtras().getSerializable("serializableModelClassHashSet");

            stringLinkedList = new LinkedList<>((ArrayList<String>) getIntent().getExtras().getSerializable("serializableStringLinkedList"));
            modelClassLinkedList = new LinkedList<>((ArrayList<ModelClass>) getIntent().getExtras().getSerializable("serializableModelClassLinkedList"));

            integerStringHashMap = (HashMap<Integer, String>) getIntent().getExtras().getSerializable("serializableIntegerStringHashMap");
            integerModelClassHashMap = (HashMap<Integer, ModelClass>) getIntent().getExtras().getSerializable("serializableIntegerModelClassHashMap");


            Log.e(TAG + "int", String.valueOf(i));
            Log.e(TAG + "double", String.valueOf(d));
            Log.e(TAG + "char", String.valueOf(c));
            Log.e(TAG + "string", str);

            Log.e(TAG + "arraylist", listOfInteger.toString());
            Log.e(TAG + "arraylist", listOfInteger2.toString());
            for (ModelClass mc : listOfModel) {
                Log.e(TAG + "arraylist", mc.getName() + " " + mc.getPhone());
            }


            Log.e(TAG + "hashset", integerHashSet.toString());
            for (ModelClass mc : modelClassHashSet) {
                Log.e(TAG + "hashset", mc.getName() + " " + mc.getPhone());
            }


            for (Integer i : integerStringHashMap.keySet()) {
                Log.e(TAG + "hashmap", i.toString());
            }
            for (String s : integerStringHashMap.values()) {
                Log.e(TAG + "hashmap", s);
            }
            for (Integer i : integerModelClassHashMap.keySet()) {
                Log.e(TAG + "hashmap", i.toString());
            }
            for (ModelClass mc : integerModelClassHashMap.values()) {
                Log.e(TAG + "hashmap", mc.getName() + " " + mc.getPhone());
            }

            for (String s : stringLinkedList) {
                Log.e(TAG + "linkedlist", s);
            }
            for (ModelClass mc : modelClassLinkedList) {
                Log.e(TAG + "linkedlist", mc.getName() + " " + mc.getPhone());
            }


        }

    }
}