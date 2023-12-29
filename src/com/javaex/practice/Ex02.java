package com.javaex.practice;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		double[] drr = new double[] {1.2, 3.3, 6.7};

		for(int i = 0; i < (drr.length/2); i++) {
		    int tmp = drr[i];
		    drr[i] = drr[drr.length-1-i];
		 //처음과 마지막 요소 교환
		    //arr.length-1을 해야 arr의 마지막 요소에 접근한다.
		    drr[drr.length-i-1] = tmp;
		}
			
		    System.out.println(); //확인
		}
	}


