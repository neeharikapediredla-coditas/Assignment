//8. Spiral Matrix
//Input : -> { {1,2,3,4},
//{5,6,7,8},
//{9,10,11,12},
//{13,14,15,16} };
//
//Output: -> 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
public class Eight8 {
    public static void main(String []args)
    {
        int arr[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int up=0,down=arr.length-1;
        int left=0,right=arr.length-1;
        while(up<=down && left <= right)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(arr[up][i]+",");
            }
            up++;
            for(int i=up;i<=down;i++)
            {
                System.out.print(arr[i][right]+",");
            }
            right--;
            if(up<=down) {
                for (int i = down; i >= left; i--) {
                    System.out.print(arr[down][i] + ",");
                }
                down--;
            }
            if(left<=right) {
                for (int i = left; i >= up; i--) {
                    System.out.print(arr[i][left] + "'");
                }
                left++;
            }
        }
    }
}