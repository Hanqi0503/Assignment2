/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment2;

/**
 *
 * @author hanqi
 */

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        // Read the length of the array
        int n = scanner.nextInt();

        // Read the array elements
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Count negative subarrays
        int count = 0;
        for (int i = 0; i < n; i++) {
            int subarraySum = 0;
            for (int j = i; j < n; j++) {
                subarraySum += A[j];
                if (subarraySum < 0) {
                    count++;
                }
            }
        }

        // Output the result
        System.out.println(count);

        // Close the scanner
        scanner.close();
    }
}

