package com.example.practiceapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practiceapp.Model.ModelClass;
import com.example.practiceapp.R;
import com.example.practiceapp.databinding.FragmentFaltuBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Faltu extends Fragment {
    FragmentFaltuBinding binding;
    private static final String TAG = "Faltu";

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFaltuBinding.inflate(inflater, container, false);

        listOfInteger = new ArrayList<>();
        listOfInteger2 = new ArrayList<>();
        listOfModel = new ArrayList<>();

        integerHashSet = new HashSet<>();
        modelClassHashSet = new HashSet<>();

        integerStringHashMap = new HashMap<>();
        integerModelClassHashMap = new HashMap<>();

        if (getArguments() != null) {

            i = getArguments().getInt("int", 0);
            d = getArguments().getDouble("double", 0);
            c = getArguments().getChar("char", ' ');
            str = getArguments().getString("string");

            listOfInteger = getArguments().getIntegerArrayList("listOfInt");
            listOfInteger2 = (List<Integer>) getArguments().getSerializable("serializableListOfInt");
            listOfModel = (List<ModelClass>) getArguments().getSerializable("serializableListOfModel");

            integerHashSet = (HashSet<Integer>) getArguments().getSerializable("serializableIntegerHashSet");
            modelClassHashSet = (HashSet<ModelClass>) getArguments().getSerializable("serializableModelClassHashSet");

            stringLinkedList = new LinkedList<>((ArrayList<String>) getArguments().getSerializable("serializableStringLinkedList"));
            modelClassLinkedList = new LinkedList<>((ArrayList<ModelClass>) getArguments().getSerializable("serializableModelClassLinkedList"));

            integerStringHashMap = (HashMap<Integer, String>) getArguments().getSerializable("serializableIntegerStringHashMap");
            integerModelClassHashMap = (HashMap<Integer, ModelClass>) getArguments().getSerializable("serializableIntegerModelClassHashMap");


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

        return binding.getRoot();
    }
}