package graphs;
import java.util.*;
public class graph {
	private class vertex{
	HashMap<String,Integer> nbrs=new HashMap<>();
	}
	HashMap<String,vertex> vertices=new HashMap<>();
	
	public int numVertex() {
		return this.vertices.size();
	}
	public void addVertex(String vertex) {
		vertex vtx=new vertex();
		vertices.put(vertex, vtx);
	}
	public void removeVertex(String v) {
		vertex vtx=vertices.get(v);
		ArrayList<String> keys=new ArrayList<>(vtx.nbrs.keySet());
		for(String key:keys) {
			vertex nbrVtx=vertices.get(key);
			nbrVtx.nbrs.remove(v);
		}
		vertices.remove(v);
	}
	public boolean containsVertex(String vertex) {
		return this.vertices.containsKey(vertex);
	}
	public int numEdges() {
		int count=0;
		ArrayList<String> keys=new ArrayList<>(vertices.keySet());
		for(String key:keys) {
			vertex vtx=vertices.get(key);
			count+=vtx.nbrs.size();
		}
		return count/2;
	}
	public boolean containsEdge(String v1,String v2) {
		vertex vtx1=vertices.get(v1);
		vertex vtx2=vertices.get(v2);
		
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(v2) || !vtx2.nbrs.containsKey(v1)) {
			return false;
		}
		return true;
	}
	public void addEdge(String v1,String v2, int cost) {
		vertex vtx1=vertices.get(v1);
		vertex vtx2=vertices.get(v2);
		
		if(vtx1==null || vtx2==null || vtx1.nbrs.containsKey(v2)) {
			return;
		}
		vtx1.nbrs.put(v2, cost);
		vtx2.nbrs.put(v1, cost);
	}
	public void removeEdge(String v1,String v2) {
		vertex vtx1=vertices.get(v1);
		vertex vtx2=vertices.get(v2);
		
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(v2)) {
			return;
		}
		vtx1.nbrs.remove(v2);
		vtx2.nbrs.remove(v1);
	}
	public void display() {
		System.out.println("---------------------");
		ArrayList<String> keys=new ArrayList<>(vertices.keySet());
		for(String key:keys) {
			vertex vtx=vertices.get(key);
			System.out.println(key+" : "+vtx.nbrs);
		}
		System.out.println("-------------------");
	}
	public boolean hasPath(String s1, String s2,HashMap<String,Boolean> process) {
		process.put(s1, true);
		if(containsEdge(s1,s2)) {
			return true;
		}
		vertex vtx=vertices.get(s1);
		
		ArrayList<String> nbrs =new ArrayList<>(vtx.nbrs.keySet());
		for(String str:nbrs) {
			if(!process.containsKey(str) && hasPath(str,s2,process)) {
				return true;
			}
		}
		return false;
		}
	private class Pair{
		String vname;
		String path_so_far;
	}
	public boolean bfs(String src,String dst) {
		HashMap<String, Boolean> processed=new HashMap<>();
		LinkedList<Pair> queue=new LinkedList<>();
		Pair sp=new Pair();
		sp.vname=src;
		sp.path_so_far=src;
		
		//put mew pair in queue
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			// remove pair from queue
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue; 
			}
			//processed put
			processed.put(rp.vname, true);
			
			//check direct edge
			if(containsEdge(rp.vname,dst)) {
				System.out.println(rp.path_so_far + dst );
				return true;
			}
			vertex rpvtx=vertices.get(rp.vname);
			ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				
				// process only unprocessed data
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.path_so_far=rp.path_so_far+nbr;
					queue.addLast(np);
				}
			}
		}
		return false;
	}
	public boolean dfs(String src,String dst) {
		HashMap<String, Boolean> processed=new HashMap<>();
		LinkedList<Pair> stack=new LinkedList<>();
		Pair sp=new Pair();
		sp.vname=src;
		sp.path_so_far=src;
		
		//put mew pair in queue
		
		stack.addFirst(sp);
		
		while(!stack.isEmpty()) {
			// remove pair from queue
			Pair rp=stack.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue; 
			}
			//processed put
			processed.put(rp.vname, true);
			
			//check direct edge
			if(containsEdge(rp.vname,dst)) {
				System.out.println(rp.path_so_far + dst );
				return true;
			}
			vertex rpvtx=vertices.get(rp.vname);
			ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				
				// process only unprocessed data
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.path_so_far=rp.path_so_far+nbr;
					stack.addFirst(np);
				}
			}
		}
		return false;
	}
	public void bft() {
		HashMap<String, Boolean> processed=new HashMap<>();
		LinkedList<Pair> queue=new LinkedList<>();
		ArrayList<String> keys=new ArrayList<>(vertices.keySet());
		for(String key:keys) {
		if(processed.containsKey(key)) {
			continue;
		}
		Pair sp=new Pair();
		sp.vname=key;
		sp.path_so_far=key;
		
		//put new pair in queue
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			// remove pair from queue
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue; 
			}
			//processed put
			processed.put(rp.vname, true);
			
			//check direct edge
			System.out.println(rp.vname+" via "+rp.path_so_far);
			vertex rpvtx=vertices.get(rp.vname);
			ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				
				// process only unprocessed data
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.path_so_far=rp.path_so_far+nbr;
					queue.addLast(np);
				}
			}
		}
		}
	}
	public void dft() {
		HashMap<String, Boolean> processed=new HashMap<>();
		LinkedList<Pair> stack=new LinkedList<>();
		ArrayList<String> keys=new ArrayList<>(vertices.keySet());
		for(String key:keys) {
		if(processed.containsKey(key)) {
			continue;
		}
		Pair sp=new Pair();
		sp.vname=key;
		sp.path_so_far=key;
		
		//put new pair in queue
		
		stack.addFirst(sp);
		
		while(!stack.isEmpty()) {
			// remove pair from queue
			Pair rp=stack.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue; 
			}
			//processed put
			processed.put(rp.vname, true);
			
			//check direct edge
			System.out.println(rp.vname+" via "+rp.path_so_far);
			vertex rpvtx=vertices.get(rp.vname);
			ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				
				// process only unprocessed data
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.path_so_far=rp.path_so_far+nbr;
					stack.addFirst(np);
				}
			}
		}
		}
	}
	public boolean isCyclic() {
		HashMap<String, Boolean> processed=new HashMap<>();
		LinkedList<Pair> queue=new LinkedList<>();
		ArrayList<String> keys=new ArrayList<>(vertices.keySet());
		for(String key:keys) {
		if(processed.containsKey(key)) {
			return true;
		}
		Pair sp=new Pair();
		sp.vname=key;
		sp.path_so_far=key;
		
		//put new pair in queue
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			// remove pair from queue
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue; 
			}
			//processed put
			processed.put(rp.vname, true);
			
			//check direct edge
			vertex rpvtx=vertices.get(rp.vname);
			ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				
				// process only unprocessed data
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.path_so_far=rp.path_so_far+nbr;
					queue.addLast(np);
				}
			}
		}
		}
		return false;
	}
	public boolean isConnected() {
		HashMap<String, Boolean> processed=new HashMap<>();
		LinkedList<Pair> queue=new LinkedList<>();
		int flag=0;
		ArrayList<String> keys=new ArrayList<>(vertices.keySet());
		for(String key:keys) {
		if(processed.containsKey(key)) {
			continue;
		}
		flag++;
		Pair sp=new Pair();
		sp.vname=key;
		sp.path_so_far=key;
		
		//put new pair in queue
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			// remove pair from queue
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue; 
			}
			//processed put
			processed.put(rp.vname, true);
			
			//check direct edge
			vertex rpvtx=vertices.get(rp.vname);
			ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				
				// process only unprocessed data
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.path_so_far=rp.path_so_far+nbr;
					queue.addLast(np);
				}
			}
		}
		}
		if(flag>=2) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean isTree() {
		return !isCyclic() && isConnected();
	}
	public ArrayList<ArrayList<String>> getConnected(){
		ArrayList<ArrayList<String>> ans=new ArrayList<>();
		HashMap<String, Boolean> processed=new HashMap<>();
		LinkedList<Pair> queue=new LinkedList<>();
		ArrayList<String> keys=new ArrayList<>(vertices.keySet());
		
		for(String key:keys) {
		if(processed.containsKey(key)) {
			continue;
		}
		ArrayList<String> subans=new ArrayList<>();
		Pair sp=new Pair();
		sp.vname=key;
		sp.path_so_far=key;
		
		//put new pair in queue
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			// remove pair from queue
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue; 
			}
			
			//processed put
			processed.put(rp.vname, true);
			
			//check direct edge
			subans.add(rp.vname);
			vertex rpvtx=vertices.get(rp.vname);
			ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				
				// process only unprocessed data
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.path_so_far=rp.path_so_far+nbr;
					queue.addLast(np);
				}
			}
		}
		ans.add(subans);
		}
		return ans;
	}
}
