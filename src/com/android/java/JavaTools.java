package com.android.java;

import java.util.Arrays;

public class JavaTools {

	/**
	 * 'java�Դ�������  Arrays
	 */
	public static void main(String[] args) {
		int[] a={1,2,5,3,8,4,9,7,6};
		
		Arrays.sort(a);
		for (int i : a) {  System.out.print(i+" ");  }  //��С����
		
		
		int key=3;
		int s=Arrays.binarySearch(a, key);    //����֮ǰ��Ҫ������
		System.out.print("\n ����λ��(��0��ʼ)��"+s+"\n");
		
		//���
		int[] b=new int[10];
		Arrays.fill(b, 100);
		for (int i : b) {
			System.out.print(i+" ");
		}
		
		

	}

}
