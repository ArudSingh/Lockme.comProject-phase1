import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class lockMeApp {

    public static void main(String args[]) {

        System.out.println("----------------------------------------------------------------");
        System.out.println("**                                                            **");
        System.out.println("**               Welcome To LockMe.com                        **");
        System.out.println("**            Your Personal Digital Locker                    **");
        System.out.println("**                                                            **");
        System.out.println("----------------------------------------------------------------");
        System.out.println("                                                                   Developed by : Arud");
        System.out.println("                                                                   Email ID     : arudsingh55555@gmail.com");
        System.out.println("press 1 for LOGIN");
        System.out.println("press 2 for REGISTRATION");
        Scanner in= new Scanner(System.in);
        int ch = in.nextInt();

        switch(ch)

        {
            case 1:
                System.out.println("----------------------------------------------------------------");
                System.out.println("**               WELCOME TO LOGIN PAGE                        **");
                System.out.println("----------------------------------------------------------------");

                //Create a HashMap
               Map<String, Integer> hashmap = new HashMap<String, Integer>();


                  hashmap.put("shivam", 123);
                  hashmap.put("aanya", 75);

                //Enter username and password
                Scanner s = new Scanner(System.in);

                System.out.println("ENTER USERNAME");
                String str = s.nextLine();
                System.out.println("ENTER PASSWORD");
                int count = s.nextInt();

                Iterator<String> keys = hashmap.keySet().iterator();
                int i = 0;
                //Cycle to see if the entered username and password are stored in HashMap
                while (keys.hasNext()) {
                    Object key = keys.next();
                    i = i + 1;
                    if (hashmap.get(key).equals(count) || key.equals(str)) {
                        System.out.println("---------------------------------------");
                        System.out.println("HELLO  " + (String) str);
                        System.out.println("This is your personal CREDENTIALS");
                        System.out.println("---------------------------------------");
                        fileListClass fl = new fileListClass();
                        fl.fileList();
                        System.out.println("-------------------------------------------------");
                        System.out.println("PRESS y : for operation on your CREDENTIALS ");
                        System.out.println("PRESS n : for EXIT");
                        System.out.println("-------------------------------------------------");

                        String choice = in.next();

                        if (choice.equals("y")) {
                            fileOptionClass fn = new fileOptionClass();
                            fn.Filemenu();
                        }

                        break;
                    }

               if (i == hashmap.size())
                    {
                        System.out.println("The user name or password is incorrect");
                    }

                }
                break;

            case 2:
                System.out.println("----------------------------------------------------------------");
                System.out.println("**               WELCOME TO REGISTRATION PAGE                 **");
                System.out.println("----------------------------------------------------------------");
                usernamePasswordClass  hm= new usernamePasswordClass ();
                hm.username();

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }


        }

    }
