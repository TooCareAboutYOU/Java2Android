package com.android.java;

import java.io.Serializable;

public class LogicalOperations {


	/**
	 * Âß¼­ÔËËã
	 * @param args
	 */
	public static void main(String[] args) {
		People p=new People(180, 75, 1000000);
		System.out.println(p.toString());

	}

	
	private static class People implements Serializable{
		private static final long serialVersionUID = 1L;
		private int Height;
		private  int Weight;
		private  int Money;
		
		public People(int height,int weight,int money){
			this.Height=height;
			this.Weight=weight;
			this.Money=money;
		}

		public String toString() {
			String str="People [Height=" + Height + ", Weight=" + Weight + ", Money=" + Money + "]";
			return str ;
		}

		public int getHeight() { return Height; }

		public void setHeight(int height) { Height = height; }

		public int getWeight() { return Weight; }

		public void setWeight(int weight) { Weight = weight; }

		public int getMoney() { return Money; }

		public void setMoney(int money) { Money = money; }
	}
	
}
