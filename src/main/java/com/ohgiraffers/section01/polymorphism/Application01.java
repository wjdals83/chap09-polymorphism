package com.ohgiraffers.section01.polymorphism;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        /* 필기.
        *   다형성
        *   다형성이란 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 말한다.
        *   그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
        *   하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작할 수도 있다.
        * */

        /* 필기.
        *   다형성이란, 객체지향 프로그래밍의 3대 특징(캡슐화, 상속, 다형성) 중 하나이며,
        *   객체지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.
        * */

        /* 필기.
        *   다형성의 장점
        *   1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가
        *   2. 상속을 기반으로 한 기술이기 때문에 상속관계에(연관) 있는 객체는 동일한 메세지(메소드)를
        *      수신할 수 있다.
        *      이러한 동일한 메세지를 수신 받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점.
        *      하나의 호출로 여러가지 동작을 수행할 수 있다는 측면에서 오버로딩도 다형성으로 보기도 한다.
        *   3. 확장성이 좋은 코드를 작성할 수 있다.
        *   4. 결합도를 낮춰 유지보수성을 증가시킬 수 있다.
        * */

        /* 목차. 1. 동물, 토끼, 호랑이 클래스 사용 */

        /* 목차. 2. 동물 인스턴스 생성 후 메소드 호출 확인 */
        System.out.println("===================동물 생성=================");
        동물 animal = new 동물();
        animal.먹기();
        animal.달리기();
        animal.울기();

        /* 목차. 3. 토끼 인스턴스 생성 후 메소드 호출 확인 */
        System.out.println("===================토끼 생성=================");
        토끼 rabbit = new 토끼();
        rabbit.먹기();
        rabbit.달리기();
        rabbit.울기();
        rabbit.점프();        // 토끼는 부모의 메소드 뿐 아니라 본인의 메소드도 가졌다.

        /* 목차. 4. 호랑이 인스턴스 생성 후 메소드 호출 확인 */
        System.out.println("=================호랑이 생성=================");
        호랑이 tiger = new 호랑이();
        tiger.먹기();
        tiger.달리기();
        tiger.울기();
        tiger.물어뜯기();

        /* 필기.
        *   토끼랑 호랑이는 동물 클래스를 상속 받았다.
        *   따라서 토끼는 토끼 타입이기도 하면서 동물 타입이다.
        *   호랑이도 마찬가지로 호랑이 타입이기도 하면서 동물 타입이다.
        * */

        /* 목차. 5. 부모 타입(동물) 으로 자식 인스턴스(호랑이, 토끼) 주소값 저장 */

        동물 a1 = new 토끼();       // 토끼는 동물이면서 토끼라 이게 가능. new 다음이 주소
        동물 a2 = new 호랑이();

        // IS-A 관계 토끼는 동물 / 동물은 토끼?
//        토끼 r1 = new 동물();
//        호랑이 t1 = new 동물();

        /* 목차. 6. 동적 바인딩 확인 */
        /* 필기.
        *   동적 바인딩
        *   컴파일(번역) 당시 해당 타입의 메소드와 연결 되어 있다가
        *   런타임(프로그램 실행) 딩시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩 바뀌어서 동작하는 것을 의미한다.
        *   */

        System.out.println("===============동적 바인딩 확인===========");
        a1.울기();        // 동물의 울음 말고 토끼의 울음이 동작한다.
        a2.울기();

        /* 필기. 하지만 현재 레퍼런스 변수 a1, a2 타입이 현재 동물이기 때문에
        *        토끼와 호랑이가 가지고 있는 고유한 기능은 동작시키지 못한다. */
//        a1.점프();            // 토끼, 호랑이의 고유한 기능은 동작x
//        a2.물어뜯기();

        /* 목차. 7. 타입 형변환 확인 */
        /* 필기.
        *   객체별 고유한 기능(점프, 물어뜯기)를 동작시키기 위해서는 형변환을 통해 토끼와 호랑이로 변경해야
        *   메소드 호출이 가능하다.
        *   class type casting : 클래스 형변환
        *  */

        System.out.println("============클래스 형변환 확인===========");
        ((토끼)a1).점프();      // 전체적으로 감싸고 . 을 붙여준다.
        ((호랑이)a2).물어뜯기();

//        ((호랑이)a1).물어뜯기();       // 토끼는 호랑이가 될 수 없다. 컴파일러 오류가 아니고, RuntimeException 번역은 문제가 없지만, 프로그램 동작 시 오류 발생

        /* 목차. 8. instanceof 연산자 사용 */
        /* 필기. 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는 지 비교하는 연산자. */
        System.out.println("==========instanceof 확인=======");
        System.out.println("a1이 호랑이 타입인 지 확인 : " + (a1 instanceof 호랑이));
        System.out.println("a1이 토끼 타입인 지 확인 : " + (a1 instanceof 토끼));
        System.out.println("a1이 동물 타입인 지 확인 : " + (a1 instanceof 동물));          // 위 아래 밑 이 바로 다형성! 여러가지 형태를 가지고 있다.
        System.out.println("a1이 Object 타입인 지 확인 : " + (a1 instanceof Object));

        /* 필기.
        *   instanceof 연산자를 이용해서 해당 타입이 맞는 경우에만 클래스 형변환을 적용.
        * */

        System.out.println("============================");
        if(a1 instanceof 토끼) {
            ((토끼) a1).점프();
        }

        if(a1 instanceof 호랑이) {
            ((호랑이)a1).물어뜯기();
        }

        /* 목차. 9. 클래스의 업캐스팅과 다운캐스팅 확인 */
        /* 필기.
        *   클래스 형변환은 up-casting 과 down-casting 으로 구분할 수 있다.
        *   up-castion : 상위 타입으로 형변환
        *   down-casting : 하위 타입으로 형변환
        *   작성 여부에 따라 명시적, 묵시적 두 가지로 구분된다.
        * */

        동물 a3 = (동물)new 토끼();       // up-casting 명시적 형변환
        동물 a4= new 토끼();             // up-casting 묵시적 형변환

//        토끼 r3 = a3;                  // 토끼는 int 동물은 double 로 생각하자. down-casting 묵시적 형변환은 안됨.
        토끼 r4 = (토끼)a3;               // down-casting 명시적 형변환

    }

}
