package com.example.homeworkweekoneday2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Problem 1
        List<String> prob1List = new LinkedList<>();
        prob1List.add("Joe");
        prob1List.add("Dirt");
        prob1List.add("Joe");

        problem1 prob1 = new problem1();

        prob1.findDuplicates(prob1List);

        //Problem 2
        List<String> prob2List = new LinkedList<>();
        prob2List.add("Mom");
        prob2List.add("Joe");

        problem2 prob2 = new problem2();

        for (String str : prob2List) {
            String boolString = (prob2.checkPalindrome(str)) ? " is" : " is not";
            Log.d("prob2", str + boolString + " a palindrome");
        }

        //Problem 3
        List<Integer> prob3List = new LinkedList<>();
        prob3List.add(15);
        prob3List.add(9);
        prob3List.add(10);
        prob3List.add(8);


        problem3 prob3 = new problem3();

        for (Integer str : prob3List) {
            Log.d("prob3", prob3.fizzBuzz(str));
        }

    }


}