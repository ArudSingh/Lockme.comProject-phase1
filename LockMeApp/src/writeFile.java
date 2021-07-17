import java.util.Scanner;
import java.io.*;
public class writeFile
{
    void write(){
        {
            String p=setpath();
            try {
                write(p);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print("\n File Write Successfully"); }
    }

    static String setpath()
    {
        Scanner read =new Scanner(System.in);

        System.out.println("Enter Your File Name With (*extension*):");
        return read.nextLine();
    }
    static void write(String path)throws Exception
    {
        Scanner sc =new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream(path);
        System.out.print("Write Your contant and  Save file: ");

        int ch;
        String data;
        byte b[];
        boolean flag=true;
        byte eof=(char)('o');

        while(true)
        {
            data=sc.nextLine();
            b=data.getBytes();
            for(int i=0;i<b.length;i++)
            {
                if(b[i]==eof)
                {
                    flag=false;
                    break;
                }
                fos.write(b[i]);
            }
            if(flag==false)
                break;
            fos.write((byte)('\n'));
        }
        fos.close();
    }

}
