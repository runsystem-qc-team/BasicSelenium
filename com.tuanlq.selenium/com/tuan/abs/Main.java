package com.tuan.abs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	protected int getInputIntegerExceptionExcercise(Scanner sc) {
		boolean check = true;
		int n = 0;
		do {
			try {
				n = sc.nextInt();
				if ((n >= 1) && (n <= 3)) {
					check = false;
				} else {
					System.out.println("PLEASE INPUT NUMBER 1 -> 3");
					check = true;
				}
			} catch (Exception e) {
				System.out.println("PLEASE INPUT INTEGER NUMBER 1 -> 3");
				sc.nextLine();
			}

		} while (check);

		return n;
	}

	protected int getInputIntegerExceptionContinue(Scanner sc) {
		boolean check = true;
		int n = 0;
		do {
			try {
				n = sc.nextInt();
				if ((n == 1) || (n == 0)) {
					check = false;
				} else {
					System.out.println("PLEASE INPUT [1] --- [0] : 1 / 0");
					check = true;
				}
			} catch (Exception e) {
				System.out.println("PLEASE NOT INPUT STRING WITHOUT 1 / 0 ");
				sc.nextLine();
			}

		} while (check);

		return n;
	}

	protected String getInputChar(Scanner sc) {
		boolean check = true;
		String n = "";
		do {
			try {
				n = sc.next();
				if (n.length() == 1 && (n.equals("Y") || n.equals("y") || n.equals("n") || n.equals("N"))) {
					check = false;
				} else if (n.length() > 1) {
					System.out.println("VUI LONG NHAP MOT KY TU Y HOAC N");
					check = true;
				} else {
					System.out.println("VUI LONG NHAP DUNG KY TU Y HOAC N");
					check = true;
				}
			} catch (Exception e) {
				System.out.println("VUI LONG NHAP KY TU Y HOAC N");
				sc.nextLine();
			}

		} while (check);

		return n;
	}
}
