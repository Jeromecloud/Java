package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//4�������������󣬲��ô���ʵ�֣�
//	(1)����10��1��100֮����������(�����ظ�)������һ��List����
//	(2)��д������List���Ͻ�������
//	�м�,���ܹ�ֱ��ʹ��Collections�������sort()����

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
	//��С��������
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
