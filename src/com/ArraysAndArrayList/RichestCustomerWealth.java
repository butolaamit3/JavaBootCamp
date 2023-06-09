//1672. Richest Customer Wealth
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the bank.
// Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts.
// The richest customer is the customer that has the maximum wealth.
//Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.

package com.ArraysAndArrayList;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));

    }

    private static int maximumWealth(int[][] accounts) {
        int sum = Integer.MIN_VALUE;
        for (int[] money: accounts) {
            int count = 0;
            for (int a: money) {
                count = count +a;
            }
            if(count>sum){
                sum = count;
            }
        }
        return sum;
    }


}
