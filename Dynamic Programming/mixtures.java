package dynamic_programming;
import java.util.*;
public class mixtures {

	public static void main(String[] args) {
		int[] arr= {40,60,20,50};
		System.out.println(mixR(arr,0,arr.length-1));
		int[][] store=new int[arr.length][arr.length];
		for(int i=0;i<store.length;i++) {
			Arrays.fill(store[i],-1);
		}
		System.out.println(mixTD(arr,0,arr.length-1,store));
		System.out.println(mixBU(arr));

	}
	public static int mixR(int[] colors,int si,int ei) {
		if(si==ei) {
			return 0;
		}
		int smoke=Integer.MAX_VALUE;
		for(int k=si;k<ei;k++) {
			int fs=mixR(colors,si,k);
			int ss=mixR(colors,k+1,ei);
			int sw=color(colors,si,k)*color(colors,k+1,ei);
			int ans=fs+ss+sw;
			if(ans<smoke) smoke=ans;
		}
		return smoke;
	}
	public static int color(int[] arr,int i, int j) {
		int sum=0;
		for(int k=i;k<=j;k++) {
			sum+=arr[k];
		}
		return sum%100;
	}
	public static int mixTD(int[] colors,int si,int ei,int[][] store) {
		if(si==ei) {
			return 0;
		}
		if(store[si][ei]!=-1) {
			return store[si][ei];
		}
		int smoke=Integer.MAX_VALUE;
		for(int k=si;k<ei;k++) {
			int fs=mixTD(colors,si,k,store);
			int ss=mixTD(colors,k+1,ei,store);
			int sw=color(colors,si,k)*color(colors,k+1,ei);
			int ans=fs+ss+sw;
			if(ans<smoke) smoke=ans;
		}
		store[si][ei]=smoke;
		return smoke;
	}
	public static int mixBU(int[] color) {
		int n=color.length;
		int[][] store=new int[n][n];
		for(int slide=0;slide<n;slide++) {
			for(int si=0;si<n-slide;si++) {
				int ei=si+slide;
				if(si==ei) {
					store[si][ei]=0;
				}
				else {
				int smoke=Integer.MAX_VALUE;
				for(int k=si;k<ei;k++) {
					int fs=store[si][k];
					int ss=store[k+1][ei];
					int sw=color(color,si,k)*color(color,k+1,ei);
					int ans=fs+ss+sw;
					if(ans<smoke) smoke=ans;
				}
				store[si][ei]=smoke;
			}
			}
		}
		return store[0][n-1];
	}
}
