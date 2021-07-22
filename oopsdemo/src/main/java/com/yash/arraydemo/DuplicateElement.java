package com.yash.arraydemo;

import java.util.Scanner;

public class DuplicateElement {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[]= new int[n];
	
	for(int p=0; p<n; p++) {
		a[p] = sc.nextInt();
	}
	for(int i=0; i<n; i++) {
		for(int j=i+1; j<n; j++) {
			if(a[i]==a[j]) {
				System.out.println(a[j]);
			}
		}
	}

}
}
