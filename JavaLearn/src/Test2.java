import java.util.Scanner;

//将一个浮点数转换为人民币读法
/*思路：
1、整数和小数区分
2、整数部分按位取值
3、小数取2位*/
public class Test2 {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("输入一个带两位小数的数字");
//		float num = input.nextFloat();
//		int  zhengshu = (int)num;
//		int xiaoshu = Math.round((num-zhengshu)*100);
//		float xiaoshu = num - zhengshu;//小数会出现误差
//		System.out.println(zhengshu+"");//将基本类型转换为字符串方法1
//		System.out.println(String.valueOf(zhengshu));//将基本类型转换为字符串方法2
//		System.out.println((zhengshu+"").getClass());//查看类型
//		System.out.println(String.valueOf(zhengshu) +"   "+ String.valueOf(xiaoshu));
		Scanner input = new Scanner(System.in);
		System.out.println("four numbers:");
		String num = input.next();
		System.out.println(num.charAt(0));
		System.out.println(num.charAt(1));
		System.out.println(num.charAt(2));
		System.out.println(num.charAt(3));

		
		
		
		
		
		
		
		
		
		
	}
}
