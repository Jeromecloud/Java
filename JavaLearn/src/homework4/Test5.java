package homework4;
//5����һ��String[]���飬����String [] names={"����", "����", "����"}����һ�����Ⱥ�namesһ����boollean����boolean[] scores ={true,false,true} ��namesһһ��Ӧ������ÿ���˵ĳɼ���
//Ҫ������һ��String����{"��������","���Ĳ�����","���弰��"}
public class Test5 {
	public static void main(String[] args) {
		String[] names = {"����", "����", "����"};
		boolean[] scores = {true,false,true};
		String[] table = new String[3];
		String passScore = "����";
		String failScore = "������";
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
