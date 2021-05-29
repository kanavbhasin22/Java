package stacks;
import java.util.*;
public class dijakatra_algo {
	private Stack<String> operations=new Stack<>();
	private Stack<Double> values=new Stack<>();
	
	public void interpret(String str) {
		String[] expression= str.split(" ");
		for(String s:expression) {
			if (s.equals("(")) {
			}
			else if(s.equals("+")){
				operations.push(s);
			}
			else if(s.equals("*")) {
				operations.push(s);
			}
			else if(s.equals(")")) {
				String op= this.operations.pop();
				if(op.equals("+")) {
					this.values.push(this.values.pop()+ this.values.pop());
				}
				else if (op.equals("*")) {
					this.values.push(this.values.pop()*this.values.pop());
				}
			}
			else {
				this.values.push((Double.parseDouble(s)));
			}
		}
	}
	
	public void result () {
		System.out.print(this.values.pop());
	}
}
