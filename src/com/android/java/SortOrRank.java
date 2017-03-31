package com.android.java;

public class SortOrRank {

	/*
	 * ��������
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
	
	/*ð������*/
	private void MaoPao(){
		int score[] = {67, 69, 75, 87, 89, 90, 99, 100};
		for (int i = 0; i < score.length -1; i++){    //�����n-1������
				for(int j = 0 ;j < score.length - i - 1; j++){    //�Ե�ǰ��������score[0......length-i-1]��������(j�ķ�Χ�ܹؼ��������Χ��������С��)
					if(score[j] < score[j + 1]){    //��С��ֵ����������
						int temp = score[j];
				        score[j] = score[j + 1];
				        score[j + 1] = temp;
			         }
		         }            
		         System.out.print("��" + (i + 1) + "����������");
				for(int a = 0; a < score.length; a++){  System.out.print(score[a] + "\t");  }
		         System.out.println("");
		}
        System.out.print("������������");
		//for(int a = 0; a < score.length; a++){  System.out.print(score[a] + "\t");  }
		for (int i : score) {
			System.out.print(i + "\t");
		}
		System.out.println("");
	}

	/*ѡ������*/
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
	//������ ���ֵ ��Сֵ
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
		System.out.println("\n ��Сֵmin="+min);
		System.out.println("���ֵmax="+max);
	}
	
	/*��������*/
	private void Insert(){
		int a[]={4,6,8,10,2};
		int len=a.length;
		int temp,j;
		for (int i = 1; i < a.length; i++) {
			temp=a[i];
			for ( j = i; j >0 && temp< a[j-1]; j--) {
				a[j]=a[j-1];   //�������
			}
			a[j]=temp;
		}
		
		for (int i : a) {
			System.out.print(i+"  ");
		}
		
		System.out.println("");
	}

	/*��������*/
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
	/*�Լ������Լ�*/
	static int f(int x){
		if (x == 1) {
			return 1;
		}else {
			return x*f(x-1);   
		}
	}
	
	
	/*ֱ�Ӳ���*/
	private void search(int key) {
		int[] a={2,3,4,5,6,7,8};
		int index=searchmo(a, key);
		if(index ==-1){
			System.out.println("δ�ҵ�");
		}else {
			System.out.println("�ҵ���ǰֵ�ǣ�"+a[index]+"\t�����ǣ�"+index);
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

	/*���ַ�*/
	private void name() {
		
	}
	
	

}
