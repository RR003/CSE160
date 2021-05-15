package hw3;

public class Package {
    private String sender;
    private String recipient;
    private int cost = 0;
    private int distance;

    public Package(String sender,  String recipient, int distance) {
        this.sender = sender;
        this.recipient = recipient;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static int shippingCost(Package[] packages, int[] cost) {
        int totalCost = 0;
        for (int i = 0; i < packages.length; i++) {
            totalCost += cost[getCost(packages[i].getDistance())];
        }
        return totalCost;
    }

    public static int getCost(int distance) {
        if (distance < 100) return 0;
        else if (distance < 300) return 1;
        else if (distance < 500) return 2;
        return 3;
    }

    public static void main(String[] args) {
        Package[] packages1 = {new Package("Monmouth", "Appleby", 144),

                new Package("Larkinge", "Ballachulish", 65),

                new Package("Malrton", "Auchtermuchty", 872),

                new Package("Monmouth", "Anghor Thom", 937)};

        int[] costSchedule1 = {10, 16, 37, 49};

        System.out.println(shippingCost(packages1, costSchedule1));
    }

}
