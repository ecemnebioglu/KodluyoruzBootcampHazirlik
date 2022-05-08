import java.util.Scanner;
import java.util.Random;

public class Minesweeper {
    int fieldRow;
    int fieldCol;
    int mineDensity;
    int[][] field;
    int[][] mineMap;
    boolean game = true;


    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    Minesweeper(int fieldRow, int fieldCol) {
        this.fieldRow = fieldRow;
        this.fieldCol = fieldCol;
        this.field = new int[fieldRow][fieldCol];
        this.mineMap = new int[fieldRow][fieldCol];
    }

    void printMineMap(int[][] arr) {
        System.out.print("\t ");
        for (int i = 0; i < fieldCol; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int j = 0; j < fieldCol; j++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < arr[0].length; j++) {
                if (mineMap[i][j] == -1) System.out.print(" * ");
                else if (field[i][j] == 0) System.out.print(" - ");
                else if (field[i][j] == -2) System.out.print(" - ");
                else System.out.print(" " + field[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printVisible(int[][] arr) {
        System.out.print("\t ");
        for (int i = 0; i < fieldCol; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int j = 0; j < fieldCol; j++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < arr[0].length; j++) {
                if (field[i][j] == 0) System.out.print(" - ");
                else if (field[i][j] == -2) System.out.print(" 0 ");
                else System.out.print(" " + field[i][j] + " ");
            }
            System.out.println();
        }
    }

    void startGame() {
        int mineFree = 0;
        int fieldArea = fieldRow*fieldCol;
        mineLocation();
        //printMineMap(mineMap);
        //System.out.println();
        while (game) {
            System.out.println();
            System.out.println("========== °˖✧('▿')✧˖° ==========\n");
            printVisible(field);
            move();
            mineFree++;
            if (mineFree == (fieldArea- fieldArea/ 4)) {
                System.out.println("\n========== °˖✧(♡‿♡)✧˖° ==========\n\n\t\tYou Win!!!\n");
                printMineMap(mineMap);
                game = false;
            }
        }
    }

    void move() {

        System.out.print("Kontrol edilmesi istenen konumun\nSatırı : ");
        int row = sc.nextInt();
        System.out.print("Sütunu : ");
        int col = sc.nextInt();
        if (row < 0 || row >= fieldRow) {
            System.out.print("Geçersiz Satır\nYeni satır giriniz :  ");
            row = sc.nextInt();
        }
        if (col < 0 || col >= fieldCol) {
            System.out.print("Geçersiz Sütun\nYeni sütun giriniz :  ");
            col = sc.nextInt();
        }
        if (mineMap[row][col] == -1) {
            System.out.println("========== °˖✧(T▿T)✧˖° ==========\n\n\t\tGAME OVER!!!\n\nMevcut Mayın Konumları :");
            printMineMap(mineMap);
            game = false;
        } else {
            checkMineDensity(row, col);
        }
    }

    void checkMineDensity(int row, int col) {
        if (mineMap[row][col] == 0) {
            if (row != 0) {
                if ((col != 0) && mineMap[row - 1][col - 1] == -1) {
                    field[row][col]++;
                }
                if (mineMap[row - 1][col] == -1) {
                    field[row][col]++;
                }
                if ((col < fieldCol - 1) && mineMap[row - 1][col + 1] == -1) {
                    field[row][col]++;
                }
                if ((col != 0) && mineMap[row][col - 1] == -1) {
                    field[row][col]++;
                }
                if ((col < fieldCol - 1) && mineMap[row][col + 1] == -1) {
                    field[row][col]++;
                }
                if ((col != 0) && (row < fieldRow - 1) && mineMap[row + 1][col - 1] == -1) {
                    field[row][col]++;
                }
                if ((row < fieldRow - 1) && mineMap[row + 1][col] == -1) {
                    field[row][col]++;
                }
                if ((row < fieldRow - 1) && (col < fieldCol - 1) && mineMap[row + 1][col + 1] == -1) {
                    field[row][col]++;
                }
            } else if (row == 0 && col == 0) {
                if ((col < fieldCol - 1) && mineMap[row][col + 1] == -1) {
                    field[row][col]++;
                }
                if ((row < fieldRow - 1) && mineMap[row + 1][col] == -1) {
                    field[row][col]++;
                }
                if ((row < fieldRow - 1) && (col < fieldCol - 1) && mineMap[row + 1][col + 1] == -1) {
                    field[row][col]++;
                }
            } else if (row == 0) {
                if ((col != 0) && mineMap[row][col - 1] == -1) {
                    field[row][col]++;
                }
                if ((col < fieldCol - 1) && mineMap[row][col + 1] == -1) {
                    field[row][col]++;
                }
                if ((col != 0) && (row < fieldRow - 1) && mineMap[row + 1][col - 1] == -1) {
                    field[row][col]++;
                }
                if ((row < fieldRow - 1) && mineMap[row + 1][col] == -1) {
                    field[row][col]++;
                }
                if ((row < fieldRow - 1) && (col < fieldCol - 1) && mineMap[row + 1][col + 1] == -1) {
                    field[row][col]++;
                }
            } else if (col == 0) {
                if (mineMap[row - 1][col] == -1) {
                    field[row][col]++;
                }
                if ((col < fieldCol - 1) && mineMap[row - 1][col + 1] == -1) {
                    field[row][col]++;
                }
                if ((col < fieldCol - 1) && mineMap[row][col + 1] == -1) {
                    field[row][col]++;
                }
                if ((row < fieldRow - 1) && mineMap[row + 1][col] == -1) {
                    field[row][col]++;
                }
                if ((row < fieldRow - 1) && (col < fieldCol - 1) && mineMap[row + 1][col + 1] == -1) {
                    field[row][col]++;
                }
            }
            if (field[row][col] == 0) {
                field[row][col] = -2;
            }
        }
    }

    void mineLocation() {
        mineDensity = (fieldRow * fieldCol) / 4;
        int mine = 0;
        while (mine != mineDensity) {
            int row = rand.nextInt(fieldRow);
            int col = rand.nextInt(fieldCol);
            if (mineMap[row][col] != -1) {
                mineMap[row][col] = -1;
                mine++;
            }
        }
    }
}
