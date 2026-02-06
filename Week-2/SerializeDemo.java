//QUESTION-8
/**
 8. Create a class User that implements Serializable with fields: -
 • username
 • password (marked as transient)
 • email
 • Serialize the object to a file.
 • Deserialize it and print all field values.
 • Explain why the password value is not restored.
 */

import java.io.*;
import java.util.Scanner;

class User implements Serializable{

    String name;
    transient String pass;

    User(String n,String p){
        name=n;
        pass=p;
    }
}

public class SerializeDemo {

    public static void main(String[] args)throws Exception{

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name: ");
        String n=sc.next();

        System.out.print("Enter password: ");
        String p=sc.next();

        User u=new User(n,p);

        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("data.txt"));
        out.writeObject(u);
        out.close();

        ObjectInputStream in=new ObjectInputStream(new FileInputStream("data.txt"));
        User x=(User)in.readObject();

        System.out.println(x.name);
        System.out.println(x.pass);
    }
}
