import java.util.Scanner;
import java.util.Arrays;
//
//public class Array {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter arr size: ");
//        int size = scanner.nextInt();
//
//        int [] arr = new int[size];
//
//        System.out.println("Enter " + size + " integers:");
//        for(int i= 0; i<arr.length ; i++){
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.println("\nYou entered: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//
//       Arrays.sort(arr);
//
//        System.out.println("Sorted array: ");
//        for (int num: arr){
//            System.out.print(num + " ");
//        }
//
//
//
//        scanner.close();
//
//    }
//}

//class ArraySum{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter arr size: ");
//        int size = scanner.nextInt();
//
//        int [] arr = new int[size];
//
//        System.out.println("Enter " + size + " integers:");
//        for(int i= 0; i<arr.length ; i++){
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.println("\nYou entered: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//
//        System.out.println();
//        int sum = 0;
//        for(int i=0; i<arr.length ; i++){
//            sum += arr[i];
//        }
//        System.out.println("Sum: " + sum);
//
//
//    }
//}


//class ArrayAvg{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter arr size: ");
//        int size = scanner.nextInt();
//
//        int [] arr = new int[size];
//
//        System.out.println("Enter " + size + " integers:");
//        for(int i= 0; i<arr.length ; i++){
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.println("\nYou entered: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//
//        System.out.println();
//        int sum = 0;
//        for(int i=0; i<arr.length ; i++){
//            sum += arr[i];
//        }
//        double avg = sum/size;
//        System.out.println("Avg: " + avg);
//
//
//    }
//}

//class ArrCpy{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter arr size: ");
//        int size = scanner.nextInt();
//
//        int [] arr = new int[size];
//
//        System.out.println("Enter " + size + " integers:");
//        for(int i= 0; i<arr.length ; i++){
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.println("\nYou entered: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//
//        System.out.println();
//
//        int [] array1 = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            array1[i] = arr[i];
//        }
//
//        System.out.println("\nCopy array: ");
//        for (int num : array1) {
//            System.out.print(num + " ");
//        }
//
//
//
//
//    }
//}


class MaxMin{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter arr size: ");
        int size = scanner.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for(int i= 0; i<arr.length ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nYou entered: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i<arr.length ; i++ ){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }
}


