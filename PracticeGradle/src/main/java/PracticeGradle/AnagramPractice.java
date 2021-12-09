package PracticeGradle;

import java.util.Arrays;

public class AnagramPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s1 = {'g','o','d'};
		char[] s2 = {'d', 'o', 'g'};
		if(isAnagramSort(s1, s2))
			System.out.println("Two string are "+ " anagram of each other");
		
		else
			System.out.println("Two string are No" + " anagram of each other");

	}
	static boolean isAnagramSort(char[] s1, char[] s2) {
		int a1 = s1.length;
		int a2 = s2.length;
		if (a1 != a2)
			return false;
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for (int i=0; i<a1; i++)
			if(s1[i] !=s2[i])
				return false;
		return true;
	}

}
