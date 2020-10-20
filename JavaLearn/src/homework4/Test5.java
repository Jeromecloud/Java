package homework4;
//5、有一个String[]数组，比如String [] names={"张三", "李四", "王五"}，有一个长度和names一样的boollean数组boolean[] scores ={true,false,true} 和names一一对应，代表每个人的成绩，
//要求生成一个String数组{"张三及格","李四不及格","王五及格"}
public class Test5 {
	public static void main(String[] args) {
		String[] names = {"张三", "李四", "王五"};
		boolean[] scores = {true,false,true};
		String[] table = new String[3];
		String passScore = "及格";
		String failScore = "不及格";
		for(int i = 0; i <names.length; i++) {
			if(scores[i] == true) {
				table[i] = names[i].concat(passScore);
			}else {
				table[i] = names[i].concat(failScore);
			}
		}
		for (String string : table) {
			System.out.println(string);
		}
	}
}
