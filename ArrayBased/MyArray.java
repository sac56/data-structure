package com.sac.o4th2022;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
	static Scanner sc=new Scanner(System.in);

	public static void display(int[] arr) {
		System.out.println("display all elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		Arrays.sort(arr);
	}

	public static int value(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				count++;
			}
		}
		return count;
			}
	public static void displayParticularElement(int[] arr,int size) {
		System.out.println("display the elements at the size "+size);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int interSorting(int[] arr,int index,int value,int count) {
		
		System.out.println("The insertion in particular index ");
		if(count>=arr.length) {
			return -1;
		}
		for(int i=count-1;i>=index;i--) {
			arr[i+1]=arr[i];
		}
		arr[index]=value;
		return 1;
		
	}
	
	public static void deleteElement(int[] arr,int index) {
		for(int i=index;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
	}
	
	public static int linearSearcg(int[] arr,int value) {
		System.out.println("Linear search");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] arr,int value) {
		Arrays.sort(arr);
		int low, mid, high;
		    low = 0;
		    high = arr.length-1;
		    // Keep searching until low <= high
		    while(low<=high){
		        mid = (low + high)/2;
		        if(arr[mid] == value){
		            return mid;
		        }
		        if(arr[mid]<value){
		            low = mid+1;
		        }
		        else{
		            high = mid -1;
		        }
		    } 
		    return -1;
	}

public static void main(String[] args) {
	
	int[] a=new int[10];
	a[0]=1;
			a[1]=2;
			a[2]=3;
			a[3]=4;
	
			int size=MyArray.value(a);
			System.out.println(a);
	display(a);
	
	 displayParticularElement(a, 4);
	System.out.println(interSorting(a, 2, 4,size));
	display(a);
	deleteElement(a, 2);
	display(a);
	System.out.println(linearSearcg(a, 4));
	System.out.println(binarySearch(a, 3));
	

}
}
