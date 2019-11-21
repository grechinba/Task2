import java.text.ParseException;

/**
 *1.  * Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 *
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
 * с детализацией, в какой именно ячейке лежат неверные данные.
 *
 * 3. методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException
 * и вывести результат расчета.
 *
 *
 */

public class Exeptions {
    int size=4;
    static String[][] arr = {{"1","2","3","4","41"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};


    public  static double sum (String[][] _arr, int _size){
        int sum_arr=0;

        for (int i=0;i<_size;i++) {
            for (int j = 0; j < _size; j++) {
                try {
                    sum_arr = sum_arr + Integer.parseInt(_arr[i][j]);
                }
                catch (NumberFormatException e) {
                    System.out.println("Ошибка индексации массива в строке " + j + " столбце " + i + ". " + e);
                    //sum_arr = "Н/Д";
                    break;}
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ошибка размерности массива " + e);
                    break;}
                catch (NegativeArraySizeException e) {
                    System.out.println("Ошибка размерности массива " + e);
                    //  sum_arr = "***Н/Д***";
                    break;}
                catch (ArrayStoreException e) {
                    System.out.println("Ошибка записи массива " + e);
                    //  sum_arr = "***Н/Д***";
                    break;}
            }
        }
       return sum_arr;
    }

    public static void main(String[] args) {

        System.out.println("Сумма элементов массива "+sum(arr,4));


    }

}
