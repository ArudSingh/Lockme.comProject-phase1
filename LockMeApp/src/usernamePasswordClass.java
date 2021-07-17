import java.util.HashMap;
import java.util.Scanner;


    public class usernamePasswordClass {


        void username() {
            // declare the hashmap
            HashMap<String, Integer> mapUser = new HashMap<>();
            boolean loopAgain = true;
            Scanner scan = new Scanner(System.in);

            // loop while user not entering no
            do {
                System.out.print("Enter USERNAME:");
                String name = scan.nextLine();
                // ask for user input for id number
                System.out.print("Enter PASSWORD:");
                Integer pass = Integer.parseInt(scan.nextLine());

                Integer oldVal = mapUser.put(name, pass);

                if (oldVal != null) {
                    System.out.println("your username is:" + name + " and "
                            + oldVal + " password" + name);
                }

                // ask user to check if another entry is required
                System.out.print("you want to enter another user (y/n)?");
                String answer = scan.nextLine();

                // condition to satisfy in order to loop again
                if (answer.equals("y") || answer.equals("Y")) {
                    continue;
                } else {
                    break;
                }

            } while (loopAgain);
            scan.close();

            System.out.println("\n***************************************");
            System.out.println("The following users are in database");
            System.out.println("   USERNAME  " + "    PASSWORD ");
            for (String id : mapUser.keySet()) {
                System.out.println("   " + id + "            " + mapUser.get(id)); }
            System.out.println("\n****************************************");
        }



        }


