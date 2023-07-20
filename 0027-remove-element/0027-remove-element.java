class Solution {
    public int removeElement(int[] nums, int val) {
       int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[j]==val){
                j--;
            }
            else{
                if(nums[i]==val){
                    int temp= nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    i++;
                    j--;
                }
                else{
                    i++;
                }
            }
        }
            return j+1;
            
        
    }
}