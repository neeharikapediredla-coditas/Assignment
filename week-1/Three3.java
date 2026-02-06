//Find largest and small number in an array

import java.util.Scanner;
public class Three3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements: ");
        int n= sc.nextInt();
        int arr1[]= new int[n];
        System.out.println("enter the elements in an array: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int small=arr1[0];
        int great=arr1[0];
        for(int i=1;i<n;i++)
        {
            if(arr1[i]<small)
            {
                small =arr1[i];
            }
            if(arr1[i]>great)
            {
                great=arr1[i];
            }
        }
        System.out.println("smallest number= " +small);
        System.out.println("greatest number= " +great);
    }
}