package com.dest.basics.javaprogram;

public class MutableString {

	public static void main(String[] args) {
		String s1 = new String("sai");
		String s2 = new String("sowmya");
		s1.concat(s2);
		s1 = s1.concat(s2);
		System.out.println(s1);
	
		
		
		StringBuffer sb1 = new StringBuffer("sai");
		StringBuffer sb2 = new StringBuffer("ramya");
		sb1.append(sb2);
		System.out.println(sb1);
		
		
		StringBuilder sbl1 = new StringBuilder("sai");
		StringBuilder sbl2 = new StringBuilder("Sowmya");
		sbl1.append(sbl2);
		System.out.println(sbl1);
	}

}
