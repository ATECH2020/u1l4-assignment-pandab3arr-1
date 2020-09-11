import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int deltaH;
        int deltaM;
        int deltaS;
        int secPast;

        /*
         *  Finds the seconds that went by through the given time frame by finding delta hours, delta minutes and delta seconds and then adding them all up after everything gets converted into seconds.
         */

        deltaH = hours2 - hours1;
        deltaM = minutes2 - minutes1;
        deltaS = seconds2 - seconds1;
        secPast = (deltaH * 3600) + (deltaM * 60) + (deltaS);
        System.out.print(secPast);

        // closing the scanner object
        scanner.close();
    }
}
