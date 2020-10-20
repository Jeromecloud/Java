package com.package_test;

class  Matcher{
    public void matcherSpeak(){
        System.out.println("想吃烤山药？");
    }

}

class HappyMother extends Matcher {
    public void matcherSpeak(){
        System.out.println("开心的妈妈说：吃，吃大块的，一火车够吗");
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