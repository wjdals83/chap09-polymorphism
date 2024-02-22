package com.ohgiraffers.section01.polymorphism;

public class 호랑이 extends 동물{

    @Override
    public void 먹기() {
        System.out.println("호랑이가 고기를 뜯어먹습니다....");
    }

    @Override
    public void 달리기() {
        System.out.println("호랑이는 웬만해서는 달리지 않습니다. 어슬렁~ 어슬렁~");
    }

    @Override
    public void 울기() {
        System.out.println("호랑이가 울부짖습니다.. 어흐으으으응");
    }

    public void 물어뜯기() {
        System.out.println("호랑이가 물어 뜯습니다.. 앙~");
    }

}
