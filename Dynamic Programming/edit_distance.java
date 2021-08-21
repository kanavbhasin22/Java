package dynamic_programming;

public class edit_distance {
	public static long start;
	public static long end;
	public static void startAlgo() {
		start=System.currentTimeMillis();
	}
	public static long endAlgo() {
		end=System.currentTimeMillis();
		return end-start;
	}
	public static void main(String[] args) {
		startAlgo();
		System.out.println(ed("agbg","acgb"));
		System.out.println("ed recursive took "+ endAlgo()+" ms");

		startAlgo();
		System.out.println(eddp("agbg","acgb"));
		System.out.println("ed dp took "+ endAlgo()+" ms");

	}
	public static int ed(String s1,String s2) {
		if(s1.length()==0) {
			return s2.length();
		}
		if(s2.length()==0) {
			return s1.length();
		}
		String ros1=s1.substring(1);
		String ros2=s2.substring(1);
		int ans=0;
		if(s1.charAt(0)==s2.charAt(0)) {
			ans=ed(ros1,ros2);
		}
		else {
			int f1=1+ed(ros1,ros2); //replace
			int f2=1+ed(ros1,s2);	//add
			int f3=1+ed(s1,ros2);	//remove
			ans=Math.min(f1, Math.min(f2,f3));
		}
		return ans;
	}
	public static int eddp(String s1, String s2) {
		int[][] store= new int[s1.length()+1][s2.length()+1];
		store[s1.length()][s2.length()]=0;
		for(int i=s1.length();i>=0;i--) {
			for(int j=s2.length();j>=0;j--) {
				if(i==s1.length()) {
					store[i][j]=s2.length()-j;
					continue;
				}
				if(j==s2.length()) {
					store[i][j]=s1.length()-i;
					continue;
				}
				if(s1.charAt(i)==s2.charAt(j)) {
					store[i][j]=store[i+1][j+1];
				}
				else {
					store[i][j]=1+Math.min(store[i+1][j+1],Math.min(store[i][j+1], store[i+1][j]));
				}
			}
		}
		return store[0][0];
	}

}
