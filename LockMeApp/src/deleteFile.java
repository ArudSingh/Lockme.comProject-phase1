import java.io.File;
import java.util.Scanner;

public class deleteFile {
    void Delete() {

        System.out.print("Enter the file Name (*extension*) which you Want to Delete : - ");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        File file = new File(input.nextLine());

        if (file.delete()) {
            System.out.println();
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.(please Enter correct File name!)");
        }
    }

}
