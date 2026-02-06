//7. print below pattern
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

public class Seven7
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}