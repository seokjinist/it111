import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String specials = "";
        String coffee = "";
        double price = 0;
        int quantity;

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        while (true) {
            specials = input.next();

            if (specials.equalsIgnoreCase("Saturday") || specials.equalsIgnoreCase("Sunday")) {
                System.out.println("Please enter a weekday, not weekend!");
                continue;
            }

            switch (specials.toLowerCase()) {
                case "monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                }
                case "tuesday" -> {
                    coffee = "Frappuccino";
                    price = 5.95;
                }
                case "wednesday" -> {
                    coffee = "Cappuccino";
                    price = 4.35;
                }
                case "thursday" -> {
                    coffee = "Regular Joe";
                    price = 2.95;
                }
                case "friday" -> {
                    coffee = "Green Tea Latte";
                    price = 6.95;
                }
                default -> {
                    System.out.println("Invalid day entered. Please enter a valid weekday.");
                    continue;
                }
            }
            break;
        }

        System.out.println(capitalizeFirstLetter(specials) + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + "s would you like to order?");
        quantity = input.nextInt();

        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
        } else if (quantity == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        } else {
            System.out.println(quantity + " " + coffee + "s have been ordered totalling $" + String.format("%.2f", price * quantity) + " dollars!");
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
