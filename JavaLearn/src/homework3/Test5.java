package homework3;

//	两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人
//	向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。 
public class Test5 {
	public static void main(String[] args) {
		String[] A = { "a", "b", "c" };
		String[] B = { "x", "y", "z" };
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (!((i == 0 && j == 0) || (i == 2 && j == 0) || (i == 2 && j == 2))) {
					System.out.println("比赛名单：" + A[i] + "  VS  " + B[j]);
				}
			}
		}
	}
}
