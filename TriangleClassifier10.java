package Lec4_ConditionalExecution;
import java.util.Scanner;
public class TriangleClassifier10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap canh thu hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhap canh thu ba: ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Day la tam giac deu.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can.");
            } else {
                System.out.println("Day la tam giac thuong.");
            }
        } else {
            System.out.println("Ba canh nay khong tao thanh mot tam giac.");
        }
        scanner.close();
    }
}
