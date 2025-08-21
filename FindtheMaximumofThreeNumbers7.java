package Lec4_ConditionalExecution;
import java.util.Scanner;
public class FindtheMaximumofThreeNumbers7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào ba số nguyên
        System.out.print("Nhap so thu nhat: ");
        int so1 = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int so2 = scanner.nextInt();

        System.out.print("Nhap so thu ba: ");
        int so3 = scanner.nextInt();

        int max;
        if (so1 >= so2 && so1 >= so3) {
            max = so1;
        } else if (so2 >= so1 && so2 >= so3) {
            max = so2;
        } else {
            max = so3;
        }
        System.out.println("So lon nhat la: " + max);

        scanner.close();
    }
}
