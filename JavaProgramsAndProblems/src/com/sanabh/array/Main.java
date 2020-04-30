package com.sanabh.array;

import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	
	public static IntArrayProgramWithMulitpleOperations program = null;
	
	public static void main(String[] args) {
		
		System.out.println("Hi, Please enter the length of the array you wanna build");
		int value = scan.nextInt();
		System.out.println("Please enter the array values");
		int arr[] = new int[value];
		for(int i =0; i< arr.length; i++) {
			arr[i] = scan.nextInt();
			scan.nextLine();
		}
	   program = new IntArrayProgramWithMulitpleOperations(arr);
		
		runMainLogic();
		
	}

	private static void optionsForUser() {
		System.out.println("Press 1 to find Max value of an array\n"
				+ "Press 2 to find Min value of an array\n"
				+ "Press 3 to find sum of the array\n"
				+ "Press 4 to find avg of the array\n"
				+ "Press 5 to find the index of the given value\n"
				+ "Press 6 to find the value is present in the array\n"
				+ "Press 7 to repeat the options\n"
				+ "Press 0 to quit\n");
		
	}
	
	private static void runMainLogic() {
		
		boolean exit = false;
		
		optionsForUser();
		while(!exit) {
			int action = scan.nextInt();
			scan.nextLine();
			
			switch(action) {
			case 0:
				exit = true;
				break;
				
			case 1:
				System.out.println("Max number in the given array is "+ program.findMax());
				break;
				
			case 2:
				System.out.println("Min number in the given array is "+ program.findMin());
				break;
				
			case 3:
				System.out.println("Sum of the array is "+ program.findSum());
				break;
				
			case 4:
				System.out.println("Avg of the array is " + program.findAverage());
				break;
				
			case 5:
				System.out.println("Please the input the number you wanna find index for");
				int value = scan.nextInt();
				scan.nextLine();
				System.out.println("Index of the given program is " + program.findIndex(value));
				break;
				
			case 6:
				System.out.println("Please the input the number you wanna check presence");
				value = scan.nextInt();
				scan.nextLine();
				System.out.println("This number is  presence is " + program.isValuePresent(value));
				break;
				
			case 7:
				optionsForUser();
				break;
				
			default:
				System.out.println("Not a valid input");
				break;
				
			}
		}
	}
	
}
