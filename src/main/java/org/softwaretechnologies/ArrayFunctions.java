package org.softwaretechnologies;

public final class ArrayFunctions {

    private ArrayFunctions() {
    }

    /**
     * Функция, меняющая порядок элементов в массиве array на обратный.
     *
     * @param array массив, который будет перевернут.
     */
    public static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    /**
     * Функция, заменяющая строки матрицы на столбцы матрицы. Пример:
     * 1  2  3     1  4  7
     * 4  5  6     2  5  8
     * 7  8  9     3  6  9
     * Функция работает только с квадратными матрицами.
     * Если матрица не квадратная, то выведете на экран сообщение:
     * Матрица не квадратная
     *
     * @param matrix матрица, в которой столбцы будут заменены на строки.
     */
    public static void rotateMatrix(int[][] matrix) {
        int ln = matrix.length;
        int h = matrix[0].length;
        if ( ln != h) {
            System.out.println("матрица не квадратная");
            return;
        }
        for (int i = 0; i < ln; i++) {
            for (int j = i; j < h; j ++){
                int buf = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buf;
            }
        }
    }
}