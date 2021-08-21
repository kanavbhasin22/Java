package dynamic_programming;

public class lcsdp {
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
		System.out.println(lcsI("qwertyuiopasdfghjklzxcvbnm","qwertyuiopasdfghjklmnbcxz"));
		System.out.println("Longest common subs recursive took "+endAlgo()+" ms ");

	}
	public static int lcsI(String s1, String s2) {
		int[][] store=new int[s1.length()+1][s2.length()+1];
		//seed
		store[s1.length()][s2.length()]=0;
		for(int i= s1.length();i>=0;i--) {
			for(int j=s2.length();j>=0;j--) {
				if(i==s1.length() || j==s2.length()) {
					store[i][j]=0;
					continue;
				}
				if(s1.charAt(i)==s2.charAt(j)){
					store[i][j]=1+store[i+1][j+1];
				}
				else {
					store[i][j]=Math.max(store[i+1][j], store[i][j+1]);
				}
			}
		}
		return store[0][0];
	}
}
