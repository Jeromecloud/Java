package homework4;

//（1）编写一个圆类Circle，该类拥有：
	//	①一个成员变量
	//	Radius（私有，浮点型）；  // 存放圆的半径；
	//	②两个构造方法
	//	Circle( )                 // 将半径设为0
	//	Circle(double  r )         //创建Circle对象时将半径初始化为r
	//	③ 三个成员方法
	//	double getArea( )       //获取圆的面积
	//	double getPerimeter( )   //获取圆的周长
	//	void  show( )          //将圆的半径、周长、面积输出到屏幕
//（2）编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
	//	① 一个成员变量
	//	double hight（私有，浮点型）；  // 圆柱体的高；
	//	②构造方法
	//	Cylinder (double r, double  h )           //创建Circle对象时将半径初始化为r
	//	③ 成员方法
	//	double getVolume( )             //获取圆柱体的体积
	//	void  showVolume( )             //将圆柱体的体积输出到屏幕
//	（3）编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示圆半径、圆面积、
	//	圆周长，圆柱体的体积。
public class Test12 {
	public static void main(String[] args) {
		Circle cc = new Circle(5);
		cc.show();
		Cylinder ccc = new Cylinder(5, 3);
		ccc.showVolume();
	}
}

class Circle {
	private double Radius;

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}

	public Circle() {
		System.out.println("我是圆！");
	}

	public Circle(double r) {
		this.Radius = r;
	}

	public double getArea(double r) {
		return Math.PI * r * r;
	}

	public double getPerimeter(double r) {
		return 2 * Math.PI * r;
	}

	public void show() {
		System.out.println("圆的面积： " + this.getArea(Radius));
		System.out.println("圆的周长： " + this.getPerimeter(Radius));
	}
}

class Cylinder extends Circle {
	private double hight;

	public Cylinder(double r, double h) {
		super(r);
		this.hight = h;
	}

	public double getVolume() {
		return Math.PI * this.getRadius() * this.getRadius() * hight;
	}

	public void showVolume() {
		System.out.println("圆柱体的体积：" + this.getVolume());
	}
}
