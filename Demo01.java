package Code;
public class Demo01 {
    public static void main(String[] args) {
        /*标识符定义规则
        1、由数字、字母、下划线（_)和美元符（$)组成
        2、不能以数字开头
        3、不能是关键字
        4、要区分明大小写*/
        //八大数据类型
        //整型
        byte num1=10; //范围-128到127(1个字节等于8“位”）
        short num2=20;//-32768到32767（2个字节）
        int num3=30;//-2147483648到2147483647（4个字节）
        long num4=40L;//长整型范围很大（8个字节）
        //小数：浮点类型
        float num5=2.1f;//（占4个字节）java语言默认的浮点数据类型
              //为double类型，使用float类型要在所声明的变量后加f
               //还有默认为int类型，使用long类型要在其后加L
        double num6=2.1;//(占8个字节)
        //字符类型：字母、数字、单个文字、符号
        char num7='凯';//0到65535（占2个字节）
        //字符串，String不是关键字，是类
        String name="凯";
        String 王者荣耀="你是百星王者";
        //布尔值：是非
        boolean flog=true;
        boolean flag=false;

        /*数据范围从小到大
        byte → short
                     → int → long →  float →  double
               char
         */
        //自动类型转换 由范围小的到大的
        byte b = 10;
        short s = b;
        //强制类型转换 由范围大的到小的 会导致数据的丢失
        double d =3.14;
        int f = (int)d;
        System.out.println(f);//输出结果为3
        /*算术运算符  在表达式中包含多种数据类型时，
        范围低的类型将自动转换为高类型
         */
        int r = 3;
        char g = 6;
        int k = r+g;
        System.out.println(k);
        /*
          /和%的区别：两数做除法，/取结果的商，%取结果的余数
          整数操作只能得到整数，要想得到小数必须要有浮点数的参与
         */
        int a=(int)4.0;
        int e=6;
        System.out.println(a%e);
        /* 字符的“+”操作 ’A‘等于65  A-Z是连续的
                      ’a‘等于97  a-z是连续的
                      ’0‘等于48  0-9是连续的
            字符串的“+”操作  如果出现了字符串，就是连接运算符，否则就是算术运算符
         */
        /*
        逻辑运算符：&(按位与)：有false则false
                  |（按位或）:有true则true
                  ^（按位异或）:相同为false,不相同为false
                  !（逻辑非）:时true则false时false则true
                  &&（短路与）：只要遇到左侧变量或表达式为false,右侧则不再运算直接false
                  ||(短路或)：只要遇到左侧变量或表达式为true,右侧则不再运算，直接为true
         三元运算符：格式为： 条件表达式？值1：值2
              如果表达式的值为true，则最终结果为值1，否则为2
         */
        int num =1;
        int result = num > 2 ? 10:20;
        System.out.println(result);

//        数组
        int[] arr = new int[3];
        /*int[]为栈内存 new int[3]为栈内存 new开辟堆内存空间如下图
                                        0   0
                                        1   0
                                        2   0
        数组在初始化时，会为储存空间添加默认值
        整数：默认值为0
        浮点数：0.0
        布尔值：false
        字符：空字符
        引用数据类型：null
         */
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        int[] arr1 = {11,22,33,44,55,66,};
        for(int x=0;x<arr1.length;x++) {//数组遍历格式
            System.out.println(arr1[x]);
        }
    }
}
