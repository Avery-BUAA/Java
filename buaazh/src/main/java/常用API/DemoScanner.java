package 常用API;

import java.util.Scanner;//1.导包

/*
引用类型使用的一般步骤

1.导包
2.创建
3.使用
 */
public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建
        String str = sc.next();//使用 获取字符串
        int num1 = sc.nextInt();//获取的字符串自动转换为数字
        System.out.println(num1);
        System.out.println(str);

    }
}
