package project;

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static Person unemployed = new Unemployed("Vasya", 19, true, 0, false);
	public static Person developer = new JavaDeveloper("James", 25, true, 20, 50000);

	public static void main(String[] args) {


		boolean isRun = true;

		while (isRun) {
			System.out.println("**********************************************************************");
			System.out.println("This is a test project, which allows you to manage two human beings");
			System.out.println("Use instructions below");
			System.out.println();
			System.out.println("Enter 1 to manage unemployed human");
			System.out.println("Enter 2 to manage java developer");
			System.out.println("Enter 0 to exit");
			switch (sc.next()) {
			case "1": {
				manageUnemployed();
				break;
			}
			case "2": {
				manageJavaDeveloper();
				break;
			}
			default: isRun = false;
			}
		}
	}

	private static void manageUnemployed() {
		System.out.println("Enter 1 to work");
		System.out.println("Enter 2 to eat");
		System.out.println("Enter 3 to sleep");
		System.out.println("Enter 4 to see info about this person");
		System.out.println("Enter 0 to exit");
		switch (sc.next()) {
		case "1": {
			unemployed.work();
			break;
		}
		case "2": {
			unemployed.eat();
			break;
		}
		case "3": {
			unemployed.sleep();
			break;
		}
		case "4": {
			System.out.println(unemployed.toString());
			break;
		}
		default: break;
		}
	}

	private static void manageJavaDeveloper() {
		System.out.println("Enter 1 to work");
		System.out.println("Enter 2 to eat");
		System.out.println("Enter 3 to sleep");
		System.out.println("Enter 4 to see info about this person");
		System.out.println("Enter 0 to exit");
		switch (sc.next()) {
		case "1": {
			developer.work();
			break;
		}
		case "2": {
			developer.eat();
			break;
		}
		case "3": {
			developer.sleep();
			break;
		}
		case "4": {
			System.out.println(developer.toString());
			break;
		}
		default: break;
		}
	}
}
