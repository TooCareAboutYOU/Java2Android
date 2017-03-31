package com.android.java;

public class SortOrRank {

	/*
	 * 数组排序
	 * 
	 * */
	public static void main(String[] args) {
		//MaoPao();
		SortOrRank array=new SortOrRank();
		array.Select();
		array.MaoPao();
		array.Insert();
		array.fast();
		array.search(2);
      }
	
	/*冒泡排序法*/
	private void MaoPao(){
		int score[] = {67, 69, 75, 87, 89, 90, 99, 100};
		for (int i = 0; i < score.length -1; i++){    //最多做n-1趟排序
				for(int j = 0 ;j < score.length - i - 1; j++){    //对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
					if(score[j] < score[j + 1]){    //把小的值交换到后面
						int temp = score[j];
				        score[j] = score[j + 1];
				        score[j + 1] = temp;
			         }
		         }            
		         System.out.print("第" + (i + 1) + "次排序结果：");
				for(int a = 0; a < score.length; a++){  System.out.print(score[a] + "\t");  }
		         System.out.println("");
		}
        System.out.print("最终排序结果：");
		//for(int a = 0; a < score.length; a++){  System.out.print(score[a] + "\t");  }
		for (int i : score) {
			System.out.print(i + "\t");
		}
		System.out.println("");
	}

	/*选择排序法*/
	private void Select(){
		int a[]={1,5,3,7,2,10,55,9};
		int n=a.length;
		for (int k = 0; k < n-1; k++) {
			int min=k;
			for (int i = k+1;i < n; i++) {
				if (a[i] < a[min]) {
					min=i;
				}
			}
			
			if (k != min) {
				int temp=a[k];
				a[k]=a[min];
				a[min]=temp;
			}
		}
	
		for (int  x : a) {
			System.out.print(x+" ");
		}
		
		MinAndMax();
	}
	//数组里 最大值 最小值
	private void MinAndMax(){   
		int a[]={1,5,3,7,2,10,55,9};
		int min,max;
		min=a[0];
		max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}else if (a[i] > max)   {
				max=a[i];
			} 
		}
		System.out.println("\n 最小值min="+min);
		System.out.println("最大值max="+max);
	}
	
	/*插入排序*/
	private void Insert(){
		int a[]={4,6,8,10,2};
		int len=a.length;
		int temp,j;
		for (int i = 1; i < a.length; i++) {
			temp=a[i];
			for ( j = i; j >0 && temp< a[j-1]; j--) {
				a[j]=a[j-1];   //集体后移
			}
			a[j]=temp;
		}
		
		for (int i : a) {
			System.out.print(i+"  ");
		}
		
		System.out.println("");
	}

	/*快速排序*/
	private void fast(){
		int a[] = {2,4,6,1,8,5};
		quick(a,0,(a.length-1));
		for (int i : a) {
			System.out.print(i+" --");
		}
		System.out.println("\n"+f(5));
	}
	static void quick(int[] a,int start,int end){
		if (start < end) {
			int base =a[start];
			int temp ;
			int i=start,j=end;
			do {
				while ((a[i] < base) && (i<end)) {
					i++;
				}
				
				while ((a[j] > base) && (j>start)) {
					j--;
				}
				if (i <= j) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					j--;
				}
			} while (i<=j);
			
			if (start < j) {
				quick(a,start,j);
			}
			
			if (end > i) {
				quick(a,i,end);
			}
			
		}
	}
	/*自己调用自己*/
	static int f(int x){
		if (x == 1) {
			return 1;
		}else {
			return x*f(x-1);   
		}
	}
	
	
	/*直接查找*/
	private void search(int key) {
		int[] a={2,3,4,5,6,7,8};
		int index=searchmo(a, key);
		if(index ==-1){
			System.out.println("未找到");
		}else {
			System.out.println("找到当前值是："+a[index]+"\t索引是："+index);
		}
	}
	static int searchmo(int[] a , int key){
		int index=-1;
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				index=i;
				break;
			}
		}
		return index;
	}

	/*二分法*/
	private void name() {
		
	}
	
	

}
