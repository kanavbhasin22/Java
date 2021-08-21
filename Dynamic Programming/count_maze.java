package dynamic_programming;

public class count_maze {
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
		System.out.println(cbm(0,0,3,3));
		System.out.println("Count maze normal took " + endAlgo()+" ms" );
		
		startAlgo();
		int[][]arr=new int[3][3];
		System.out.println(cbmRS(0,0,3,3,arr));
		System.out.println("Count maze recursive took " + endAlgo()+" ms" );
		
		startAlgo();
		System.out.println(cbmIS(3,7));
		System.out.println("Count maze normal took " + endAlgo()+" ms" );
	}
	public static int cbm(int cr, int cc ,int tr, int tc) {
		if(cr==tr && cc==tc) {
			return 1;
		}
		if(cr>tr||cc >tc) {
			return 0;
		}
		int count=0;
		count=count+cbm(cc+1,cr,tr,tc);
		count=count+cbm(cc,cr+1,tr,tc);
		count=count+cbm(cc+1,cr+1,tr,tc);
		return count;
	}
	public static int cbmRS (int cr, int cc, int tr ,int tc ,int[][] store) {
		if(cr==tr && cc==tc) {
			return 1;
		}
		if(cr>tr||cc >tc) {
			return 0;
		}
		if(store[cr][cc]!=0) {
			return store[cr][cc];
		}
		int count=0;
		count=count+cbm(cc+1,cr,tr,tc);
		count=count+cbm(cc,cr+1,tr,tc);
		count=count+cbm(cc+1,cr+1,tr,tc);
		store[cr][cc]=count;
		return count;
	}
	public static int cbmIS(int tr, int tc) {
		int[][] store=new int[tr+2][tc+2];
		for(int i=tr;i>=0;i--) {
			for(int j=tc;j>=0;j--) {
				if(i==tr && j==tc) {
					store[i][j]=1;
				}
				else {
					store[i][j]=store[i+1][j]+store[i][j+1];//+store[i+1][j+1];
				}
			}
		}
		return store[0][0];
	}
}
