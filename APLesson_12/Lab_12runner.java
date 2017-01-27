import java.util.Scanner;

public class Lab_12runner {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("*INPUT (DISTANCE)-(HOURS)-(MINNUTES)*");
        double dist = keyboard.nextDouble();
        int time1 = keyboard.nextInt();
        int time2 = keyboard.nextInt();
        MilesPerHour object = new MilesPerHour(dist,time1,time2);
        object.setValues(dist, time1, time2);
        object.calcMPH();
        System.out.println("MPH = "+ object.getMph());

    }

}