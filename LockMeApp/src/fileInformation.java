import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class fileInformation {
    void fileinfo() {

        { System.out.print("Enter the file name with (*extension*): ");


            Scanner input = new Scanner(System.in);

            File file = new File(input.nextLine());

            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Name: " + file.getName());
            System.out.println("canExecute- " + file.canExecute());
            System.out.println("isFile- " + file.isFile());
            System.out.println("isHidden- " + file.isHidden());
            System.out.println("length: " + file.length());
            System.out.println("lastModified: " + (new Date(file.lastModified())));
        }

    }

}

