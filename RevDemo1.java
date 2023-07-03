package hellopack;

import java.util.Scanner;

public class RevDemo1 {
public static void main(String[] args) {
	//uneven multidimensional array
//	String[][] s= {
//			{"aaa","bbb"},
//			{"aa","cccc","dddd"},
//			{"dddd"}
//	};
	String[][] s=new String[3][];
	s[0]=new String[2];
	s[1]=new String[3];
	s[2]=new String[1];
	
	for(String x[]:s) {
		for(String y:x) {
			System.out.print(y+"\t");
		}
		System.out.println();
	}
}
}

