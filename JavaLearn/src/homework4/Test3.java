package homework4;
//3、完成下面二维数组的行列转换{{1,2,3},{4,5,6},{7,8,9}} -->> {{1,4,7},{2,5,8},{3,6,9}}

public class Test3 {
	public static void main(String[] args) {
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] array2 = new int[3][3];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				array2[i][j] = array1[j][i];
			}
		}

		for (int[] is : array2) {
			for (int is2 : is) {
				System.out.print(is2);
			}
			System.out.println();
		}
	}
}
