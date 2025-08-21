package Lec4_ConditionalExecution;
import java.util.Scanner;
public class AbsoluteValuewithTernaryOperator9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        int so = scanner.nextInt();
        int abs = (so >= 0) ? so : -so;
        System.out.println("Gia tri tuyet doi la: " + abs);
        scanner.close();
    }
}
