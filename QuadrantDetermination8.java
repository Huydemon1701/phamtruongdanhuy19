package Lec4_ConditionalExecution;
import java.util.Scanner;
public class QuadrantDetermination8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap toa do x: ");
        double x = scanner.nextDouble();
        System.out.print("Nhap toa do y: ");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("Diem nam o goc phan tu thu 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Diem nam o goc phan tu thu 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Diem nam o goc phan tu thu 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Diem nam o goc phan tu thu 4");
        } else {
            System.out.println("Diem nam tren truc toa đo");
        }
        scanner.close();
    }
}
