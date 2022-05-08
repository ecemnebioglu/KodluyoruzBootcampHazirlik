import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Oyun Boyutunu Giriniz\nSatır : ");
        int fieldRow = sc.nextInt();
        System.out.print("Sütun : ");
        int fieldCol = sc.nextInt();

        Minesweeper mineField = new Minesweeper(fieldRow,fieldCol);
        mineField.startGame();
    }
}
