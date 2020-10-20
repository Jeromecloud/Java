package homework4;

import java.util.Random;

//10、定义String getStr(char[] chs)静态方法，方法内要求：从chs中随机获取4个元素，再和1个0-9之间
//（包含0和9）的整数组成一个五个字符的字符串。
//	定义main方法，方法内完成：
//（1）定义长度为26，元素值为26个大写英文字母的数组chs
//（2）传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值
//
public class Test10 {
	public static void main(String[] args) {
		char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		System.out.println(getStr(arr));
	}

	public static String getStr(char[] chs) {
		// 随机获取, 需要创建Random对象
		Random r = new Random();
		// 需要将字符拼接到一起, 定义一个容器
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= 4; i++) {
			// 根据数组的长度生成随机的索引
			int index = r.nextInt(chs.length);
			// 通过索引去数组中获取元素,存储到容器当中
			sb.append(chs[index]);
		}
		// 通过nextInt方法生成随机的数字0-9
		int num = r.nextInt(10);
		// 将生成的结果添加到容器当中
		sb.append(num);
		// 转成字符串并返回
		return sb.toString();
	}
}
