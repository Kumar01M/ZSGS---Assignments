package assignments;

import java.util.Scanner;

public class SubArraySum {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		SubArraySum obj = new SubArraySum();
		System.out.println(obj.longestSumZero());

	}
	
	public int longestSumZero() {
		System.out.print("n :");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("array elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i=n;i>=0;i--) {
			int sum = 0;
			for(int j=0;j<i;j++) {
				sum += arr[j];
			}
			if(sum==0)return i;
			int k = 0;
			while(k!=n-i) {
				sum = sum - arr[k] + arr[k+i];
				if(sum==0) return i;
				k++;
			}
		}
		return -1;
	}

}
