package com.training;

public class OneWay {
    public boolean isOneEditAwaySeparate(String input1, String input2) {
        if (isDiffMoreThanTwo(input1, input2)) {
            return false;
        }

        if (input1.length() == input2.length()) {
            return checkIfOneEditAwayEqual(input1, input2);
        } else {
            boolean firstIsLonger = checkIfOneEditAwayUnequal(input1, input2);
            boolean secondIsLonger = checkIfOneEditAwayUnequal(input1, input2);
            return (input1.length() > input2.length()) ? firstIsLonger : secondIsLonger;
        }
    }

    private boolean checkIfOneEditAwayEqual(String input1, String input2) {
        boolean diffFound = false;
        int len = input1.length();
        for (int i = 0; i < len; i++) {
            if (input1.charAt(i) != input2.charAt(i)) {
                if (diffFound) {
                    return false;
                }
                diffFound = true;
            }
        }

        if (!diffFound) {
            return false;
        }
        return true;
    }

    private boolean checkIfOneEditAwayUnequal(String longer, String shorter) {
        boolean diffFound = false;
        int len = shorter.length();
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (shorter.charAt(i) != longer.charAt((j))) {
                if (diffFound) {
                    return false;
                } else {
                    diffFound = true;
                    j += 2;
                }
            } else {
                j++;
            }
        }
        return true;
    }

    public boolean isOneEditAwayCombined(String input1, String input2) {
        if (isDiffMoreThanTwo(input1, input2)) {
            return false;
        }

        if (input1.length() > input2.length()) {
            return checkIfOneEditAway(input1, input2);
        }
        return checkIfOneEditAway(input2, input1);
    }

    private boolean checkIfOneEditAway(String longer, String shorter) {
        int i = 0, j = 0;
        boolean diffFound = false;

        while (i < shorter.length() && j < longer.length()) {
            if (longer.charAt(j) != shorter.charAt(i)) {
                if (diffFound) {
                    return false;
                }
                diffFound = true;
                if (longer.length() > shorter.length()) {
                    j++;
                }
            }
            i++;
            j++;
        }

        if (!diffFound && longer.length() == shorter.length()) {
            return false;
        }
        return true;
    }

    private boolean isDiffMoreThanTwo(String input1, String input2) {
        return Math.abs(input1.length() - input2.length()) > 1;
    }
}
