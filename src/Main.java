//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001B[01mWelcome to N.O.V.A " +
                "Operating System!");
        while (true) {
            System.out.print("M.A.V.I.N Distribution v- 3.1> ");
            String command = scanner.nextLine( );
            if (command.equals("exit")) {
                System.out.println(" Hard to say but Goodbye!");
                break;
            } else if (command.equals("hello")) {
                System.out.println(" User, what would you like to do!");
            }else if (command.equals("how are you")) {
                System.out.println("As Great as you");
            }else if (command.equals("time"   )) {
                System.out.println("Today is: " + new java.util.Date());
            } else if(command.equals("who are you")) {
                System.out.println("Operating system");
            } else if(command.equals("timezone")) {
                TimeZone zone = TimeZone.getDefault();
                String name = zone.getDisplayName();
                System.out.println("Display name for default time zone: "+ name);

            } else if(command.equals("star")) {
                System.out.println("Enter no of stars to generate");
                Scanner scan=new Scanner(System.in);
                int n=scan.nextInt();

                // Number of lines in the pattern

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("\u001B[11mstarprinted");
                    }
                    System.out.println();
                }
            }
            else if(command.equals("help")) {
                System.out.println("\u001B[036mWelcome!! To N.O.V.A OS , a free and open-source OS developed by Divyanshu Pradhan for Advance Legacy Systems that runs JVM");
            }else if(command.equals("cal")) {

                Calendar calendar = Calendar.getInstance();

                System.out.println("Current Year : " + calendar.get(Calendar.YEAR)); // Fetched Current Year
                System.out.println("Current Month : " + calendar.get(Calendar.MONTH)); // Fetched Current Month
                System.out.println("Current Date : " + calendar.get(Calendar.DATE)); 	}
            else if(command.equals("matrix")) {

                int[][] array = new int[50][50]; // Create a 5x5 array

                // Loop to fill the 2D array with the desired pattern
                for (int i = 0; i < 5; i++) {
                    int value = (i % 2 == 0) ? 1 : 0;
                    for (int j = 0; j < 5; j++) {
                        array[i][j] = value;
                    }
                }

                // Loop to print the 2D array
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(array[i][j] + "\u001B[31m");
                    }
                    System.out.println();
                }
            }   else {
                System.out.println("Unknown command. Try 'hello' or 'date' or help");
            }
        }
    }
}