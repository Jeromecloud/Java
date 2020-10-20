package homework4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//2、声明一个方法，要求根据输入的字符串生日（格式yyyy-MM-dd）计算出，已出生多少天？


public class Test2 {
	//	计算已出生多少天
	public static void main(String[] args) throws ParseException {
		fundata();
	}

	public static void fundata() throws ParseException{
		System.out.println("请输入您的出生日期，格式yyyy-MM-dd:");
		String birthdayString = new Scanner(System.in).next();
//			将字符串转换为date类型
		SimpleDateFormat StoDate = new SimpleDateFormat("yyyy-MM-dd");
		Date birthdayDate = StoDate.parse(birthdayString);

//			获取当前日期
		Date nowDate = new Date();
//			转为毫秒值进行换算
		long nowSecond = nowDate.getTime();
		long birthdaySecond = birthdayDate.getTime();
		long second = nowSecond - birthdaySecond;
		if (second < 0) {
			System.out.println("无法计算");
		} else {
			System.out.println(second / 1000 / 60 / 60 / 24);
		}

	}

}
