package assignments;

import java.util.Scanner;

public class Leader {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Leader obj = new Leader();
		obj.getLeaders();

	}
	
	public void getLeaders() {
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			boolean flag = true;
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j])continue;
				else {
					flag = false;
					break;
				}
			}
			if(flag)System.out.print(arr[i]+" ");
		}
		System.out.print(arr[n-1]);
	}

}
