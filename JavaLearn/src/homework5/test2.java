package homework5;
//2、写个方法验证字符串是否是小数，如果是，则将其变为double类型的数据，并求该数据的平方值，并将结果返回。
public class test2 {
	public static Double getValue(String a ) {
		String b = "[\\.]";
		if(b.matches("^-?\\d+\\.\\d+$")) {
			double c = Double.parseDouble(b);
			return c*c;
		}else {
			return null;
		}
	}
}
