package com.jerome.method;

/**方法重载
 * @author Jerome
 *	TODO 计算出现异常小数的原因
 *	静态方法只能引用静态变量，实例方法两者都可；

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
		Dog.name = "SuKa";//静态类属性
		Dog.out();//SuKa，静态方法访问静态变量
		suka.out2();//SuKa，实例方法访问静态变量
		
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
