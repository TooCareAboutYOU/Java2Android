package com.android.java;

public class TernaryOperator {

	/**
	 * ��Ԫ����
	 * @param args
	 */
	static int max, a=20, b=30, c=100;
	public static void main(String[] args) {
		
		if(a>b){    //��������
			max=a;
		}else{
			max=b;
		}

		System.out.println("max="+max);
		test1();
		test2();
	}

	private static void test1(){  //�����Ƚ�
		max= a > b ? a  : b;
		System.out.println("��Ԫ���㣺max="+max);
	}
	
	private static void test2(){  //�����Ƚ�
		max = a > b ? (c > a ? c : a):(c > b? c : b);
		
		System.out.println("��Ԫ���㣺max="+max);
		
	}
	
	
	
}
