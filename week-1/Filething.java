import java.io.*;
public class Filething {
    public static void main(String args[]) throws Exception
    {
        FileWriter fil=new FileWriter("sample.txt");
        fil.write("hello!");
        fil.close();
    }
}
