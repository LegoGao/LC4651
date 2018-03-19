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
    public List<List<Integer>> levelOrder(TreeNode root) {
    	// corner case
    	List<List<Integer>> res = new ArrayList<>();
    	if(root == null){
    		return res;
    	}

    	// initials
    	Queue<TreeNode> queue = new LinkedList<>();

    	queue.offer(root);
    	// while loop
    	while(!queue.isEmpty()){
    		List<Integer> list = new ArrayList<>();
    		int size = queue.size();
    		for(int i = 0; i < size; i++){
    			TreeNode cur = queue.poll();
    			list.add(cur.val);
    			if(cur.left != null){
    				queue.offer(cur.left);
    			}
    			if(cur.right != null){
    				queue.offer(cur.right);
    			}
    		}
    		res.add(list);
    	}

    	// return res
    	return res;
    }
}
