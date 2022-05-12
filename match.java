// lab prgm 6

import java.util.*;
import java.lang.*;

class match {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        StringBuilder year = new StringBuilder("2022");
        int choice;
        int flag = 1;
        Matches m = new Matches();
        System.out.print("\n-----------------------------------------");
        System.out.print("\n         WELCOME TO  IPL " + year + "        ");
        System.out.print("\n-----------------------------------------");
        m.insertion();
        while (flag == 1) {

            System.out.print("\n-----------------------------------------");
            System.out.print("\n    1 - Alter The Details    ");
            System.out.print("\n    2 - Display Matches    ");
            System.out.print("\n    3 - Exit    ");
            System.out.print("\n-----------------------------------------");
            System.out.print("\nYour Choice : ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    m.display();
                    m.alter();
                    break;
                case 2:
                    m.display();
                    break;
                case 3:
                    flag = 0;
                    break;

            }
        }
    }
}

class Matches {
    String home_team = new String();
    String away_team = new String();
    StringBuffer venue = new StringBuffer();
    StringBuffer date = new StringBuffer();
    Scanner in = new Scanner(System.in);

    void insertion() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nHome Team : ");
        home_team = in.nextLine();
        System.out.print("\nAway Team : ");
        away_team = in.nextLine();
        System.out.print("\nVenue : ");
        String take_data = in.nextLine();
        venue.append(take_data);
        System.out.print("\nDate : ");
        take_data = in.nextLine();
        date.append(take_data);
    }

    void display() {
        System.out.print("\n---------------  IPL  ----------------");
        System.out.print("\n-          " + home_team + " Vs " + away_team + "   ");
        System.out.print("\n------------------------------------------");
        System.out.print("\n-                                        ");
        System.out.print("\n-           Venue | " + venue + "            ");
        System.out.print("\n-           Date  | " + date + "             ");
        System.out.print("\n-                                        ");
        System.out.print("\n------------------------------------------");
    }

    void alter() {
        int choice;
        int ch;
        System.out.print("\nPress Any Number to Exit ");
        System.out.print("\n 1  -  Update Information  ");
        System.out.print("\n 2  -  Append Venue ");

        System.out.print("\nYour Choice : ");
        choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\n   Update   ");
                System.out.print("\n 1  -  Home Team  ");
                System.out.print("\n 2  -  Away Team  ");
                System.out.print("\n 3  -  Date   ");
                System.out.print("\n 4  -  Venue  ");
                System.out.print("\nYour Choice : ");
                ch = in.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("\nHome Team : ");
                        home_team = in.nextLine();
                        home_team = in.nextLine();
                        break;
                    case 2:
                        System.out.print("\nAway Team : ");
                        away_team = in.nextLine();
                        away_team = in.nextLine();
                        break;
                    case 3:
                        System.out.print("\nDate : ");
                        date.append("");
                        String take_data = in.nextLine();
                        take_data = in.nextLine();
                        date.append(take_data);
                        break;
                    case 4:
                        System.out.print("\nVenue : ");
                        venue.append("");
                        String take_venue = in.nextLine();
                        take_venue = in.nextLine();
                        venue.append(take_venue);

                        break;
                }

                break;
            case 2:

                System.out.print("\nVenue : ");
                String take_data = in.nextLine();
                take_data = in.nextLine();
                venue.append(take_data);
                break;

        }
    }

}