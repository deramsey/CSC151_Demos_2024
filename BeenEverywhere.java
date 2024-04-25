import java.util.Scanner;

class BeenEverywhere {
    Scanner in = new Scanner(System.in);
    String[] cities;
    int result;

    BeenEverywhere() {
        cities = getPlaces();
        result = getUnique(cities);
    }

    public static void main(String[] args) {
        BeenEverywhere obj = new BeenEverywhere();
        System.out.println(obj.result);

    }

    String[] getPlaces() {
        System.out.print("Enter number of trips: ");
        String[] trips = new String[in.nextInt()];
        in.nextLine();

        for (int i = 0; i < trips.length; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            trips[i] = in.nextLine();
        }

        return trips;
    }

    int getUnique(String[] cities) {
        int numUnique = 0;
        boolean found = false;

        for (int i = 0; i < cities.length; i++) {
            if (i == 0) {
                numUnique++;
            } else {
                for (int j = 0; j < i; j++) {
                    if (cities[j].equals(cities[i])) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    numUnique++;
                } else {
                    found = false;
                }
            }
        }

        return numUnique;
    }
}
