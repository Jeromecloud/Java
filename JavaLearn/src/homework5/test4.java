package homework5;

//4、写一个方法，对用户名进行判断，用户名只能够由字母、数字、_组成，其长度只能是6~15位。

public class test4 {
	boolean judge(String name) {
		if(name.matches("\\w{6,15}")) {
			return true;
		}else {
			return false;
		}
	}
}
