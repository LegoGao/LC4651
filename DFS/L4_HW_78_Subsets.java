public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // initials
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        // corner case
        if(nums == null || nums.length == 0) return res;

        // dfs
        dfs(res, tmp, nums, 0);

        // return res
        return res;
    }
    private void dfs(List<List<Integer>> res, List<Integer> tmp, int[] nums, int pos){

        // 此题由于[] anyway 先处理，再考虑是否退出
        // 每次run dfs首要任务,每次拿到一个tmp 都要放到res里面去
        res.add(new ArrayList<Integer>(tmp));
        
        // 退出机制
        if(pos >= nums.length) return;

        // 动力机制 for 循环就是动力i 从 pos 开始
        for(int i = pos; i < nums.length; i++){
            // 更新tmp
            tmp.add(nums[i]);
            // 深一层的dfs
            dfs(res, tmp, nums, i + 1);
            // 回复tmp
            tmp.remove(tmp.size() - 1);
        }
    }
}
