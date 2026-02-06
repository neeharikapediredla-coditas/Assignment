
public class Thirteen13 {
    public static int maxsub(int [] nums)
    {
        int curr= nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curr=Math.max(nums[i],curr+nums[i]);
            maxsum=Math.max(maxsum,curr);
        }
        return maxsum ;
    }
    public static void main(String[] args)
    {
        int [] nums={9,-3,99,-56,-4,-9,3};
        int result=maxsub(nums);
        System.out.println("max subarray sum + "+result);
    }
}

