import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // System.out.println("Hello");
        
        // Scanner iScanner = new Scanner(System.in);
        // int chislo = iScanner.nextInt();
        // System.out.println(chislo);
        // int chislo2 = iScanner.nextInt();
        // iScanner.close();
        // if (chislo > 10){
        //     System.out.println(123);
        // }
        // else{
        //     System.out.println(222);
        // }

        // for (int i = 0; i < 10; i++) {
            
        // }

        // int i = 0;
        // while (i < 10){
        //     i++;
        // }
        // ----------------------------------------------------------------------


        // Scanner iScanner = new Scanner(System.in, "cp866");
        // System.out.print("Введите имя: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s", name);

        // iScanner.close();  

        // -----------------------------------------------------------------------
        
        // Дан массив двоичных чисел, например [1,1,1,0,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1], вывести максимальное количество подряд идущих 1..

        // int[] arr = new int [] {1,1,1,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,1,0,1};

        // int count = 0;
        // int countMax = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 1){
        //         count++;
        //     }else{
        //         countMax = count;
        //         count = 0;
        //     }
            
        // }
        // if (countMax < count) {
        //     countMax = count;
        // }
        // System.out.println(countMax);
        // System.out.println(Arrays.toString(arr));
        // -----------------------------------------------------------------------------------


        // Дан массив nums = [3,2,4,3,1,3,3,5] и число val = 3.
        // Если в массиые есть числа равные заданному, нужно перенести эти элементы в конец массива.
        // Таким, образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные равные ему.
        // [3,2,4,3,1,3,3,5] 
        // [2,4,1,5,3,3,3,3]

        int[] nums = new int[] {3,2,4,3,1,3,3,5,6,7};
        int val = 3;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length-1; j++) {
                    nums[j] = nums[j+1];
                    
                }
                nums[nums.length - 1] = val;
            }else{

            }
            
            
        }
        System.out.println(Arrays.toString(nums));


    }
  
}
