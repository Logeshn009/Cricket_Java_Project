// lab prgm 7

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

interface show {

    default void message() {
        System.out.println("\n\t Welcome to IPL Stadium Management \n");
    }

    public void display1();

    public void display2();

}

class stadiumdetails implements show {

    int maxVal = 0;

    public void usermessage() {
        final int user_id = 2147120;
        System.out.println("\nIPL_Stadium_Admin : Logesh" + "\n" + "user_id :" + user_id);
    }

    public void display1() {

    }

    public void display2() {

    }

    static String findWord(String[] arr) {

        // Create HashMap to store word and it's frequency
        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        // Iterate through array of words
        for (int i = 0; i < arr.length; i++) {
            // If word already exist in HashMap then increase it's count by 1
            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            }
            // Otherwise add word to HashMap
            else {
                hs.put(arr[i], 1);
            }
        }

        // Create set to iterate over HashMap
        Set<Map.Entry<String, Integer>> set = hs.entrySet();
        String key = "";
        int value = 0;

        for (Map.Entry<String, Integer> me : set) {
            // Check for word having highest frequency
            if (me.getValue() > value) {
                value = me.getValue();
                key = me.getKey();
            }
        }

        // Return word having highest frequency
        return key;
    }
}

class Stadium extends stadiumdetails {

    // Function to calculate the most frequent word in the array.
    public void FrequentWord(String array[]) {
        // Insert all unique strings and update count if a string is not unique.
        Map<String, Integer> hshmap = new HashMap<String, Integer>();
        for (String str : array) {
            if (hshmap.keySet().contains(str)) // if already exists then update count.
                hshmap.put(str, hshmap.get(str) + 1);
            else
                hshmap.put(str, 1); // else insert it in the map.
        }
        // Traverse the map for the maximum value.
        String maxStr = "";

        for (Map.Entry<String, Integer> entry : hshmap.entrySet()) {
            String key = entry.getKey();
            Integer count = entry.getValue();
            if (count > super.maxVal) {
                super.maxVal = count;
                maxStr = key;
            }
            // Condition for the tie.
            else if (count == super.maxVal) {
                if (key.length() < maxStr.length())
                    maxStr = key;
            }
        }
        super.usermessage();
        System.out.println("\nMost frequently used Stadium to play: " + maxStr);
        System.out.println("Number of times Stadium has chosen: " + super.maxVal);
    }

    // Main
    public static void main(String args[]) {

        Stadium MFW = new Stadium();
        stadiumdetails res = new stadiumdetails();

        String[] arr = { "MCA Pune", "MA Chidambaram", "MA Chidambaram", "Eden Gardens", "DY Patil Stadium" };
        String[] stadium = { "Pune", "Chennai", "Chennai", "Kolkata", "Pune" };
        res.message();

        MFW.FrequentWord(arr);

        String sol = findWord(stadium);
        System.out.println("\nMost Frequently chosen city:\n" + sol);

        res.display1();
        res.display2();
    }

}