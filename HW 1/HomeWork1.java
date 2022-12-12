import java.util.Arrays;

public class HomeWork1 {
    // 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), 
    // если да – вернуть true, в противном случае – false.
    static boolean TaskOne(int a, int b) {
        System.out.println("\nЗадание 1.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    // 2.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, 
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    static void TaskTwo(int a) {
        System.out.println("\nЗадание 2.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    // 3.Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    static boolean TaskThree(int a) {
        System.out.println("\nЗадание 3.");
        if (a < 0) return true;
        return false;
    }
    // 5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). 
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void TaskFive(int year) {
        System.out.println("\nЗадание 5.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. Високосный");
    }
    // 6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0.
    static void TaskSix() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("\nИЗНАЧАЛЬНЫЙ: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nЗАМЕНЕННЫЙ:  ");
        for (int i : arr) {
            System.out.print(i + " ");}
        }
    // 7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.
    public static void TaskSeven(){
        int [] array = new int[101];
        array[0] = 0;
        for (int i = 1; i < array.length; i++){
            array[i] = array[i - 1] + 1;
            System.out.println(array[i]);
        }
        }

    // 8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.  
    static void changeArray2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    
        System.out.print("ИЗНАЧАЛЬНЫЙ: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    
        System.out.print("\nЗАМЕНЕННЫЙ:  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }    
    
        public static void main(String[] args) {
            System.out.println(TaskOne(4, 10));
            TaskTwo(-10);
            System.out.println(TaskThree(6));
            TaskFive(316);
            System.out.println("\nЗадача 6.");
            TaskSix();
            System.out.println("\n\nЗадача 7.");
            TaskSeven();
            System.out.println("\nЗадача 8.");
            changeArray2();
        }
      
}   
 
 
 
    