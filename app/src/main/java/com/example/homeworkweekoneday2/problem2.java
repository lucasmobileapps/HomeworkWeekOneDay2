package com.example.homeworkweekoneday2;

public class problem2 {
    public boolean checkPalindrome(String s){
        String lowerS = s.toLowerCase();
        int n = lowerS.length();
        for (int i = 0; i < (n/2); ++i) {
            if (lowerS.charAt(i) != lowerS.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;

};
}
