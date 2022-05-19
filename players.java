import java.util.ArrayList;

public class players {
    public static void main(String[] args) {

        ArrayList<String> arrlist = new ArrayList<String>();
        ArrayList<String> playlist = new ArrayList<String>();

        arrlist.add("Joshua");
        arrlist.add("Rakesh");
        arrlist.add("Mani");
        arrlist.add("solomon");
        arrlist.add("Logesh");

        playlist.add("Joshua");
        playlist.add("Rakesh");
        playlist.add("Mani");
        playlist.add("solomon");
        playlist.add("Logesh");

        System.out.println("List of top players compared with last year records");
        for (String playername : arrlist) {
            System.out.println("\nPlayer name (year1) = " + playername);
        }
        for (String player : playlist) {
            System.out.println("\nPlayer name (year2)= " + player);
        }

        boolean boolval = arrlist.equals(playlist);
        System.out.println("List of top batters comparing with the last year records" + "--> " + boolval);
    }
}