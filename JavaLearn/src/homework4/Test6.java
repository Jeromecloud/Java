package homework4;

//6	(1)��һ�������ַ���"25 11 -6 20 102 9",����֮���ÿո���
//	(2)����ð��������⴮���ְ��մ�С������������һ����ֵ������ַ���"-6 9 11 20 25 102"
//
public class Test6 {
	public static void main(String[] args) {
		String array = "25 11 -6 20 102 9";
		// 1. ͨ���ո��и��ַ����õ��ַ�������
		String[] arrays = array.split(" ");
		// 2. �������ַ���ת���ɾ������ֵ,����������д洢
		int[] arr = new int[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			// 3. ��ÿһ�������ַ���ת���ɶ�Ӧ������
			arr[i] = Integer.parseInt(arrays[i]);
		}

		// 4. ð������
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// 5. ����StringBuffer��������������Ԫ�ص�ƴ��
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		String result = sb.toString();
		System.out.println(result);
	}

}
