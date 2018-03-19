// Method 2
public class Solution {
    public int[] searchRange(int[] nums, int target){
        int[] res = new int[]{-1, -1};
        // corner case
        if(nums == null || nums.length == 0){
            return res;
        }
        // initials

        // run private function
        int left = findLastPos(nums, target);
        int right = findLastPos(nums, target + 1);
        if(left < right){
            res[0] = left + 1;
            res[1] = right;
        }
        return res;
    }
    private int findLastPos(int[] nums, int target){
        if(nums[nums.length - 1] < target){
            return nums.length - 1;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left  + 1  <  right){
        	int mid = left + (right - left) / 2;
            if(nums[mid] >= target){ // 说明肯定在左边
                right = mid;
            } else {
                left = mid;
            }
        }
        if(nums[left] < target){
            return left;
        } else {
        	return left - 1;
        }
    }
}

// Method 1
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        // initials
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;

        // corner case
        if(nums == null || nums.length == 0){
            return res;
        }
        // start loop
        res[0] = findLeftMost(nums, target);
        res[1] = findRightMost(nums, target);
        // return res
        return res;
    }
    private int findLeftMost(int[] nums, int target){
        // 开始走九章的公式 initials
        int start = 0;
        int end = nums.length - 1;
        // 公式while
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){ // 因为找leftMost,所以是end = mid;
                end = mid;
            } else if(nums[mid] < target){ // 说明还在右半部分
                start = mid;
            } else {
                end = mid;
            }
        }
        // 公式return
        if(nums[start] == target){
            return start;
        }
        if(nums[end] == target){
            return end;
        }
        return -1;
    }
    private int findRightMost(int[] nums, int target){
        // 开始走九章的公式 initials
        int start = 0;
        int end = nums.length - 1;
        // 公式while
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){ // 因为找rightMost,所以是end = mid;
                start = mid;
            } else if(nums[mid] < target){ // 说明还在右半部分
                start = mid;
            } else {
                end = mid;
            }
        }
        // 公式return
        if(nums[end] == target){
            return end;
        }
        if(nums[start] == target){
            return start;
        }
        return -1;
    }
}
