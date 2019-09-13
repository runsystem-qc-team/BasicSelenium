package com.tuan.main;

import java.util.Scanner;

import com.tuan.abs.Main;
import com.tuan.abs.SeleniumAction;
import com.tuan.exercise.ExSelenium;
import com.tuan.page.PageUI;

public class ExerciseMain extends Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int n = 1;
		int k = 0;
		String i;
		int ex = 0;
		Scanner sc = new Scanner(System.in);
		ExerciseMain mainSelenium = new ExerciseMain();
		ExSelenium exSelenium = new ExSelenium("LUONG", "TUAN");

		do {
			System.out.print("INPUT NUMBER EXERCISE: ");
			ex = mainSelenium.getInputIntegerExceptionExcercise(sc);
			sc.nextLine();
			switch (ex) {
			case 1: {
				exSelenium.Exercise_01(sc);
				break;
			}
			case 2: {
				exSelenium.Exercise_02(sc);
				break;
			}
			case 3: {
				exSelenium.Exercise_03(sc);
				break;
			}

			}

			System.out.println("INPUT [ 1 ] CONTINUE ---- [ 0 ] END : 1 / 0");

			n = mainSelenium.getInputIntegerExceptionContinue(sc);
			if (n == 0) {
				System.out.println("ARE YOU SURE QUIT? : Y / N");
				i = mainSelenium.getInputChar(sc);
				if (i.equals("y") || i.equals("Y")) {
					break;
				} else {
					n = 1;
					continue;
				}
			}

		} while (n == 1);

		System.out.println("SEE YOU AGAIN!!! :D");
	}
}
