package homework6;

import java.util.ArrayList;
import java.util.Random;

//2、某班有 50 个学生，学号为 202001-202050， 全部参加 Java 集合阶段检测，给出所有同学
//的成绩 （可随机产生，范围为 50-100），请编写程序将本班 各位同学成绩从高往低排序打印输出。
// 注：成绩相同时学号较小的优先打印 
// 要求：打印的信息包含学号、姓名和成绩 。
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