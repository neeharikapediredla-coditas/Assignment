
import java.util.*;
import java.io.*;
public class Nine9 {
    public static void main(String args[]) throws Exception
    {
        HashSet<Character>vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        Scanner sc=new Scanner(new File("ninth_quest.txt"));
        int count=0;
        while(sc.hasNextLine())
        {
            String line=sc.nextLine();
            for(char ch:line.toCharArray())
            {
                if(vowels.contains(ch))
                {
                    count++;
                }
            }
        }
        sc.close();
        System.out.println(count);

    }
}
