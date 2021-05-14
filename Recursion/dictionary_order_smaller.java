package practice;
import java.util.*;
public class dictionary_order_smaller {
	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
			String str=sc.next();
			ArrayList<String> ans=smaller(str);
			smaller_order(ans,str);
		}
		public static ArrayList<String> smaller(String str){
			if(str.length()==0){
				ArrayList<String> bs=new ArrayList<>();
				bs.add("");
				return bs;
			}
			char ch=str.charAt(0);
			String rest=str.substring(1);

			ArrayList<String> rec=smaller(rest);
			ArrayList<String> result=new ArrayList<>();
			
			for(String rr:rec){
				for(int i=0;i<=rr.length();i++){
					String ans=rr.substring(0,i)+ch+rr.substring(i);
					result.add(ans);
				}
			}
			return result;
		}
		public static void smaller_order(ArrayList<String> array, String str){
			String[] arr= new String[array.size()];
			for(int i=0;i<array.size();i++){
				arr[i]=array.get(i);
			}
			Arrays.sort(arr);
			int count=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i].equals(str)){
					count=i;
				}
			}
			for(int i=0;i<count;i++){
				System.out.println(arr[i]);
			}
		}
	}
