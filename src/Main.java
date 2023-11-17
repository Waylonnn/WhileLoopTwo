import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean valid = false;
        double sideOne = 0;
        double sideTwo = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter Length of Side 1:");
            if(scan.hasNextDouble()){
                sideOne = scan.nextDouble();
                scan.nextLine();
                if(sideOne > 0){
                    valid = true;
                } else
                    System.out.println("You have an invalid side length. Please try again.");
            }else{
                scan.nextLine();
                System.out.println("You must enter a number!");
            }
        }while(!valid);
        valid = false;
        do{
            System.out.println("Enter Length of Side 2:");
            if(scan.hasNextDouble()){
                sideTwo = scan.nextDouble();
                scan.nextLine();
                if(sideTwo > 0){
                    valid = true;
                } else
                    System.out.println("You have an invalid side length. Please try again.");
            }else{
                scan.nextLine();
                System.out.println("You must enter a number!");
            }
        }while(!valid);

        System.out.printf("Side 1: %.2f\n", sideOne);
        System.out.printf("Side 2: %.2f\n", sideTwo);
        System.out.printf("Area: %.2f\n", sideOne*sideTwo);
        System.out.printf("Perimeter: %.2f\n", ((sideOne*2) + (sideTwo*2)));
        System.out.printf("Diagonal: %.2f", Math.sqrt((Math.pow(sideOne, 2) + Math.pow(sideTwo, 2))));
    }
}