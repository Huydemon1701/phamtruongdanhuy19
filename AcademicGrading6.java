package Lec4_ConditionalExecution;
import java.util.Scanner;
public class AcademicGrading6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter average score (0-10): ");
        double score = scanner.nextDouble();
        if (score >= 9.0 && score <= 10.0) {
            System.out.println("Xuat sac");
        } else if (score >= 8.0 && score < 9.0) {
            System.out.println("Tot");
        } else if (score >= 6.5 && score < 8.0) {
            System.out.println("Kha");
        } else if (score >= 5.0 && score < 6.5) {
            System.out.println("Trung binh");
        } else if (score >= 0 && score < 5.0) {
            System.out.println("Khong dat");
        } else {
            System.out.println(" Diem khong hop le nhap lai tu 0-10.");
        }
        scanner.close();
    }
}
