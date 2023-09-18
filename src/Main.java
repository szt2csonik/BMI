import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please your weight in kg:");
        double weight=scanner.nextDouble();
        System.out.print("Please enter your height in cm:");
        double height=scanner.nextDouble();
        System.out.println("Your BMI is:" + (weight/Math.pow(height/100,2)));

    }
}