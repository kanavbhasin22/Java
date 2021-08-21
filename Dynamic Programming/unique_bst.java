package dynamic_programming;

public class unique_bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(noBSTRec(8));
		System.out.println(noBSTtd(8,new int[9]));
		System.out.println(noBSTbu(8));

	}
	public static int noBSTRec(int n) {
		if(n<=1) {
			return 1;
		}
		int total=0;
		 for(int i=1;i<=n;i++) {
			 int lbst=noBSTRec(i-1);
			 int rbst=noBSTRec(n-i);
			 
			 int midbst=lbst*rbst;
			 total+=midbst;
		 }
		 return total;
	}
	public static int noBSTtd(int n,int[] store) {
		if(n<=1) {
			return 1;
		}
		if(store[n]!=0) {
			return  store[n];
		}
		int total=0;
		 for(int i=1;i<=n;i++) {
			 int lbst=noBSTtd(i-1,store);
			 int rbst=noBSTtd(n-i,store);
			 
			 int midbst=lbst*rbst;
			 total+=midbst;
		 }
		 store[n]=total;
		 return total;
	}
	public static int noBSTbu(int tn) {
		int[] store=new int[tn+1];
		store[0]=store[1]=1;
		for(int n=2;n<store.length;n++) {
			int total=0;
			 for(int i=1;i<=n;i++) {
				 int lbst=store[i-1];
				 int rbst=store[n-i];
				 
				 int midbst=lbst*rbst;
				 total+=midbst;
			 }
			 store[n]=total;
		}
		return store[tn];
	}
	}
