import java.io.File;
import java.util.Scanner;

public class searchFile {
    void search() {

        System.out.println("Searching a file in the directory");
        try {
            File filesearch = new File("C:\\Users\\ARUD\\IdeaProjects\\LockMeApp");
            String[] search = filesearch.list();
            System.out.print("Please enter filename to search : ");
            Scanner fs = new Scanner(System.in);
            String filese = fs.nextLine();
            int flag = 0;
            if (search == null)
                System.out.println("Empty directory");
            else {
                for (int i = 0; i < search.length; i++) {
                    String filename = search[i];
                    if (filename.equals(filese)) {
                        System.out.println("File found : " + filename);
                        flag = 1;
                    }
                }
            }
            if (flag == 0)
                System.out.println("File not found : " + filese);
        } catch (NullPointerException ne) {
            System.out.println("Please specify the correct folder name");
        }
        System.out.println("---------------------------------------");
        System.out.print("Please choose another option to continue : ");

    }
}
