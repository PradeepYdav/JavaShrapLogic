package com.pradeep.hackerrank;

import java.util.Scanner;

public class Conject_It {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int tc = sc.nextInt();
		int tc = 1;

		while (tc > 0) {

			//int val = sc.nextInt();
			int val = 21;


			boolean flag = false;
			while (true) {
				if (val % 2 == 0) {
					val = val / 2;
				} else {
					val = 3 * val + 1;
				}

				if (val == 1) {
					flag = true;
					break;
				}

				if (val < 0) {
					break;
				}

			}
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			tc--;
		}

	}

}
