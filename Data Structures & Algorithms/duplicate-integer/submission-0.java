class Solution {
    public boolean hasDuplicate(int[] nums) {

        Arrays.sort(nums); 
        int left = 0;
        int right = 1;

        if(nums.length == 1){
            return false;
        }else{
            while(right < nums.length ){
                if(nums[left] != nums[right]){
                    left= left + 1;
                    right = right +1;
                }else{
                    return true;
                }
        }
        }
        return false;
        
    }
}