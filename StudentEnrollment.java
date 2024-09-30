import java.util.Scanner;

public class StudentEnrollment {
    
    // Method to compute the enrollment fee
    public static int computeEnrollmentFee(int totalUnits) {
        int feePerUnit = 1000;  // Fee per unit is 1000
        return totalUnits * feePerUnit;  // Total fee is units multiplied by the fee per unit
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        // Input course name
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        // Input course code
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        // Input number of units
        int numberOfUnits;
        do {
            System.out.print("Enter number of units (Maximum number of subjects 10): ");
            numberOfUnits = scanner.nextInt();
            if (numberOfUnits > 10) {
                System.out.println("You cannot enroll in more than 10 units. Try again.");
            }
        } while (numberOfUnits > 10);  // Ensure the user cannot enter more than 10 units
        
        System.out.println("------------------------------------------------");
        
        // Compute total enrollment fee
        int totalFee = computeEnrollmentFee(numberOfUnits);
        
         // Output student information
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Total Enrollment Fee: " + totalFee);

        System.out.println("------------------------------------------------");
        
        // Ask for payment
        System.out.print("Enter payment amount: ");
        int paymentAmount = scanner.nextInt();

        // Check if payment is fully paid, partially paid, or unpaid
         if (paymentAmount == totalFee) {
            System.out.println("Payment Status: Fully Paid");
        } else if (paymentAmount < totalFee) {
            System.out.println("Payment Status: Partial Payment");
            System.out.println("Amount Paid: " + paymentAmount);
        } else {
            System.out.println("Payment Status: Overpaid. Please adjust the payment.");
        }

        // Close the scanner object
        scanner.close();
    }
}
