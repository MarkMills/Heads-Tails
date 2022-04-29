//////////////////////////////////////////////////////////////////////////////
//MarkAlan Mills
// CSC 160 Computer Science I, section 680
// Apr 1, 2022
// Homework 4 - Programming Exercise 8.11 (page 311) Heads or Tails
//////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class HeadsTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511:");
        int num = input.nextInt();
        int binary[] = new int[9];
        int k = 8;
        while (num > 0) {
            binary[k--] = num % 2;
            num = num / 2;
        }
        boolean matrix[][] = new boolean[3][3];
        k = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (binary[k++] == 1) {
                    matrix[i][j] = true;
                }else {
                    matrix[i][j] = false;
                }
            }
        }
        for (int i = 0; i < 3; ++i) {
            System.out.println("");
            for (int j = 0; j < 3; ++j) {
                if (matrix[i][j]) {
                    System.out.print("T" + " ");
                } else {
                    System.out.print("H" + " ");
                }
            }
        }
    }
}
