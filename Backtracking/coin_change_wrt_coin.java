package backtracking;

public class coin_change_wrt_coin {

	public static void main(String[] args) {
		coin_change_coin(new int[] {1,2,3},4,0,"");

	}
	public static void coin_change_coin(int[] denoms,int target,int vidx,String ans) {
		if(target==0) {
			System.out.println(ans);
			return;
		}
		if(target<0 || vidx==denoms.length) {
			return;
		}
		//yes
		coin_change_coin(denoms,target-denoms[vidx],vidx,ans+denoms[vidx]);
		//no
		coin_change_coin(denoms,target,vidx+1,ans);
}
}
