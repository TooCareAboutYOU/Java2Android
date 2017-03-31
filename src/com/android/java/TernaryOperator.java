package com.android.java;

public class TernaryOperator {

	/**
	 * 三元运算
	 * @param args
	 */
	static int max, a=20, b=30, c=100;
	public static void main(String[] args) {
		
		if(a>b){    //常规运算
			max=a;
		}else{
			max=b;
		}

		System.out.println("max="+max);
		test1();
		test2();
	}

	private static void test1(){  //两个比较
		max= a > b ? a  : b;
		System.out.println("三元运算：max="+max);
	}
	
	private static void test2(){  //三个比较
		max = a > b ? (c > a ? c : a):(c > b? c : b);
		
		System.out.println("三元运算：max="+max);
		
	}
	
	
	
}
