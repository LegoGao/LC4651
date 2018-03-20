public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // corner case

        // initials
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int pos = 0;

        // run dfs
        dfs(candidates, target, res, list, sum, pos);

        // return res
        return res;

        
    }
    private void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> list, int sum, int pos){
        // 退出机制
        if(sum == target){
            res.add(new ArrayList<>(list));
        }
        if(sum > target || pos >= candidates.length){
            return;
        }


        // 动力机制
        for(int i = pos; i < candidates.length; i++){
            // add to list
            list.add(candidates[i]);
            // run dfs
            dfs(candidates, target, res, list, sum + candidates[i], i);
            // remove from list
            list.remove(list.size() - 1);
        }
    }
}
