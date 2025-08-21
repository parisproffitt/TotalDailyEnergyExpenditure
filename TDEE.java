
/**
 * The function of my program is to calculate user's total daily energy expidenture.
 *
 * @author Paris Proffitt
 * @version October 5th, 2024
 */

import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User Questions
        System.out.print("Please enter your name (first last): ");
        String name = scanner.nextLine();

        System.out.print("Please enter your Basal Metabolic Rate (BMR): ");
        double bmr = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Please enter your gender (M/F): ");
        String gender = scanner.nextLine();

        //Activity Level Menu
        System.out.println();
        System.out.println("Select Your Activity Level:");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");

        System.out.print("Enter the letter corresponding to your activity level: ");
        String activityLevel = scanner.nextLine();
        
        double activityFactor; 
        
        if ((gender.equals("M")) || (gender.equals("m"))) {
            if ((activityLevel.equals("A")) || (activityLevel.equals("a"))) {
                activityFactor = 1.0; 
            }
            else if ((activityLevel.equals("B")) || (activityLevel.equals("b"))) {
                activityFactor = 1.3; 
            }
            else if ((activityLevel.equals("C")) || (activityLevel.equals("c"))) {
                activityFactor = 1.6;
            }
            else if ((activityLevel.equals("D")) || (activityLevel.equals("d"))) {
                activityFactor = 1.7;
            }
            else if ((activityLevel.equals("E")) || (activityLevel.equals("e"))) {
                activityFactor = 2.1;
            }
            else if ((activityLevel.equals("F")) || (activityLevel.equals("f"))) {
                activityFactor = 2.4;
            }
            else {
                System.out.println();
                System.out.println("INVALID INPUT : USING DEFAULT VALUES");
                activityFactor = 0.0;
            }
        } else if ((gender.equals("F")) || (gender.equals("f"))) {
            if ((activityLevel.equals("A")) || (activityLevel.equals("a"))) {
                activityFactor = 1.0;
            }
            else if ((activityLevel.equals("B")) || (activityLevel.equals("b"))) {
                activityFactor = 1.3;
            }
            else if ((activityLevel.equals("C")) || (activityLevel.equals("c"))) {
                activityFactor = 1.5;
            }
            else if ((activityLevel.equals("D")) || (activityLevel.equals("d"))) {
                activityFactor = 1.6;
            }
            else if ((activityLevel.equals("E")) || (activityLevel.equals("e"))) {
                activityFactor = 1.9;
            }
            else if ((activityLevel.equals("F")) || (activityLevel.equals("f"))) {
                activityFactor = 2.2;
            }
            else {
                System.out.println();
                System.out.println("INVALID INPUT : USING DEFAULT VALUES");
                activityFactor = 0.0;
            }
        } else {
            System.out.println();
            System.out.println("INVALID INPUT : USING DEFAULT VALUES");
            activityFactor = 0.0;
        }
        
        //Calculation
        double tdee = bmr * activityFactor;
        
        //Results
        System.out.println();
        System.out.println("Your results:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("BMR: " + bmr);
        System.out.println("Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + tdee + " calories");
        scanner.close();
    }
}