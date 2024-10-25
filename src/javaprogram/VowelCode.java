package com.dest.basics.javaprogram;

import java.util.Scanner;

class VowelOperations{
	Scanner sc =  new Scanner(System.in);
	void countVowelConsonant(String s) {
		int vowel_count=0;
		int consonant_count=0;
		System.out.println("Calculating the vowel and consonant count:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				vowel_count++;
			}
			consonant_count++;
		}
	System.out.println("The vowel count is= "+ vowel_count);
	System.out.println("The consonant count is = "+ consonant_count);
	System.out.println("==================================");
}
	void lowerCaseVowels(String s) {
		int lower_vowel_count=0;
		System.out.println("Calculating the Lowercase vowel:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				lower_vowel_count++;
			}
		}
	System.out.println("The vowel count is= "+ lower_vowel_count);
	System.out.println("==================================");
	}
	void upperCaseVowels(String s) {
		int upper_vowel_count=0;
		System.out.println("Calculating the uppercase vowel:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				upper_vowel_count++;
			}
		}
	System.out.println("The vowel count is= "+ upper_vowel_count);
	System.out.println("=========================");
	}
	void replacelowerCaseVowels(String s) {
		String str_temp="";
		System.out.println("replace the lowercase vowels with sepcial character:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				str_temp=str_temp+'@';
			}
			else {
				str_temp = str_temp+s.charAt(i);
			}
		}
	System.out.println("The vowel count is= "+ str_temp);
	System.out.println("==========================");
	}
	void replaceupperCaseVowels(String s) {
		String str_temp="";
		System.out.println("replace the uppercase vowels with sepcial character:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				str_temp=str_temp+'@';
			}
			else {
				str_temp = str_temp+s.charAt(i);
			}
		}
	System.out.println("The vowel count is= "+ str_temp);
	System.out.println("=====================");
	}
	void indivitualvowel(String s) {
		String str_temp ="";
		System.out.println("replacing indivitual vowels with an individual special characters:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== 'a' || s.charAt(i)=='A') {
				str_temp = str_temp + '@';
			}
			else if(s.charAt(i)=='e'|| s.charAt(i)=='E') {
				str_temp = str_temp +'$';
			}
			else if(s.charAt(i)=='i'|| s.charAt(i)=='I') {
				str_temp = str_temp +'#';
			}
			else if(s.charAt(i)=='o'|| s.charAt(i)=='O') {
				str_temp = str_temp +'&';
			}
			else if(s.charAt(i)=='u'|| s.charAt(i)=='U') {
				str_temp = str_temp +'*';
			}
		else {
			str_temp = str_temp + s.charAt(i);
		}
	
		}
		System.out.println("The replace string is "+str_temp);
		System.out.println("==================");
	}
		
	}
		

public class VowelCode {

	public static void main(String[] args) {
		VowelOperations vo = new VowelOperations();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		vo.countVowelConsonant(s);
		vo.lowerCaseVowels(s);
		vo.upperCaseVowels(s);
		vo.replacelowerCaseVowels(s);
		vo.replaceupperCaseVowels(s);
		vo.indivitualvowel(s);
	}

}
