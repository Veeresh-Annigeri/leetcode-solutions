/*The degree array is initialized with a size of n + 1 to accommodate indices 
  from 1 to n (inclusive). The extra space is provided because the nodes are 
  usually numbered starting from 1, not 0, and it helps in indexing the array 
  directly with node numbers. */

class Solution {
    public int findCenter(int[][] edges) {
        int nodes = edges.length + 1;
        int[] degree = new int[nodes + 1];
        
        //by checking only for first two edges, we can find the centre node
        for ( int[] edge : edges){
            int x = edge[0];
            int y = edge[1];
            degree[x]++;
            degree[y]++;

            if(degree[x] > 1){
                return x;
            }
            if( degree[y] > 1) {
                return y;
            }
        }
        // no centre found
        return 0;
    }
}