import java.util.Scanner;

public class fileOptionClass {

    public static int Filemenu() {

        Scanner in= new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("*     FILE OPTION MENU    *");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("PRESS 1. CREATE NEW CREDENTIALS");
        System.out.println("PRESS 2. WRITE IN CREDENTIALS");
        System.out.println("PRESS 3. READ CREDENTIAL");
        System.out.println("PRESS 4. DELETE CREDENTIALS");
        System.out.println("PRESS 5. CREDENTIALS INFORMATION");
        System.out.println("PRESS 6. SEARCH FILE");
        System.out.println("PRESS 0. EXIT(back to main Menu)");


        int choice=in.nextInt();

        switch(choice) {
            case 1:
                System.out.println(" Creating file:");
                creatingFiles  cf= new creatingFiles ();
                cf.create();
                break;


            case 2:
                System.out.println(" write a file:");
                writeFile wf= new writeFile ();
                wf.write();
                break;

            case 3:

                System.out.println(" read a file:");
                readFile re= new readFile();
                re.Read();
                break;

            case 4:

                System.out.println(" Delete a File:");
                deleteFile df= new deleteFile();
                df.Delete();
                break;


            case 5:

                System.out.println(" File Information:");
                fileInformation fi= new  fileInformation ();
                fi.fileinfo();
                break;
            case 6:

                System.out.println(" search file:");
                searchFile sf= new  searchFile ();
                sf.search();
                break;
            case 0:
                Filemenu();
            default:
                System.out.println("Invalid choice");
        }
        return choice;

    }

}



