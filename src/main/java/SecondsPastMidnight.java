import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int seconds = scanner.nextInt();
        int hours;
        int minutes;

        //Finds hours by deviding seconds by 3600
        //Finds minutes by deviding seconds by 60. Then it prints the //results
        hours = seconds / 3600;
        minutes = seconds / 60;
        System.out.print(hours + " " + minutes);

        // closing the scanner object
        scanner.close();
    }
}
