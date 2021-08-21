package dynamic_programming;

public class rod_cutting {

	public static void main(String[] args) {
		int[] price= {0,1,5,8,9,10,17,17,20};
		System.out.println(cutting_rec(price,price.length-1));
		System.out.println(cutting_td(price,price.length-1,new int[price.length]));
		System.out.println(cutting_bu(price));
	}
	public static int cutting_rec(int[] price,int n) {
		
		int left=1;
		int right=n-1;
		int max=price[n];
		while(left<=right) {
			int fp=cutting_rec(price,left);
			int sp=cutting_rec(price,right);
			int total=fp+sp;
			if(total>max) max=total;
			left++;
			right--;
		}
		return max;
	}
public static int cutting_td(int[] price,int n,int[] store) {
		if(store[n]!=0) {
			return store[n];
		}
		int left=1;
		int right=n-1;
		int max=price[n];
		while(left<=right) {
			int fp=cutting_td(price,left,store);
			int sp=cutting_td(price,right,store);
			int total=fp+sp;
			if(total>max) max=total;
			left++;
			right--;
		}
		store[n]=max;
		return max;
	}
	public static int cutting_bu(int[]price) {
		int[] store=new int[price.length];
		store[0]=price[0];
		store[1]=price[1];
		for(int n=2;n<store.length;n++) {
			int left=1;
			int right=n-1;
			int max=price[n];
			while(left<=right) {
				int fp=store[left];
				int sp=store[right];
				int total=fp+sp;
				if(total>max) max=total;
				left++;
				right--;
			}
			store[n]=max;
		}
		return store[store.length-1];
	}
}
