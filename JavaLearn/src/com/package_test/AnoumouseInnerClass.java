package com.package_test;

public class AnoumouseInnerClass {
	public static void main(String[] args) {
		GrandFather grandfather = new GrandFather();
        GrandFather grandfather2 = new Dad(); //向上
        Dad dad = new Dad();
        Son son = new Son();
        Sun sun = new Sun();
        System.out.println("第一题 " + grandfather.show(dad));//GrandFater
        System.out.println("第二题 " + grandfather.show(son));//GrandFater
        System.out.println("第三题 " + grandfather.show(sun));//GrandFather and Sun
        System.out.println("第四题 " + grandfather2.show(dad)); //Dad and GrandFather
        System.out.println("第五题 " + grandfather2.show(son));//dad and dad
        System.out.println("第六题 " + grandfather2.show(sun));//GrandFather and sun
        System.out.println("第七题 " + dad.show(dad));//dad ad dad
        System.out.println("第八题 " + dad.show(son));//dad and dad
        System.out.println("第九题 " + dad.show(sun));//
	}
}
class GrandFather{
	public String show(Sun obj) {
		return "GrandFather and Sun";
	}
	public String show(GrandFather obj) {
		return "GrandFather";
	}
}
class Dad extends GrandFather{
	public String show(Dad obj) {
		return "Dad and Dad";
	}
	public String show(GrandFather obj) {
		return "Dad and GrandFather";
	}
}
class Son extends Dad{
}
class Sun extends Dad{
}
