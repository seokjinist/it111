package package_person_homework;

public class PersonDetails2 {
    // this file will have a main method
    public static void main (String[]args) {

        Person2 firstPerson = new Person2();
        Person2 secondPerson = new Person2();

        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2020;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2009;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        firstPerson.display();
        double monthlyRateFirstPerson = firstPerson.getRate(0);
        double genderAdjustmentFirstPerson = firstPerson.assumeGender(0);
        double finalRateFirstPerson = firstPerson.adjustRateForCar(monthlyRateFirstPerson + genderAdjustmentFirstPerson);
        double carAdjustmentFirstPerson = firstPerson.adjustRateForCar(0);
        System.out.println("Preliminary rate for " + firstPerson.name + ": " + monthlyRateFirstPerson + " dollars");
        System.out.println("Adjustments for gender and age: " + genderAdjustmentFirstPerson + " dollars");
        System.out.println("Adjustments based on car's age: " + carAdjustmentFirstPerson);
        System.out.println("Here is " + firstPerson.name + "'s total monthly premium: " + finalRateFirstPerson + " dollars");
        System.out.println();

        secondPerson.display();
        double monthlyRateSecondPerson = secondPerson.getRate(0);
        double genderAdjustmentSecondPerson = secondPerson.assumeGender(0);
        double finalRateSecondPerson = secondPerson.adjustRateForCar(monthlyRateSecondPerson + genderAdjustmentSecondPerson);
        double carAdjustmentSecondPerson = secondPerson.adjustRateForCar(0);
        System.out.println("Preliminary rate for " + secondPerson.name + ": " + monthlyRateSecondPerson + " dollars");
        System.out.println("Adjustments for gender and age: " + genderAdjustmentSecondPerson + " dollars");
        System.out.println("Adjustments based on car's age: " + carAdjustmentSecondPerson);
        System.out.println("Here is " + secondPerson.name + "'s total monthly premium: " + finalRateSecondPerson + " dollars");
        System.out.println();
    }
}