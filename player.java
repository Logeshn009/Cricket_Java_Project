import java.util.*;

class player {
    private String player_name;
    private int player_id;
    private int player_age;

    // method overloading
    public static void average(String batsman_name, int scored_runs, int times_out) {
        int average;
        average = scored_runs / times_out;
        // System.out.println("\n----- Calculate the average of both the Batsman and
        // Bowler who played in a tournament -----\n");
        System.out.print("\nAverage of the Batsman in the tournament: " + average);
    }

    // constructor overloading
    player(String player_name, int player_id, int player_age) {
        this.player_name = player_name;
        this.player_id = player_id;
        this.player_age = player_age;
    }

    public String getplayername() {
        return player_name;
    }

    public int getplayerid() {
        return player_id;
    }

    public int getplayerage() {
        return player_age;
    }

    public static void average(String bowler_name, int runs_conceeded, int wickets_taken, float overs_bowled) {
        int average;
        average = runs_conceeded / wickets_taken;
        // Just convert one value to float
        float overs = (float) runs_conceeded / overs_bowled;
        ;
        // economy = runs_conceeded / overs_bowled;
        System.out.println("\n\nAverage of the Bowler in the tournament: " + average);
        System.out.println("\nEconomy of the Bowler in the tournament: " + overs);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.print("\n\n----- Batsman Details -----\n\n");
        // constructor overloading
        // player ply = new player(); //default constructor
        player play = new player("Logesh", 100, 25); // calling a parameterized constructor with the sets the value of
                                                     // parameters

        System.out.println("\n\n ----- Top Player of the tournament -----\n");
        System.out.println("Player Name: " + play.getplayername());
        System.out.println("Player ID: " + play.getplayerid());
        System.out.println("Player Age: " + play.getplayerage());

        // constructor overloading
        System.out.print("\n\n----- CALCULATE THE AVERAGE AND ECONOMY OF THE PLAYERS -----\n\n");
        System.out.print("\n\n----- Batsman Details -----\n\n");
        System.out.print("Enter the name of the batsman: ");
        String name = s.nextLine();
        System.out.print("Enter the total runs scored by the batsman in the tournament: ");
        int run = s.nextInt();
        System.out.print("Enter the total number of times out by the batsman in the tournament: ");
        int out = s.nextInt();
        average(name, run, out);
        System.out.print("\n\n----- Bowler Details -----\n\n");
        System.out.print("Enter the name of the bowler: ");
        String bo_name = s.next();
        System.out.print("Enter the total runs conceeded by the bowler in the tournament: ");
        int conceed = s.nextInt();
        System.out.print("Enter the total wickets taken by the bowler int the tournament: ");
        int wickets = s.nextInt();
        System.out.print("Enter the total number of overs bowled by the bowler in the tournament: ");
        float overs = s.nextInt();
        average(bo_name, conceed, wickets, overs);
        // average(1, 4, 3);
    }
}