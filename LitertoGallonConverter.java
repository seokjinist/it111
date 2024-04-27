public class LitertoGallonConverter {
    public static void main(String[] args) {

        double lit, gal;
        int counter = 0;

        for (gal = 1; gal <= 100; gal = gal + 4) {
            lit = (gal * 3.79);
            lit = Math.round(lit * 100.0) / 100.0;
            System.out.println(lit + " Liters = " + gal + " Gallon" + (gal != 1 ? "s" : "") + ".");
            counter++;

            // every 5th line, prints a blank line
            if (counter == 5) {
                System.out.println("");
                counter = 0; // resets the line counter

            }
        }

            System.out.println("All done!");


    }

}

