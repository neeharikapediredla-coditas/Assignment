
import java.util.*;
public class Twelve12 {
    public static int [] sum(int [] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String [] args)
    {
        int[] nums={4,6,7,8,9};
        int target=16;
        int[] result=sum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
}

