package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//4、分析以下需求，并用代码实现：
//	(1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
//	(2)编写方法对List集合进行排序
//	切记,不能够直接使用Collections工具类的sort()方法

public class Test4 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
		while(list.size() < 10) {
			int x = random.nextInt(100) + 1;
			if(!list.contains(x)) {
				list.add(x);
			}
		}
		
		
		sort(list);
		
		System.out.println(list);
	}
	//从小到大排序
	public static List<Integer> sort(List<Integer> list){
		for(int i = 0;i < list.size();i++) {
			for(int j = 0;j < list.size() - i - 1;j++) {
				if(list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		return list;
	}
}
