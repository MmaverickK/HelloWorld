package gfg.practice;
// { Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class BFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    	ArrayList<Integer> ans = new ArrayList<Integer>();
    	Queue<Integer> queue = new LinkedList<Integer>();
    	Set<Integer> visited = new HashSet<Integer>();
    	
    	queue.offer(0);
    	visited.add(0);
    	
    	while(!queue.isEmpty()) {
    		Integer poll = queue.poll();
    		ans.add(poll);
    		
    		ListIterator<Integer> listIterator = adj.get(poll).listIterator();
    		
    		while(listIterator.hasNext()) {
    			Integer next = listIterator.next();
    			if(!visited.contains(next)) {
    				queue.offer(next);
    		    	visited.add(next);
    			}
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	return ans;
        
    }
}