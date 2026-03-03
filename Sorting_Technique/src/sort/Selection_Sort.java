package sort;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int[] a= {90,45,34,900,1,8};
		System.out.println("Original array");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				int temp=a[minIndex];
				a[minIndex]=a[i];
				a[i]=temp;
				System.out.println("\nAt interation "+(i+1)+":");
				for(int k=0;k<n;k++) {
					System.out.print(a[k]+" ");
				}
			}
		}
		
		System.out.println("\nAt Final Sorted array:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
