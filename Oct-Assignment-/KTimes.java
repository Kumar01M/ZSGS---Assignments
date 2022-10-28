package assignments;

import java.util.Scanner;

public class KTimes {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		KTimes obj = new KTimes();
		System.out.print(obj.firstKTimes());
	}
	
	public int firstKTimes() {
		System.out.print("Length: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Array Elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("K :");
		int k = in.nextInt();
		
		for(int i=0;i<n;i++) {
			int count = 1;
			for(int j=0;j<n;j++) {
				if(i==j)continue;
				else if(arr[i]==arr[j]) {
					count++;
					if(count==k) return arr[i];
				}
			}
		}
		return -1;
	}

}
