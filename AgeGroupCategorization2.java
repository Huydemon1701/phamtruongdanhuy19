package Lec4_ConditionalExecution;
import java.util.Scanner;
public class AgeGroupCategorization2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so tuoi: ");
        int tuoi = scanner.nextInt();
        if (tuoi >= 0 && tuoi <= 12) {
            System.out.println("Child (Tre em)");
        } else if (tuoi >= 13 && tuoi <= 19) {
            System.out.println("Teenager (Thieu nien)");
        } else if (tuoi >= 20 && tuoi <= 59) {
            System.out.println("Adult (Nguoi lon)");
        } else if (tuoi >= 60) {
            System.out.println("Senior (Nguoi cao tuoi)");
        } else {
            System.out.println("Tuoi khong hop le!");
        }
        scanner.close();
    }
}
