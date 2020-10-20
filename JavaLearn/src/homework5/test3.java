package homework5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//3、输入一个字符串。按照“年-月-日 时:分:秒”的形式，如果格式正确，则将其变为Date类型的数据。
public class test3 {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		DateFormat dateFormant = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		System.out.println("请输入一个字符串：（格式：年-月-日  时：分：秒）");
		String time = input.nextLine();
		String regx = "^[1-9]{4}-[0-1]\\d-[0-3]//d[0,2]\\d:[0-5]\\d:[0-5]\\d$";
		if(time.matches(regx)) {
			Date date = dateFormant.parse(time);
			System.out.println(date);
		}else {
			System.out.println("wrong");
		}
	}
}
