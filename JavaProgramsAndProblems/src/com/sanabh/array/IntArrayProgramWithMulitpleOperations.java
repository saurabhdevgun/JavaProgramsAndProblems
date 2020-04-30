package com.sanabh.array;

public class IntArrayProgramWithMulitpleOperations {

	private int arr[];
	private int sum = 0;
	private int max = Integer.MIN_VALUE;
	private int min = Integer.MAX_VALUE;
	private double avg = 0;
	private boolean isCommonLoop = false;
	public IntArrayProgramWithMulitpleOperations(int[] arr) {
		 this.arr = arr; 
	}
	

	public void runCommonLoop() {
		for (Integer value : arr) {
			sum = sum + value;
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		avg = (double) sum/arr.length;
		isCommonLoop = true;
	}
	
	public int findSum() {
		if(!isCommonLoop) {
			runCommonLoop();
		}
		return sum;
	}
	
	public int findMax() {
		if(!isCommonLoop) {
			runCommonLoop();
		}
		return max;
	}
	
	public int findMin() {
		if(!isCommonLoop) {
			runCommonLoop();
		}
		return min;
	}
	
	public double findAverage() {
		if(!isCommonLoop) {
			runCommonLoop();
		}
		return avg;
	}
	
	public boolean isValuePresent(int item) {
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] == item) {
				return true;
			}
		}
		return false;
	}
	
	public int findIndex(int item) {
		
		return -1;
	}
	
}
