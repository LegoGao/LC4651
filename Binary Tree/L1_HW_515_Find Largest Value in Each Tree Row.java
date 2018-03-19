/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
    	// corner case
    	List<Integer> res = new ArrayList<>();
    	if(root == null){
    		return res;
    	}
    	// initials

      Queue<TreeNode> pq = new LinkedList<>();

    	pq.offer(root);
    	// while loop
    	while(!pq.isEmpty()){
    		int max = Integer.MIN_VALUE;
    		int size = pq.size();
    		for(int i = 0; i < size; i++){
    			TreeNode cur = pq.poll();
          max = Math.max(max, cur.val);

    			if(cur.left != null){
    				pq.offer(cur.left);
    			}
    			if(cur.right != null){
    				pq.offer(cur.right);
    			}
    		}
    		res.add(max);
    	}
    	// return res
    	return res;
    }
}
