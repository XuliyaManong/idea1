//package Code;
//数据输入：导包
//import java.util.Scanner;
//public class Demo02 {
//    public static void main(String[] args) {
//        //创建对象
//        Scanner sc = new Scanner(System.in);
//        //接收数据
//        int x = sc.nextInt();
//        //输出数据
//        System.out.println("x:"+x);
//    }
//}
//package Code;
//public class Demo02 {
//    public static void main(String[] args) {   //其中void的有无  看是否有返回值return 有返回值不加void
//        isEvenNumber();//调用方法
//    }
//    public static void isEvenNumber(){
//        int number = 9;
//        if(number%2 == 0){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//    }
//}
//package Code;
//public class Demo02 {
//    public static void main(String[] args) {//方法调用时，参数的数量与类型必须与方法定义中设置相匹配
//        isEvenNumber(9);//常量值的调用。其中9为形参
//        /*
//         形参：方法定义中的参数  实参：方法调用中参数
//              对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
//              对于引用数据类型（咧如数组类型 ）的参数，形式参数的改变，影响实际参数的值
//         */
//        int number = 9;//变量值的调用
//        isEvenNumber(number);//其中number为形参
//    }
//    //该方法为判断奇偶数
//    public static void isEvenNumber(int number){//方法定义时，参数是由数据类型和变量名组成 多个参数之间用逗号隔开，其中int number为实参
//        if(number%2 == 0){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//    }
//}
/*
 带返回值方法的定义和调用
 定义格式：
   public static 数据类型 方法名（参数名）{
          return 数据  （跟上面数据类型要一致）
  调用格式：
  1、方法名（参数）
  2、数据类型 变量名 =方法名（参数）；
   }
 */
//package Code;
//public class Demo02 {
//    public static void main(String[] args) {
////      1、方法名（参数）；
//        isEvenNumber(10);
////      2、数据类型 变量名 =方法名（参数）；
//        boolean q = isEvenNumber(10);
//        System.out.println(q);
//    }
//    public static boolean isEvenNumber(int number){
//        if(number%2==0){
//            return true;
//        }else {
//            return false;
//        }
//    }
//}
/*
                     方法重载：
                    多个方法在同一个类中
                    多个方法具有相同的方法名
                    多个方法的参数不相同，类型不同或者数量不同
                    与返回值无关
                    在调用的时候，java虚拟机会通过参数的不同来区分同名的方法名
 */
//package Code;
//public class Demo02 {
//    public static void main(String[] args) {
//       int[] arr = {11,22,33,44,55};
//       printArray(arr);
//    }
//    public static void printArray(int[] arr) {
//        System.out.print("[");
//        for(int x=0;x<arr.length;x++){
//            if(x==arr.length-1){
//                System.out.print(arr[x]);
//            }else{
//                System.out.print(arr[x]+",");
//            }
//        }
//        System.out.println("]");
//    }
//}

package Code;
public class Demo02 {
    public static void main(String[] args) {
      int[] arr={11,22,33,44,55,66};
      int number = printMax(arr);
        System.out.println("numbeer:"+number);
    }
    public static int printMax(int[] arr){
        int max = arr[0];
        for(int x=1;x<arr.length;x++){
            if(arr[x]>max){
                max = arr[x];
            }
        }
        return max;
    }
}