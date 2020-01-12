package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int min, minIdx;
        int sum = gas[0] - cost[0];
        min = sum;
        minIdx = 0;
        for (int i = 1; i < gas.length; i++) {
            sum = sum + gas[i] - cost[i];
            if (sum < min) {
                min = sum;
                minIdx = i;
            }
        }
        return sum >= 0 ? (minIdx + 1) % gas.length : -1;
    }
}