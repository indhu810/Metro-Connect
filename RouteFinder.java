import java.util.ArrayList;

class RouteFinder {

    static String clean(String input){
        String rsp = input.trim();
        rsp = rsp.replaceAll("\\s+"," ");
        rsp=rsp.toLowerCase();
        return rsp;
    }

    static ArrayList<station> checkroute(ArrayList<station> route, String from, String to)
    {
        from = clean(from);
        to = clean(to);
        boolean fromFound = false;
        boolean toFound = false;

        for (station s1 : route) {

            if (clean(s1.routename).replace(" ", "").equals(from.replace(" ", "")))  {
                fromFound = true;
            }

            if (clean(s1.routename).replace(" ", "").equals(from.replace(" ", ""))) {
                toFound = true;
            }
        }

        if (fromFound && toFound) {
            return route;
        }

        return null;
    }


    static ArrayList<station> findRoute(String from, String to)
    {

        ArrayList<station> route;

        route = checkroute(TrainRoute.route1, from, to);

        if (route != null) {

            System.out.println("Train found");
            return route;
        }


        route = checkroute(TrainRoute.route2, from, to  );

        if (route != null) {

            System.out.println("Train found");
            return route;
        }


        route = checkroute(TrainRoute.route3, from, to);

        if (route != null) {

            System.out.println("Train found");
            return route;
        }


        System.out.println("Direct route not available");

        return null;
    }


    static int getDistance(ArrayList<station> route, String stationName) {
        String name = clean(stationName).replace(" ", "");
        for (station s1 : route) {



                if (clean(s1.routename).replace(" ", "").equals(name)) {
                    return s1.distance;

            }
        }

        return -1;
    }

    static String getStationName(ArrayList<station> route, String stationName) {

        String name = clean(stationName).replace(" ", "");

        for (station s1 : route) {

            if (clean(s1.routename).replace(" ", "").equals(name)) {
                return s1.routename;
            }
        }

        return null;
    }
}