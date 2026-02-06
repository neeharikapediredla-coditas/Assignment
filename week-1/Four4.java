//Compress a string in the below format Input: -> "aaabbcccdd" Output: -> "a3b2c3d2"

import java.util.Scanner;
public class Four4
{
    public static void main(String[] main)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s= sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            int temp=1;
            while( i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                temp++;
                i++;
            }
            System.out.print( s.charAt(i)+""+temp);
        }
    }
}