import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Arrays Lesson One");
        System.out.println("Task 1");

        // целочисленный массив, с помощью ключевого слова new
        int [] arr = new int [] {1, 2, 3}; // целочисленный массив, с помощью ключевого слова new

        // массив для дробных чисел
        double [] arr1 = {1.57, 7.654, 9.986};

        // массив с самостоятельным выбором типа данных, пусть будет строка
        String [] arr2 = new String[] {"One", "Two", "Three", "Four", "Five" };

        System.out.println("Task 2");
        // выводим в строчку элементы первого массива
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }

        // выводим в строчку элементы второго массива
        for (int i = 0; i < arr1.length; i++) {
            if(i == arr1.length - 1) {
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }


        // выводим в срочку эдементы третьего массива
        for (int i = 0; i < arr2.length; i++) {
            if(i == arr2.length - 1) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }

        System.out.println("Task 3");
        // выводим элементы первого массива в обратном порядке
        for (int j = arr.length - 1; j >= 0; j--) {
            if(j == 0) {
                System.out.println(arr[j]);
                break;
            }
            System.out.print(arr[j] +  ", ");
        }

        // выводим элементы второго массива в обратном порядке
        for (int j = arr1.length - 1; j >= 0; j--) {
            if(j == 0) {
                System.out.println(arr1[j]);
                break;
            }
            System.out.print(arr1[j] +  ", ");
        }

        // выводим элементы третьего массива в обратном порядке
        for (int j = arr2.length - 1; j >= 0; j--) {
            if(j == 0) {
                System.out.println(arr2[j]);
                break;
            }
            System.out.print(arr2[j] +  ", ");
        }

        System.out.println("Task 4");
        // Делаем все нечетные значения элементов первого массива четными. Прибавляем единицу.
        for(int k = 0; k < arr.length; k ++) {
            if(arr[k] % 2 != 0) {
                arr[k]++;
            }
        }
        // Выводим значения элементов измененного массива, все должны быть четными.
        System.out.println(Arrays.toString(arr));

    }
}