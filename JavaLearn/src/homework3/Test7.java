package homework3;

import java.util.Arrays;
import java.util.Scanner;

//	�������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣
public class Test7 {
	public static void main(String[] args) {
		System.out.print("��������Ҫ��������ָ���:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <=0 ) {
            System.out.println("��������");
        } else {
            int[] arr = new int[n];
            System.out.println("������"+n+"������");
            for(int i=0; i<n; i++) {
                arr[i] = in.nextInt(); 
            }
            changeMin(arr);
            changeMax(arr);
            System.out.println(Arrays.toString(arr));
        }
        in.close();
    }
    //���ֵ���һ��Ԫ�ؽ���
    public static void changeMax(int[] arr) {
        int max = 0;
        int index = 0;
        for(int i=0; i< arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        int temp = arr[0];
        arr[0] = max;
        arr[index] = temp; 
        
    }
    //���һ��Ԫ������Сֵ����
    public static void changeMin(int[] arr) {
        int min = arr[arr.length-1];
        int index = 0;
        for(int i=0; i< arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        int temp = arr[arr.length -1];
        arr[arr.length -1] = min;
        arr[index] = temp; 
	}
}
