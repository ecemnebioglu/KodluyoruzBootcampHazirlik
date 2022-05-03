public class Main {
    static void print(int[][] arr) {
        System.out.println("Matris : ");
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] transpose, int[][] matrix) {
        System.out.println("Transpoze : ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        for (int[] row : transpose) {
            for (int col : row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {2, 3, 4},
                {5, 6, 4}
        };
        int[][] transpose1 = new int[3][2];
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transpose2 = new int[3][2];

        print(matrix1);
        transpose(transpose1, matrix1);

        print(matrix2);
        transpose(transpose2, matrix2);
    }
}