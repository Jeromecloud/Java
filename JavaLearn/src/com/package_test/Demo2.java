package com.package_test;

class  Matcher{
    public void matcherSpeak(){
        System.out.println("��Կ�ɽҩ��");
    }

}

class HappyMother extends Matcher {
    public void matcherSpeak(){
        System.out.println("���ĵ�����˵���ԣ��Դ��ģ�һ�𳵹���");
    }
}
class SadMother extends HappyMother{
    public void matcherSpeak(){
        System.out.println("ttttttt");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Matcher mm=new SadMother();
        mm.matcherSpeak();
    }
}