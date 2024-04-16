import java.util.Scanner;

public class nptel {
    public static char calculateGrade(int marks) {
        char grade='A';
        if(marks>=80){
            grade='A';
        }
        if (marks>=70 && marks<=79){
            grade='B';
        }
        if(marks>=60 && marks<=69){
            grade='C';

        }
        if(marks>=50 && marks<=59){
            grade='D';
        }
        if(marks >=40 && marks<=49){
            grade='P';
        }
        if(marks<40){
            grade='F';
        }
        return grade;
    }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            // System.out.print("Enter the numerical score: ");
            int score = scanner.nextInt();
            scanner.close();
            // If score is greater than 100 or less than 0, print "Invalid Input"
            if (score > 100 || score < 0) {
                System.out.println("Invalid Input");
                return;
            }
            char grade = calculateGrade(score);
            System.out.println("Grade: " + grade);


    }
}