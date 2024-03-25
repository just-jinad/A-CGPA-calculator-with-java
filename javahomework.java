import java.util.*;
public class javahomework {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your class");
        String className = scanner.nextLine();

        double[] courseScores = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter score for Course " + (i + 1) + ":");
            courseScores[i] = scanner.nextDouble();
        }
        scanner.close();
        double cgpa = calculateCGPA(courseScores);
        
        System.out.println("Hello " + name);
        System.out.println("Class: " + className);
        System.out.println("Dear " + name + " your current CGPA is " + cgpa);
    }

    public static double calculateCGPA(double[] courseScores) {
        double totalScore = 0;
        for (double score : courseScores) {
            totalScore += measureGradePoint(score);
        }
        double averageScore = totalScore / courseScores.length;
        return averageScore;
    }

    public static double measureGradePoint(double score) {
        if (score >= 90)
            return 4.0;
        else if (score >= 85)
            return 3.75;
        else if (score >= 80)
            return 3.5;
        else if (score >= 75)
            return 3.25;
        else if (score >= 70)
            return 3.0;
        else if (score >= 65)
            return 2.75;
        else if (score >= 60)
            return 2.5;
        else if (score >= 55)
            return 2.25;
        else if (score >= 50)
            return 2.0;
        else
            return 1.0;

    }

}