package com.android.java;

public class TwoDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] b=new int[3][3];
	
		int[][] c={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(c[2][2]);
		
		//±éÀú
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = i * j ;
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
