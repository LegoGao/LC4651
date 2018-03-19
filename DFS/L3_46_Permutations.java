public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // initials
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();
        // run dfs
        dfs(res, list, nums);
        return res;
    }
    private void dfs(List<List<Integer>> res, List<Integer> list, int[] nums){
        // 退出机制
        if(list.size() == nums.length ){
            res.add(new ArrayList<>(list));
        }
        // 条件动力机制
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            dfs(res, list, nums);
            list.remove(list.size() - 1);
        }
    }
}
