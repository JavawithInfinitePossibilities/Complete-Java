/**
 * 
 */
package com.tutorials.java.algorithm;

import java.util.Scanner;

/**
 * @author Siddhant sahu
 *
 */
public class TestPeopleGun {

	public void testPeopleAndGun() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println("sorry");
		} else if (n == 1 || n == 2) {
			System.out.println("The survivor is 1");
		} else {
			int s = findSurvive(n);
			System.out.println("The survivor is :" + s);
		}
	}

	private int findSurvive(int n) {
		for (int i = 0; i < n / 2; i++) {
			int sum = (int) Math.pow(2, 1);
			if (sum >= n) {
				if (sum == n) {
					return 1;
				}
				if (sum == n + 1) {
					return n;
				} else {
					int diff = ((sum - 1) - n) * 2;
					return (sum - 1) - diff;
				}
			}
		}
		return 0;
	}
}
