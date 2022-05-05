import java.util.*;

class playerdetails {
    int player_id;
    String player_name;
    int player_age;
    int player_runs;
    int player_wickets;

    // parameterized constructor
    playerdetails(int player_id, String player_name, int player_age, int player_runs, int player_wickets) {
        this.player_id = player_id;
        this.player_name = player_name;
        this.player_age = player_age;
        this.player_runs = player_runs;
        this.player_wickets = player_wickets;
    }

    playerdetails() {
        this(3);
        System.out.println("Calling parameterized constructor from default constructor");
    }

    // non parameterized constructor up

    // calling parameterized constructor from default constructor dwn

    playerdetails(int player_id) {
        System.out.println(player_id);
    }

    void getdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n----- Enter the player details -----");
        System.out.println("\n\nEnter player-id >>>");
        player_id = sc.nextInt();
        sc.nextLine();
        System.out.println("\nEnter player name >>>");
        player_name = sc.nextLine();
        // sc.nextLine();
        System.out.println("\nEnter player age >>>");
        player_runs = sc.nextInt();
        // sc.nextLine();
        System.out.println("\nEnter player runs");
        player_runs = sc.nextInt();
        // sc.nextLine();
        System.out.println("\nEnter player wickets >>>");
        player_wickets = sc.nextInt();
        // sc.nextLine();

    }

    // to invoke current class method this keyword
    void getdetailsagain() {
        this.getdetails();
    }
}

public class Tournament {
    public static void main(String myargs[]) {

        String s1, s2, s3;
        s1 = myargs[0];
        s2 = myargs[1];
        s3 = myargs[2];

        System.out.println("Command line arguments >>> " + s1 + ", " + s2 + ", " + s3);

        // System.out.println("\n---- Topmost Player in the tournament ----\n");

        playerdetails pl = new playerdetails(11, "Logesh", 21, 4030, 102);

        pl.getdetails();
        pl.getdetailsagain(); // to invoke current class method

        playerdetails play = new playerdetails(0);
    }
}
