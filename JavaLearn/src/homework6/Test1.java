package homework6;
//1、斗地主发牌：

//	有一副扑克牌，分发3个人，底牌留3张，然后把每个人手中的牌按照大小顺序排序。
//	最终在控制台打印出每个玩家手中的牌以及底牌。

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		String[] color = { "♠", "♣", "♥", "♦" };
		String[] number = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
		int num = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < color.length; j++) {
				map.put(num, color[j] + number[i]);
				list.add(num);
				num++;
			}
		}
		// 集合里面多添加两个元素位置用来存放大小王
		list.add(list.size());
		list.add(list.size());

		map.put(list.size() - 2, "小王");
		map.put(list.size() - 1, "大王");

		// 洗牌后 随机打乱
		Collections.shuffle(list);

		List player1 = new ArrayList(); // 玩家1
		List player2 = new ArrayList(); // 玩家2
		List player3 = new ArrayList(); // 玩家3
		List cards = new ArrayList(); // 底牌
		for (int i = 0; i < list.size(); i++) {
			if (i < list.size() - 3) {
				if (i % 3 == 1) {
					player1.add(list.get(i));
				} else if (i % 3 == 2) {
					player2.add(list.get(i));
				} else {
					player3.add(list.get(i));
				}
			} else {
				cards.add(list.get(i));
			}
		}
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		Collections.sort(cards);

		for (int i = 0; i < player1.size(); i++) {
			player1.set(i, map.get(player1.get(i)));
		}
		for (int i = 0; i < player2.size(); i++) {
			player2.set(i, map.get(player2.get(i)));
		}
		for (int i = 0; i < player3.size(); i++) {
			player3.set(i, map.get(player3.get(i)));
		}
		for (int i = 0; i < cards.size(); i++) {
			cards.set(i, map.get(cards.get(i)));
		}

		System.out.println("玩家1" + player1);
		System.out.println("玩家2" + player2);
		System.out.println("玩家3" + player3);
		System.out.println("底牌" + cards);
	}
}
