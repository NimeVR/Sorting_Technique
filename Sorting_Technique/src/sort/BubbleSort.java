package sort;

public class BubbleSort {
	public static void swap(int[] arr,int large,int small) {
		int temp=arr[large];
		arr[large]=arr[small];
		arr[small]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,46,24,52,20,9};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
			
			for(int k=0;k<n;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("Finally after sorting:");
		for(int k=0;k<n;k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
