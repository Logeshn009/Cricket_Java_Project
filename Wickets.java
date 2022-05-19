package wickets;

import java.util.*;
//1.Multiple Inheritance using interface -- Done
//2.Extending Interface

interface reward {
    void getreward(int runs, int wicks);

    // implement the Static Interface
    static void MemberName() {
        System.out.println("\n\nPlayer name : Logesh N\nID  : 2147120");
    }
}

// 4.Nested Interface
interface UserDAta {
    static void UD() {
        System.out.println("User Data");
    }
}

class putreward implements reward {

    float amount = 0;

    // implementation of abstract method
    public void getreward(int runs, int wicks) {
        if (wicks == 1) {
            amount = 5000;
        } else if (wicks == 2) {
            amount = 7000;
        } else if (wicks == 3) {
            amount = 10000;
        }
        System.out.println("Amount rewarded is :" + (runs * 200 + amount));
        System.out.println("\nRuns conceeded : " + runs + "runs" + "\nTotal wickets taken :" + 30);
    }

}

public class Wickets extends putreward {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        reward.MemberName();
        System.out.print("\nNumber of wickets  : ");
        int w = sc.nextInt();
        // System.out.print("date " + a);
        System.out.print(
                "Toal wickets taken \n     Enter\n  1-> 3 wicket haul \n  2-> 5 wicket haul \n  3-> 6 wicket haul\n");
        int r = sc.nextInt();
        putreward r1 = new putreward();
        r1.getreward(w, r);
    }
}