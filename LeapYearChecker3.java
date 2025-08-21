package Lec4_ConditionalExecution;
import java.util.Scanner;
public class LeapYearChecker3 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot nam: ");
        int nam = scanner.nextInt();
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            System.out.println(nam + " la nam nhuan");
        } else {
            System.out.println(nam + " khong phai la nam nhuan");
        }
        scanner.close();
    }
} 