package Code;
//三个和尚比体重
public class Practice {
    public static void main(String[] args) {
        int weight1 =150;
        int weight2 =165;
        int weight3 =210;
        int one = weight1 > weight2 ? weight1 : weight2;
        int two = one > weight3 ? one : weight3;
        System.out.println("MAXweight:"+two);
    }
}

//import java.util.Scanner;//三个和尚升级版
//public class Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个和尚的体重：");
//        int weight1 = sc.nextInt();
//        System.out.println("请输入第二个和尚的体重：");
//        int weight2 = sc.nextInt();
//        System.out.println("请输入第三个和尚的体重：");
//        int weight3 = sc.nextInt();
//        int one = weight1 > weight2 ? weight1 : weight2;
//        int two = one > weight3 ? one : weight3;
//        System.out.println("这三个和尚最高的是："+two);
//    }
//}

//import java.util.Scanner;//判断数奇偶数 if ... else结构
//public class Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int number = sc.nextInt();
//        if (number%2==0){
//            System.out.println("该数为偶数");
//        }else{
//            System.out.println("该数为奇数");
//        }
//    }
//}

//import java.util.Scanner;//从键盘输入对应的（1.2.3.4）输出对应的星期一...)if...else...if结构
//public class Practice {
//    public static void main(String[] args) {
//        System.out.println("开始");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数字(0到3)：");
//        int week = sc.nextInt();
//        if(week==1){
//            System.out.println("星期一");
//        }else if(week ==2){
//            System.out.println("星期二");
//        }else{
//            System.out.println("星期三");
//        }
//        System.out.println("结束");
//    }
//}

//import java.util.Scanner;//if...else if ...else运用
//public class Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个分数：");
//        int score = sc.nextInt();
//        if(score>100 || score<0){
//            System.out.println("输入的成绩有误");
//        }else if(95<=score && score<=100){
//            System.out.println("奖励山地自行车一辆");
//        }else if(score>=90 && score<=94){
//            System.out.println("奖励游乐场玩一次");
//        }else{
//            System.out.println("揍一顿");
//        }
//    }
//}

//import java.util.Scanner;    //switch结构
//public class Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数（0到3）：");
//        int week = sc.nextInt();
//        switch(week){//首先先计算switch后括号内表达式的值
//            case 1://依次和case后面的值进行比较，如果有对应的值就会执行相应的语句，在执行中遇到break就会结束
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//            default://如果所有的case的值都不符合就会执行default后年的语句
//                System.out.println("x星期四");
//                break;
//        }
//    }
//}


/*for 循环： 格式
for(初始化语句;条件判断语句;条件控制语句){
  循环体语句；
}
执行流程：1、执行初始化语句2、执行条件判断语句，看其结果是true还是false，如果是false,循环结束；是true,继续执行
      3、执行循环体语句4、执行条件控制语句5、回到2、继续

 */
//public class Practice {
//    public static void main(String[] args) {
//        int sum = 0;
//        for(int i=1; i<=100; i++){
//            if(i%2==0){
//                sum += i;
//            }
//        }
//        System.out.println("1到100之间的偶数数据和是："+sum);
//    }
//}

//public class Practice {         //水仙花数
//    public static void main(String[] args) {
//        int sum = 0;
//        for(int i=100;i<=999;i++){
//            int a = i%10;
//            int b = i/10%10;
//            int c =i/100;
//            if(a*a*a + b*b*b + c*c*c == i){
//                sum++;
//                System.out.println("水仙花数为："+i);
//            }
//        }
//        System.out.println("水仙花的个数为："+sum+'个');
//    }
//}

/* while循环语句：基本格式：初始化语句：
                        while（条件判断语句）{
                            循环语句
                            条件控制语句
                        }
流程：1、执行初始化语句2、执行条件判断语句。看其结果是true，继续执行。是false,循环结束
     3、执行循环语句 4、执行条件控制语句 5、回到2继续 和for循环相同
 */
//public class Practice {
//    public static void main(String[] args) {
//        int j = 1;
//        while(j<=5){
//            System.out.println("hellow,world");
//            j++;
//        }
//    }
//}
//
//public class Practice {// while 案例
//    public static void main(String[] args) {
//        int count = 0;
//        double paper = 0.1;
//        while (paper<=8844430){
//            paper*=2;
//            count++;
//        }
//        System.out.println("折叠次数为："+count+'次');
//    }
//}

//for循环 和while和 do...while 共同演示输出5次 ”Helloworld“
//public class Practice {
//    public static void main(String[] args) {
//        //for循环
//        for(int i=1;i<=5;i++) {
//            System.out.println("Helloworld");
    //while循环
//        int i=1;
//        while (i<=5){
//            i++;
//            System.out.println("Helloworld");
    //do while循环
//        int i = 1;
//        do{
//            System.out.println("Helloworld");
//            i++;
//        }while(i<=5);
//        }
//    }
//}
/*三种循环的区别：for循环与while循环： for循环中的变量用完在循环外不能使用，while可以
 do...while..先执行后判断所以至少执行 一次 while 先判断后执行
 */
//public class Practice {
//    public static void main(String[] args) {
    //for循环的死循环
//        for(;;){
//            System.out.println("凯爹");
    //while循环的死循环
//         while (true){
//             System.out.println("凯爹");
    //do...while...的死循环
//        do{
//            System.out.println("凯爹");
//        }while(true);
//    }
//}
/*continue:用在循环中，基于条件控制，跳过某次循环内容的执行，继续执行下一次的执行
break:用在循环中，基于条件控制，终止循环内容的执行，结束当前的整个循环
 */
//import java.util.Scanner;//猜数游戏（0到100内）
//import java.util.Random;
//public class Practice {
//    public static void main(String[] args) {
//        Random r = new Random();
//        int number = r.nextInt(100)+1;
//        while(true){
//            Scanner input =new Scanner(System.in);
//            System.out.println("请输入要猜的数字：");
//            int kai = input.nextInt();
//            if(kai>number){
//                System.out.println("你猜的数字"+kai+"大了");
//            }else if(kai<number){
//                System.out.println("你猜的数字"+kai+"小了");
//            }else {
//                System.out.println("恭喜你猜对了");
//                break;
//            }
//        }
//    }
//}

//import java.util.Scanner;
//public class Practice {
//    public static void main(String[] args) {
//        int[] list=new int[] {1,2,3,4,5,6,7,};
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入要猜的数：");
//        int guess = input.nextInt();
//        boolean Correct = false;
//        for (int i = 0;i<list.length;i++){
//             if(guess == list[i]){
//                Correct = true;
//                break;
//            }
//        }
//        if (Correct) {
//            System.out.println("恭喜你猜对了！");
//        }else{
//                System.out.println("抱歉，猜错了！");
//        }
//    }
//}

//public class Practice {
//    public static void main(String[] args) {
//        getMAX();
//    }
//    public static void getMAX(){
//        int a= 10;
//        int b= 20;
//        if(a>b){
//            System.out.println(a);
//        }else {
//            System.out.println(b);
//        }
//    }
//}

