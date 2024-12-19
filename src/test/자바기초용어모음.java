package test;

public class 자바기초용어모음 {
    // 접근 제한자
    /*
        public: 모든 클래스에서 접근 가능
        protected: 같은 패키지, 상속 관계에 있는 클래스에서 접근 가능
        default: 같은 패키지에서 접근 가능
        private: 클래스 내부에서만 접근 가능
    */



    // static
    /*
        static 변수: 클래스
        - static 변수: 클래스의 모든 인스턴스에서 공유되는 데이터 변수
        - static 메서드: 인스턴스 변수와 관계없이 호출 가능
    */



    // final
    /*
        final 메서드: 자식클래스에서 오버라이드 할 수 없는 메서드

        final 클래스: 더 이상 상속될 수 없는 클래스
    */



    // super VS this
    /*
        super: 상속받은 부모를 가리키는 참조 변수
        this: 객체 자신을 참조하는 변수
    */



    // 오버로딩 VS 오버라이딩
    /*
        오버로딩: 같은 클래스 내에서 메서드를 여러 개 정의
                  개수가 다르거나 타입이 달라야 한다
        오버라이딩: 부모 클래스에서 상속받은 자식 클래스에서 메서드를 재정의
    */



    // abstract
    /*
        추상화
        완전하지않은 클래스, 다른 클래스가 상속받아서 사용
    */



    // interface VS abstract class
    /*
        interface
        : 모든 메서드는 추상메서드로 구성

        abstract class
        : 완전하지않은 클래스, 다른 클래스가 상속받아 사용

    */




    // extends VS implements
    /*
        extends: 상속(클래스 간, 인터페이스 간)
        implements: 구현(인터페이스를 클래스로 구현)

    */



    // try-catch-finally
    /*
        try {
            예외가 발생할 수 있는 코드
        } catch (ExceptionType e1) {
            예외 발생 시 실행할 코드
        } catch (ExceptionType e2) {
            예외 발생 시 실행할 코드
        }finally {
            예외 발생과 상관없이 항상 실행되는 코드
        }
    */




}
