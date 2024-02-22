package com.ohgiraffers.section01.polymorphism;

public class Application04 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용해서 리턴타입에 활용할 수 있다. */

        /* 목차. 랜덤동물() 메소드 추가 */

        /* 목차. 1. 랜덤동물() 호출 */
        Application04 app4 = new Application04();

        동물 randomAnimal = app4.랜덤동물();      // 동물 random- = new 토끼(); 또는 호랑이가 되는 것.

        randomAnimal.울기();
    }

    public 동물 랜덤동물() {

        int 랜덤 = (int)(Math.random() * 2) + 0;      // 숫자 2개 쓸거라 범위 2 곱함. 0,1 나올 것. 0 생략가능

        return 랜덤 == 0 ? new 토끼() : new 호랑이();      // true면 토끼, false면 호랑이. 리턴타입이 동물이 아니더라도 다형성 때문에 토끼, 호랑이 타입도 가능.
    }

}
