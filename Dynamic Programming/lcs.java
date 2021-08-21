package dynamic_programming;

public class lcs {
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
		System.out.println(longest_common_subs("abbg","cabg"));
		System.out.println("Longest common subs recursive took "+endAlgo()+" ms ");

	}
	public static int longest_common_subs(String str1, String str2) {
		if(str1.length()==0 || str2.length()==0) {
			return 0;
		}
		int count=0;
		String ros1=str1.substring(1);
		String ros2=str2.substring(1);
		
		if(str1.charAt(0)==str2.charAt(0)) {
			count=1+longest_common_subs(ros1,ros2);
		}
		else {
			int f1=longest_common_subs(ros1,str2);
			int f2=longest_common_subs(str1,ros2);
			count=Math.max(f1, f2);
		}
		return count;
				
	}

}
