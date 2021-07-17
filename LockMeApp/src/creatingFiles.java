import java.io.FileOutputStream;
import java.util.Scanner;

public class creatingFiles {
    void create() {
        {
            String p=setpath();
            try {
                write(p);
            }
            catch (Exception e) {
                e.printStackTrace();

            }
            System.out.println("\n File created Successfully");}

    }
    static String setpath()
    {
        Scanner read=new Scanner(System.in);
        String path;
        System.out.println("Enter your File Name with  (*extention*):");
        return read.nextLine();

    }
    static void write(String path)throws Exception
    {
        FileOutputStream fos=new FileOutputStream(path);
    }

}
