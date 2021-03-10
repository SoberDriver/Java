import java.util.Arrays;

public class HomeWorkTwo {

    public static void main(String[] args) {
        //First task:
        int[] arrayOne = {1, 1, 1, 0, 0, 1, 0, 1 };
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == 1)  {
                arrayOne[i] = 0;
            } else if (arrayOne[i] ==0 ){
                arrayOne[i] = 1;
            }
        }
        // Использовал в каждом задании sout для собственной проверки :)) Ну и тебе проще проверять)
        //   System.out.println(Arrays.toString(arrayOne));

        // Second task:
        int[] arrayTwo = new int[8];
        for ( int i = 0; i <= 7; i++) {
            arrayTwo[i] = i * 3;
        }
        // System.out.println(Arrays.toString(arrayTwo));

        // Third task:
        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < 6) {
                arrayThree[i] = arrayThree[i] * 2;
            }
        }
        //System.out.println(Arrays.toString(arrayThree));

        // Fourth task:
        // первая диагональ
        int[][] arrayFour = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arrayFour[i][j] = 1;
                }
            }
        }
        //вторая диагональ
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= 0 ; j--) {
                if (i + j == 3) {
                    arrayFour[i][j] = 1;
                }
            }
        }

        //printArr(arrayFour);

        // Fifth task:
        int[] arrayFive = {2, 4, 5, 13, 2, 1, 8, 12};
        int max = arrayFive[0];
        int min = arrayFive[0];
        for (int i = 0; i < arrayFive.length; i++) {
            if (arrayFive[i] > max) {
                max = arrayFive[i];
            }
            if (arrayFive[i] < min ) {
                min = arrayFive[i];
            }
        }
        //System.out.println(max);
        // System.out.println(min);
        taskSeven();
    }
    // Sixth task
    public static boolean taskSix() {
        int[] arraySix = {1, 2, 3, 5, 1, 2, 3};
        int left = 0;
        int right = 0;
        for (int i = 0; i < arraySix.length; i++) {
            left += arraySix[i];
            for (int j = arraySix.length + 1; j > 0; j--) {
                right += arraySix[j];
            }
            if (left == right) {
                return true;
            }
        } return true;
    }

//    public static void printArr(int [][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//    }

    // Получилось только сделать сдвиг на 1 ))
    public static void taskSeven() {
        int a = 1;
        int[] arraySeven = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int b = arraySeven[0];
        for (int i = 0; i < arraySeven.length  -a; i++) {
            arraySeven[i] = arraySeven[i + a];
            if (arraySeven[i + a] == arraySeven.length) {
                arraySeven[arraySeven.length - a] = b;

            }

        }

        System.out.println(Arrays.toString(arraySeven));
    }

}





