package homework3;
//	��̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ�
//	��һ�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ�
//	��һ�����뺣�У�������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
public class Test9 {
	public static void main(String[] args){
        int n;
        n = fun(0);
        System.out.println("ԭ����"+n+"������");
    }
    private static int fun(int i){
        if(i==5)
          return 1;
        else
          return fun(i+1)*5+1;
    }
}
