
// Java program demonstrate execution of static blocks and variables
// lab prgm 4
import java.util.*;
import wickets.*;

class scoreboard {

    // Static variable

    static int runs = 0, totalscore = 0;
    static String tourtname = "IPL T20 2022";
    static int overs = 0, balls = 0, wickets = 0;
    static String cbatsman, nbatsman, cbowler, fielder;

    // Multiple Static Blocks

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "\n\nEnter the name of the tournament \n\nPress 1 - Add name of the tournament\nPress anything else - default (IPL T20 2022)");
        int i = sc.nextInt();
        sc.nextLine();
        if (i == 1) {
            System.out.println("Enter the name of the Tournament name >>> ");
            String tourname = sc.nextLine();
            System.out.println("Tournament name is " + tourname);
        } else {
            System.out.println("Tournament name is " + tourtname);
        }
    }

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "\n\nDo you want to continue? \n\nYes - Press 1\nNo - Press 0");
        int j = sc.nextInt();
        sc.nextLine();
        if (j == 1) {
            getplayerdetails();
            // scorecal();
        } else {
            end();
        }
    }

    static void end() {
        System.out.println("Good bye");
    }

    // Static Method

    private static void getplayerdetails() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the name of the batsman in the Strike >>> ");
        cbatsman = sc.nextLine();
        System.out.println("\nEnter the name of the batsman in the non Strike >>> ");
        nbatsman = sc.nextLine();
        System.out.println("\nEnter the name of the bowler >>> ");
        cbowler = sc.nextLine();
        System.out.println("\n " + " " + cbatsman + " " + "is facing" + " " + cbowler);
    }

    public static void scorecal() {
        // System.out.println("The value of i is: " + runs);
        // System.out.println("The value of j is: " + overs);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the total number of overs to be bowled inorder to calculate the total score: ");
        int tot_overs = sc.nextInt();
        System.out.println("\nThe total number of overs to be bowled: " + tot_overs);
        sc.nextLine();
        for (overs = 0; overs < tot_overs; overs++) {
            for (balls = 0; balls < 6; balls++) {
                System.out.println("\nEnter the score for each ball >>>");
                int runs = sc.nextInt();
                System.out.println("\nFor ball - " + balls);
                switch (runs) {
                    case 6:
                        totalscore = totalscore + runs;
                        System.out.println("\nA huge six by >" + cbatsman);
                        System.out.println("\nThe total score is now => " + totalscore);
                        break;
                    case 5:
                        totalscore = totalscore + runs;
                        System.out.println("\nA rare 5 runs batsman in the strike >" + cbatsman);
                        System.out.println("\nThe total score is now => " + totalscore);
                        break;
                    case 4:
                        totalscore = totalscore + runs;
                        System.out.println("\nA classic four by " + cbatsman);
                        System.out.println("\nThe total score is now => " + totalscore);
                        break;
                    case 3:
                        totalscore = totalscore + runs;
                        System.out.println("\n3 runs from " + cbatsman);
                        System.out.println("\nThe total score is now => " + totalscore);
                        break;
                    case 2:
                        totalscore = totalscore + runs;
                        System.out.println("\nQuick double by " + cbatsman);
                        System.out.println("\nThe total score is now => " + totalscore);
                        break;
                    case 1:
                        totalscore = totalscore + runs;
                        System.out.println("\nA Single from " + cbatsman);
                        System.out.println("\nThe total score is now => " + totalscore);
                        break;
                    case 0:
                        totalscore = totalscore + runs;
                        System.out.println("\nA dot delivery " + cbatsman);
                        System.out.println("\nThe total score is now => " + totalscore);
                        break;
                }
            }

        }
    }

    // Static Nested Class

    static class playerdetails {

        public void test() {

            runs = runs + 10;

            System.out.println("The updated value of i is: " + runs);
            System.out.println("The updated value of j is: " + overs);

        }

    }

}

public class Scorecard {

    public static void main(String args[]) {
        Wickets obj = new Wickets();
        Wickets obj1 = new Wickets();
        System.out.println("Package method called...");
        obj.getreward(400, 500);
        scoreboard.scorecal();
    }

}
