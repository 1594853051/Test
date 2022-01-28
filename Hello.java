import java.lang.reflect.Type;

public class Hello {
    public static void main(String[]args/*行内注释:arguments的缩写*/ ){
        System.out.println("Hello, World!");
        System.out.println("你好!");

        //类型转换
        /*
        int a= 10;
        double  b = 2.33;
        int c = (int)b; //强制转换
        double d = a;
        System.out.print("d="+d);
        System.out.println(", "+"b="+c);
         */

        //常量
        int ab = 12;
        ab = ab+1;
        final int MAX_NUM = 22;//常量用大写命名容易区分
        //MAX_NUM += 1;//会报错,常量不能变

        //基本数据类型
        /*
        byte占一个字节(8位,有一位表示正负),所以范围是:-2的七次方~2的七次方-1
        short,2个字节,-2的十五次方~2的十五次方-1
        int,4个字节
        long,8个字节
        float,4个字节,-3.403E38~3.403E38(E表示10的38次方),精度不准确,所以又叫单精度
        double,8个字节-1.798E308~1.798E308,双精度,精度是float的两倍
        二进制用0b开头表示,八进制0开头,十六进制0x开头
         */
        /*
        int num1 = 10;
        int num2 = 0b110;//注意系数不能大于等于进制数
        int num3 = 065;
        int num4 = 0x1a3;//16平方+(10*16)的一次方+3
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        long long_num = 30000000000L;//用大写L容易区分.表示长整型
        System.out.println(long_num);
        //float f1 = 1.65;//会报错,带小数点的默认是double类型,float类型需要加F
        float f2= 1.65F;
        double f3 = 1.65;
        System.out.println(f2==f3);//1个=号是赋值,2个=号是比较,这俩精度不准确,不能进行比较:
         */

        //转义字符
        /*
        String str1= "1\b2345";//\b表示退格
        String str2= "1\t2345";//\t表示制表符
        String str3= "1\n2345";//\t表示换行
        String str4= "1\r2345";//\r表示回车
        System.out.println("退格:"+str1);
        System.out.println("制表符:"+str2);
        System.out.println("换行符:"+str3);
        System.out.println("回车:"+str4);
        */

        //自增自减
        /*
        int g=10;
        int g3 =g++;//先赋值后自增
        System.out.println(g);
        System.out.println(g3);
        int g2 =++g;//先自增后赋值
        System.out.println(g);
        System.out.println(g2);
        */

        //关系运算符的运用
        /*
        char char_1='b';
        System.out.println((int)char_1);
        boolean bool_1 = char_1 > 100;
        System.out.println(bool_1);
        */

        //逻辑运算
        /*
        int b1=1;
        int b2=2;
        boolean b3 = b1>b2 && b2>b1/0;//短路与&&,只要前面的为false,后面不执行,因为结果都为false(除以0会报错)
        boolean b4 = b1<b2 || b2>b1/0;//异或与||,只要前面的为true,后面不执行,因为结果都为true
        boolean b5 = b3^b4 ;//异或,两者相同输出false,不同输出true
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        */

        //位运算
        /*
        int c1=7;//二进制是00000111
        int c2=8;//二进制是00001000
        System.out.println(c1&c2);//不同取0,相同取1
        System.out.println(c1|c2);//不同取1,相同取0
        System.out.println(c1^c2);//不同取1,相同取0
        System.out.println(~c2);//取反,8的原码是00001000,取反是11110111,负数,所以反码(首位不变)10001000,补码是(反码+1)1001001
        */

        //移位
        /*
        int d1=4<<3;//相当于4*2*2*2
        int d2=12>>2;//相当于12/(2*2)
        System.out.println(d1);
        System.out.println(d2);
        */

        //条件运算符(三目运算符)
        /*
        //String d1 = "错";
        int d1= 5;
        int d2=10;
        int d3=d1<d2?d1:d2;//注意d3是int型,如果结果不是整型会报错
        int d4=d1>d2?d1:(d2==0?100:200);//嵌套使用
        System.out.println(d3);//结果为true则输出:号左边,结果为false输出:号右边
        System.out.println(d4);
        */

        //运算符优先级:算数运算符(加减乘除)>关系运算符(大于小于)>逻辑运算符(短路与,异或与)

        //自动类型转换
        //nmd







    }
}
