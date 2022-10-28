package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubstringAnagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SubstringAnagrams obj = new SubstringAnagrams();
		String s = in.nextLine();
		System.out.println(obj.anagramPairs(s));
		in.close();
	}
	
	public int anagramPairs(String s) {
		int count = 0;
		List<String> subs = getSubStrings(s);
		for(int i=0;i<subs.size();i++) {
			for(int j=0;j<subs.size();j++) {
				if(i==j) continue;
				else {
					if(isAnagrams(subs.get(i), subs.get(j))) {
						count++;
					}
				}
			}
		}
		return count/2;
	}
	
	public List<String> getSubStrings(String s){
		List<String> subs = new ArrayList<>();
		for(int i=1;i<=s.length();i++) {
			for(int j=0;j<=s.length()-i;j++) {
				subs.add(s.substring(j, j+i));
			}
		}
		return subs;
	}
	
	public boolean isAnagrams(String s1, String s2) {
		int[] arr = new int[255];
		if(s1.length()!=s2.length())return false;
		else {
			for(int i=0;i<s1.length();i++) {
				arr[s1.charAt(i)]++;
				arr[s2.charAt(i)]--;
			}
			for(int i=65;i<=122;i++) {
				if(arr[i]==0)continue;
				else return false;
			}
			return true;
		}
	}
}
