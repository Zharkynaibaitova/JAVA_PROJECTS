// public class program {
//     public static void main(String[] args) {
//         String s = null;
//         System.out.println(s);
// }

    
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }

import java.util.Scanner;
public class program {
 public static void main(String[] args) {
 Scanner iScanner = new Scanner(System.in);
 System.out.printf("int a: ");
 int x = iScanner.nextInt();
 System.out.printf("double a: ");
 double y = iScanner.nextDouble();
 System.out.printf("%d + %f = %f", x, y, x + y);
 iScanner.close();
}}
