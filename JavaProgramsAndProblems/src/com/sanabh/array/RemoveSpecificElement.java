package com.sanabh.array;

//Question - Remove a specific element from the array 
// and update the array.

//Question = Removed a specific element by providing index
// and update the element


//
public class RemoveSpecificElement {

	int sampleArr[] = {50,11,23,45,67,12,88,34};
	
	public boolean deleteSpecificElement(int value) {
		int tempArr[] = new int[sampleArr.length];
		int counter =0;
		boolean isRemoved = false;
		for(int i= 0; i < sampleArr.length; i++) {
			if (sampleArr[i] == value) {
				isRemoved = true;
			}else {
				tempArr[counter++] = sampleArr[i];
			}
			
		}
		sampleArr = tempArr;
		return isRemoved;
	}
	
	public boolean deleteElementWithIndex( int index) {
		if(index < 0 && index >= sampleArr.length) {
			return false;
		}
		
		boolean isRemoved = false;
		int tempArr[] = new int[sampleArr.length];
		int counter = 0;
		for(int i =0; i< sampleArr.length; i++) {
			if (i == index) {
				isRemoved = true;
			}else {
				tempArr[counter++] = sampleArr[i];
			}
			
		}
		sampleArr = tempArr;
		return isRemoved;
		
	}
	
	public void printArr() {
		for(int i =0; i < sampleArr.length; i++) {
			System.out.println("Element at index " + i + " is " + sampleArr[i]);
		}
		System.out.println("===============================");
	}
	
	public static void main(String[] args) {
		RemoveSpecificElement rem = new RemoveSpecificElement();
		rem.printArr();
		rem.deleteElementWithIndex(2);
		rem.printArr();
		rem.deleteSpecificElement(12);
		rem.printArr();
		rem.deleteSpecificElement(123);
		rem.printArr();
		rem.deleteElementWithIndex(9);
		rem.printArr();
		
		
	}
	
}
