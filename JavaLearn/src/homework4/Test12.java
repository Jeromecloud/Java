package homework4;

//��1����дһ��Բ��Circle������ӵ�У�
	//	��һ����Ա����
	//	Radius��˽�У������ͣ���  // ���Բ�İ뾶��
	//	���������췽��
	//	Circle( )                 // ���뾶��Ϊ0
	//	Circle(double  r )         //����Circle����ʱ���뾶��ʼ��Ϊr
	//	�� ������Ա����
	//	double getArea( )       //��ȡԲ�����
	//	double getPerimeter( )   //��ȡԲ���ܳ�
	//	void  show( )          //��Բ�İ뾶���ܳ�������������Ļ
//��2����дһ��Բ������Cylinder�����̳��������Circle�ࡣ��ӵ�У�
	//	�� һ����Ա����
	//	double hight��˽�У������ͣ���  // Բ����ĸߣ�
	//	�ڹ��췽��
	//	Cylinder (double r, double  h )           //����Circle����ʱ���뾶��ʼ��Ϊr
	//	�� ��Ա����
	//	double getVolume( )             //��ȡԲ��������
	//	void  showVolume( )             //��Բ���������������Ļ
//	��3����дӦ�ó��򣬴�����Ķ��󣬷ֱ�����Բ�İ뾶��Բ����ĸߣ����㲢�ֱ���ʾԲ�뾶��Բ�����
	//	Բ�ܳ���Բ����������
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
		System.out.println("����Բ��");
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
		System.out.println("Բ������� " + this.getArea(Radius));
		System.out.println("Բ���ܳ��� " + this.getPerimeter(Radius));
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
		System.out.println("Բ����������" + this.getVolume());
	}
}
