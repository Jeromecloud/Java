package homework6;

import java.util.ArrayList;
import java.util.Random;

//2��ĳ���� 50 ��ѧ����ѧ��Ϊ 202001-202050�� ȫ���μ� Java ���Ͻ׶μ�⣬��������ͬѧ
//�ĳɼ� ���������������ΧΪ 50-100�������д���򽫱��� ��λͬѧ�ɼ��Ӹ����������ӡ�����
// ע���ɼ���ͬʱѧ�Ž�С�����ȴ�ӡ 
// Ҫ�󣺴�ӡ����Ϣ����ѧ�š������ͳɼ� ��
public class Test2 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Random random = new Random();
		for(int i = 0; i<50;i++) {
			Student student = new Student();
			student.setStudentID(202001+i);
			student.setName("classmate" + (i+1));
			student.setScores(random.nextInt());
		}
	}
}

class Student{
	private String name;
	private int studentID;
	private int scores;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int i) {
		this.studentID = i;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "";
	}
}