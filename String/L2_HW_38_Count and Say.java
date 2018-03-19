public class Solution {
    public String countAndSay(int n) {
        String tmpRes = "1";
        int count = 1;
        int i = 1;
        while(i < n){
            String s = tmpRes;
            tmpRes = "";
            for(int j = 0; j < s.length(); j++){
                if((j + 1) < s.length() && s.charAt(j) == s.charAt(j+1)){
                    count++;
                } else {
                    // 构造tmpRes;
                    tmpRes = tmpRes + count + s.charAt(j);
                    // reset count;
                    count = 1;
                }
            }
            // 完成上面的第i位置上的for 之后此处可以开始下一个i++ 咯
            i++;
        }
        return tmpRes;
    }
}
