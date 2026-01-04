package com.company;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum + i;
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
