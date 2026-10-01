import java.util.ArrayList;

class TrainRoute {


   static ArrayList<station> route1= new ArrayList<>();
   static {
       route1.add(new station("Chennai Beach", "Starting station", 0));
       route1.add(new station("Chennai Fort", "Intermediate station", 2));
       route1.add(new station("Chennai Park", "Intermediate station", 4));
       route1.add(new station("Chennai Egmore", "Intermediate station", 5));
       route1.add(new station("Chetpet", "Intermediate station", 7));
       route1.add(new station("Nungambakkam", "Intermediate station", 9));
       route1.add(new station("Kodambakkam", "Intermediate station", 10));
       route1.add(new station("Mambalam", "Intermediate station", 12));
       route1.add(new station("Saidapet", "Intermediate station", 13));
       route1.add(new station("Guindy", "Intermediate station", 15));
       route1.add(new station("St.Thomas Mount", "Intermediate station", 17));
       route1.add(new station("Palavanthangal", "Intermediate station", 18));
       route1.add(new station("Minambakkam", "Intermediate station", 20));
       route1.add(new station("Tirusulam", "Intermediate station", 22));
       route1.add(new station("Pallavaram", "Intermediate station", 23));
       route1.add(new station("Chromepet", "Intermediate station", 25));
       route1.add(new station("Tambaram Sanatorium", "Intermediate station", 28));
       route1.add(new station("Tambaram", "Ending station", 29));
    }
    static ArrayList<station> route2= new ArrayList<>();
   static{
       route2.add(new station("Chennai Central", "Starting station", 0));
       route2.add(new station("Basin Bridge", "Intermediate station", 2));
       route2.add(new station("Vyasarpadi Jeeva", "Intermediate station", 4));
       route2.add(new station("Perambur", "Intermediate station", 6));
       route2.add(new station("Perambur Carriage Works", "Intermediate station", 7));
       route2.add(new station("Perambur Loco Works", "Intermediate station", 8));
       route2.add(new station("Villivakkam", "Intermediate station", 9));
       route2.add(new station("Korattur", "Intermediate station", 12));
       route2.add(new station("Pattaravakkam", "Intermediate station", 14));
       route2.add(new station("Ambattur", "Intermediate station", 15));
       route2.add(new station("Tirumullaivayil", "Intermediate station", 17));
       route2.add(new station("Annanur", "Intermediate station", 18));
       route2.add(new station("Avadi", "Ending station", 21));
   }

    static ArrayList<station> route3= new ArrayList<>();
    static {


        route3.add(new station("Chennai Beach", "Starting station", 0));
        route3.add(new station("Royapuram", "Intermediate station", 2));
        route3.add(new station("Washermanpet", "Intermediate station", 4));
        route3.add(new station("Vyasarpadi Jeeva", "Intermediate station", 6));
        route3.add(new station("Perambur", "Intermediate station", 8));
        route3.add(new station("Perambur Loco Works", "Intermediate station", 9));
        route3.add(new station("Villivakkam", "Intermediate station", 11));
        route3.add(new station("Korattur", "Intermediate station", 13));
        route3.add(new station("Pattaravakkam", "Intermediate station", 15));
        route3.add(new station("Ambattur", "Intermediate station", 17));
        route3.add(new station("Tirumullaivayil", "Intermediate station", 19));
        route3.add(new station("Avadi", "Intermediate station", 21));
        route3.add(new station("Hindu College", "Intermediate station", 23));
        route3.add(new station("Pallavaram", "Intermediate station", 25));
        route3.add(new station("Pattabiram", "Intermediate station", 27));
        route3.add(new station("Thiruvalangadu", "Intermediate station", 30));
        route3.add(new station("Mosur", "Intermediate station", 33));
        route3.add(new station("Arakkonam Junction", "Ending station", 36));
    }
}
