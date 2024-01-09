package com.javaex.practice;

import java.util.Scanner;

public class Ex05 { //length 은 배열의 길이(1,2,3 = length 은 3이다 )
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		int num;
		double sum = 0;

		for(int i = 0; i<data.length; i++) {
			num = sc.nextInt();
			data[i] = num;
		}
		for(int i = 0; i<data.length; i++) {
				sum = sum + data[i];
		}	

		System.out.println("평균은 "+ sum/data.length+" 입니다");
		sc.close();

		
	}
}