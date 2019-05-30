package com.deepak;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("Enter the ssize of an Array");
int n = in.nextInt();

//Declare an Array of size given by user
int[] arr = new int[n];

System.out.println("enter the values in an array");
for(int i =0 ; i<n;i++){
	
	arr[i] = in.nextInt();
}
//Binary search is always performed on sorted array
Arrays.sort(arr);

System.out.println("enter the value to be searched");
int num = in.nextInt();

int low = 0;
int high = arr.length - 1;
int mid = 0;

while(low <= high){
	mid = (low+high)/2;
	if(arr[mid] == num){
		System.out.println("Value is found at index"+mid);
		break;
		
	}
	else if(arr[mid] > num){
		high = mid - 1;
		
	}else if(arr[mid] < num){
		low = mid + 1;
	}
	
}

if(low>high){
	System.out.println("value not found");
	in.close();
}
		
	}

}
