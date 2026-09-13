//1

//public class Loops {
//    public static void main(String[] args){
//        for(int temp=1; temp<1001 ; temp++){
//            if(temp%2 == 0){
//                continue;
//            }
//            else{
//                System.out.println(temp);
//            }
//        }
//    }
//}

//2

//class Even{
//    public static void main(String[] args){
//        for(int temp=1 ; temp<501; temp++){
//            if(temp%2==0){
//                System.out.println(temp);
//            }
//            else
//                continue;
//
//        }
//    }
//}

//3

//class Seven{
//    public static void main(String[] args){
//        for(int temp=1 ; temp<=200 ; temp++){
//            if(temp%7==0){
//                System.out.println(temp);
//            }
//        }
//    }
//}


//4

//class RightTrianglePatternExample {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//5

//class LeftTrianglePattern {
//    public static void main(String[] args) {
//        for (int i = 5; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//6
//class NumberPattern{
//    public static void main(String[] args){
//        int num = 1;
//        for(int i=1; i<5 ; i++ ){
//            for(int j=1; j<=i ; j++){
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }
//    }
//}

//7
//class NumberPatternOne{
//    public static void main(String[] args){
//        int rows = 4;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}

class NumberPatternTwo {
    public static void main(String[] args) {


        for (int i = 6; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}