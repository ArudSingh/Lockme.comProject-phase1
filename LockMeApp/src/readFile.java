import java.io.File;
import java.util.Scanner;


public class readFile {


     void Read() {

         try {
                System.out.print("Enter the file name with (*extension*): ");


                Scanner input = new Scanner(System.in);

                File file = new File(input.nextLine());
                input = new Scanner(file);


                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    System.out.println();
                    System.out.println();
                }
                input.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }


    }



