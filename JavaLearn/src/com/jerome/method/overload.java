package com.jerome.method;

/**��������
 * @author Jerome
 *	TODO ��������쳣С����ԭ��
 *	��̬����ֻ�����þ�̬������ʵ���������߶��ɣ�

 */
public class overload {
	public static void main(String[] args) {
		Dog suka = new Dog();
		int i = 1;
		int j = 1000;
		double a = 200.3;
		double b= 3.3;
		short m = 3;
		short n = 2;
		float x = 3.2F;
		float y = 2.2F;
		System.out.println(suka.add(i,j));//1001
		System.out.println(suka.add(a,b));//203.60000000000002
		System.out.println(suka.add(m,n));//5
		System.out.println(suka.add(x,y));//5.400000095367432
		Dog.name = "SuKa";//��̬������
		Dog.out();//SuKa����̬�������ʾ�̬����
		suka.out2();//SuKa��ʵ���������ʾ�̬����
		
		overload a1 = new overload();
		System.out.println(a1.sum(123,333));
	}
	
	int sum(int... num) {
		int sum = 0;
		for(int i = 0; i<num.length;i++) {
			if(num[i] != 0) {
				sum += num[i];
			}
		}
		return sum;
	}
	
}
class Dog{
	static String name;
	public int add(int a,int b) {
		return a + b;
	}
	public double add(double a, double b) {
		return a + b;
	}
	public static void out() {
		System.out.println(name);
	}
	void out2() {
		System.out.println(name);
	}
	
}
