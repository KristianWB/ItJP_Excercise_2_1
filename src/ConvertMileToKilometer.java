import java.util.Scanner;

public class ConvertMileToKilometer {
    public static void main(String[] args) {
        // Create a scanner (variable) for miles
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of miles: ");
        double mile = input.nextDouble();

        // Convert miles to kilometers
        double unargumentedKilometers = mile * 1.6;
        // double var1 = unargumentedKilometers * 100;
        // double intermediaryKilometers2 = (int) intermediaryKilometers1 / 10;

        //Short the kilometers number so that it only figures with 2 decimals
        //First eliminate all decimals after the second one
        double var3 = unargumentedKilometers % 1;
        double var4 = var3 * 100;
        double var5 = (int)var4;
        double var6 = var5 / 100;

        //Second: we now cut the unargumented kilometers number so that only the part before the digits are counting
        double var7 = (int)unargumentedKilometers;

        //Third: Now we couple the cutnumber of the kilometers with the 2 decimals so that we get the kilometerconversio with 2 decimals
        double argumentedKilometers = var7 + var6;


        // double roundOffKilometers = (int)kilometers;

        // System output kilometers
        // System.out.print("kilometers traversed is:" + roundOffKilometers + "km");
        System.out.print("kilometers traversed is: " + argumentedKilometers + "km");

    }
}