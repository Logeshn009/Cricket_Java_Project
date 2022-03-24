import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {

        Admin ad = new Admin();
        Player pl = new Player();
        Manager mn = new Manager();
        Coach ch = new Coach();
        Team tm = new Team();

        ad.admin_details(100, "Logesh N", "logeshnandhakumar12@gmail.com", "7548817148",
                "D/N - 5, durga nagar, zuzuvadi, Hosur.");

        ad.admin_details_display();
    }
}

class Admin {

    int admin_id;
    String admin_name, admin_email, admin_Phone, admin_address;

    public void admin_details(int adminze_id, String admin_name, String admin_email, String admin_Phone,
            String admin_address) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.admin_email = admin_email;
        this.admin_Phone = admin_Phone;
        this.admin_address = admin_address;
    }

    public void admin_details_display() {
        System.out.println(
                "THE FOLLOWIG OUTPUT SHOWS ALL POSSILE CLASSES THAT ARE USED IN BANKING DOMAIN WITH SOME VALUES");
        System.out.println("\n The Inputs are static input passed from objects of respective classes");

        System.out.println("----- Admin Details -----");

        System.out.println("\nAdmin id: " + admin_id);
        System.out.println("Admin Name: " + admin_name);
        System.out.println("Admin email: " + admin_email);
        System.out.println("Admin Phone: " + admin_Phone);
        System.out.println("Admin Address: " + admin_address);
    }

}

class Player {

}

class Manager {

}

class Coach {

}

class Team {

}
