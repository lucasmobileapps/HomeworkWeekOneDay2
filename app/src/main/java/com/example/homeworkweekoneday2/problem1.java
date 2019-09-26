package com.example.homeworkweekoneday2;

import android.util.Log;

import java.util.List;

public class problem1 {
    public void findDuplicates(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    Log.d("prob1", strings.get(i));
                }
            }
        }
    }

}
