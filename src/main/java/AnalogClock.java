import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int time = scanner.nextInt();
        int minPerDeg = 2;
        int degPerMin = 6;
        int minPast;
        int minHandDeg;

        /*
         *  Finds the number of minutes past and converts it
         *  into how many degrees the hand would pass on a Clock
         *  by using the formula for every 10 minutes, 60 degrees 
         *  pass on a minute hand 
         */
        minPast = time % 60;
        minPast = minPast*minPerDeg;
        minHandDeg = minPast*degPerMin;
        System.out.print(minHandDeg);

        // closing the scanner object
        scanner.close();
    }
}
