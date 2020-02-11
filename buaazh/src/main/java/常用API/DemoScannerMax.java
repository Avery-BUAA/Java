package 常用API;
//三个值求最大
import java.util.Scanner;

public class DemoScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出三个数字");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int tep = a>b ?a:b;
        int max = tep>c?tep:c;
        System.out.println(max);
    }
}
