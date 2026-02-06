import java.util.*;

public class Six6 {
    public static void main(String args[]) {
        int h=4;
        int n=2 * h- 1;
        for (int i = 1; i <= n; i++) {
            int stars, spaces;
            if (i<=h)
            {
                stars =2*i-1;
                spaces =h-i;
            }
            else
            {
                stars=2 * (n - i + 1) - 1;
                spaces=i - h;
            }
            for(int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}