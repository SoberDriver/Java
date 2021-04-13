public class LessonTwo {
    public static void main(String[] args) {
        String[][] first = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
                };
        String[][] second = {
                {"135", "2", "1", "3"},
                {"13", "2", "1", "4"},
                {"13", "2", "1", "3"},
                {"13", "2", "1", "3"}
        };
        String[][] third = {
                {"13", "2", "a", "3"},
                {"13", "2", "1", "3"},
                {"13", "2", "1", "3"},
        };
        try {
            ExceptionCatcher(first);
            ExceptionCatcher(second);
            ExceptionCatcher(third);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void ExceptionCatcher(String[][] str) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
    if (str.length != 4) throw new MyArraySizeException("Количество строк массива неправильное!!!");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length !=4) throw new MyArraySizeException("Количество столбцов массива неправильное!!!");
            for (int j = 0; j < str[i].length; j++) {
                if (!str[i][j].matches("[0-9]+")) throw new MyArrayDataException(String.format("Формат ячейки (%d , %d) неверный!!!",i,j));
                    sum += Integer.parseInt(str[i][j]);
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
