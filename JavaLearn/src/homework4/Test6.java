package homework4;

//6	(1)有一个数字字符串"25 11 -6 20 102 9",数字之间用空格间隔
//	(2)利用冒泡排序对这串数字按照从小到大排序，生成一个数值有序的字符串"-6 9 11 20 25 102"
//
public class Test6 {
	public static void main(String[] args) {
		String array = "25 11 -6 20 102 9";
		// 1. 通过空格切割字符串得到字符串数组
		String[] arrays = array.split(" ");
		// 2. 将数字字符串转换成具体的数值,并用数组进行存储
		int[] arr = new int[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			// 3. 将每一个数字字符串转换成对应的数字
			arr[i] = Integer.parseInt(arrays[i]);
		}

		// 4. 冒泡排序
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// 5. 创建StringBuffer对象用于数组中元素的拼接
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		String result = sb.toString();
		System.out.println(result);
	}

}
