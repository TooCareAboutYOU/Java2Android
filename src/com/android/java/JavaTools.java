package com.android.java;

import java.util.Arrays;

public class JavaTools {

	/**
	 * 'java自带工具类  Arrays
	 */
	public static void main(String[] args) {
		int[] a={1,2,5,3,8,4,9,7,6};
		
		Arrays.sort(a);
		for (int i : a) {  System.out.print(i+" ");  }  //从小到大
		
		
		int key=3;
		int s=Arrays.binarySearch(a, key);    //查找之前需要先排序
		System.out.print("\n 索引位置(从0开始)："+s+"\n");
		
		//填充
		int[] b=new int[10];
		Arrays.fill(b, 100);
		for (int i : b) {
			System.out.print(i+" ");
		}
		
		

	}

}
