import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String specials = "";
        String coffee = "";
        double price = 0;
        int quantity;

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        boolean validDay = false;
        while (!validDay) {
            specials = input.next();

            if (specials.equalsIgnoreCase("Saturday") || specials.equalsIgnoreCase("Sunday")) {
                System.out.println("Please enter a weekday, not weekend!");
                continue;
            }

            switch (specials.toLowerCase()) {
                case "monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                    validDay = true;
                }
                case "tuesday" -> {
                    coffee = "Frappuccino";
                    price = 5.95;
                    validDay = true;
                }
                case "wednesday" -> {
                    coffee = "Cappuccino";
                    price = 4.35;
                    validDay = true;
                }
                case "thursday" -> {
                    coffee = "Regular Joe";
                    price = 1.0;
                    validDay = true;
                }
                case "friday" -> {
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    validDay = true;
                }
                default -> {
                    System.out.println("Invalid day entered. Please enter a valid weekday.");
                }
            }
        }

        System.out.println(capitalizeFirstLetter(specials) + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + "s would you like to order?");

        while (true) {
            if (input.hasNextInt()) {
                quantity = input.nextInt();
                break;
            } else {
                System.out.println("Please enter a valid number for quantity!");
                input.next(); // Clear invalid input
            }
        }

        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!"); // if they order O drinks
        } else if (quantity == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today totalling $" + String.format("%.2f", price * quantity) + " dollars!");
        } else if (quantity <= 4 ) {
            System.out.println(+ quantity + " " + coffee + "s  have been ordered totalling $" + String.format("%.2f", price * quantity) + " dollars!");
        } else {
            double totalCost = price * quantity;
            if (quantity >= 10) {  // 10 and over drinks
                totalCost *= 0.80; // A 20% discount
                System.out.println("A bigger group discount! Your regular price is " + String.format("%.2f", price * quantity) + " dollars!");

        } else if (quantity >= 5) { // 5 and over drinks
                totalCost *= 0.90; // A 10% discount
                System.out.println("Looks like you qualify for a group discount! Your regular price is " + String.format("%.2f", price * quantity) + " dollars!");
            }
            System.out.println("You have ordered " +quantity + " " + coffee + "s but will be only charged " + String.format("%.2f", totalCost) + " dollars!");
        }

        input.close();
    }

    // Method that will capitalize the first letter of a string
    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
