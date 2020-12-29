package Collection;

import java.lang.reflect.*;

/*反射*/
public class Reflect {
    private int price;
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static void main(String[] args) throws Exception{
        //.class加载进内存，通过全类名来获得类
        //经过类加载器通过类名.class来获取类
        //生成对象后通过对象名.getClass来获得类
        Class clz = Class.forName("Collection.Reflect");
        // 通过getMethod获得类的方法
        Method setPriceMethod = clz.getMethod("setPrice", int.class);
        // 通过getConstructor来获得类的构造器
        Constructor ReflectConstructor = clz.getConstructor();
        //通过构造器来创建对象
        Object appleObject = ReflectConstructor.newInstance();
        //类的方法来传递参数
        setPriceMethod.invoke(appleObject,14);
        //获得值
        Method getPrice = clz.getMethod("getPrice");
        System.out.println(getPrice.invoke(appleObject));

    }
}