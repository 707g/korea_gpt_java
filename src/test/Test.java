package test;

// 1번 문제
/*
    - 기본 데이터 타입
        : 실질적인 데이터 저장
        byte, short, long, float, int, double, char, boolean

    - 참조 데이터 타입
        : 데이터가 저장된 주소값을 가짐
        String
*/



// 6번 문제
// : Object
// -> 자바의 모든 클래스는 암시적으로 Objcet 클래스를 상속받음
// -> Object 클래스가 가진 toString(), equlas() 등의 메서드를 기본적으로 가짐

// 7번 문제
// : size()
// -> 리스트에 저장된 요소의 개수를 반환

// 8번 문제
// : 삼항 연산자(? :)
// -> 조건식 ? 참일 때 값 : 거짓일 때 값
// -> int result = (a > b) ? a : b;

// 9번 문제
// -> 인터페이스 사용 O: 추상메서드, default 메서드, static(정적)메서드
// cf) private 메서드: 접근제어자가 생략된 메서드의 경우 기본으로 public abstract으로만 선언
//                      default와 static 메서드에서 private 접근제어자 사용이 가능
//                      단, private 메서드는 인터페이스 내부에서만 호출 가능
// : 4번

// 10번 문제
// : 2번
// -> 단, 하나의 추상 메서드만 허용 / default와 static 메서드에 대한 추가 정의가 불가!

// 11번 문제
// : Child
// -> Child 클래스에서 display() 메서드를 재정의했기 때문에 실행 시점에서 실제 객체의 메서드가 호출 (동적 바인딩)

// 12번 문제
// : 1번

// 13번 문제
// : 2.아니요

// 14번 문제
// : animal 참조 변수가 실제로 Dog 객체를 참조하고 있어야 한다.

// 15번 문제
// : 2번
// -> 필드가 많거나 생성자 매개변수가 복잡한 객체를 쉽게 생성하도록 도와줌

// 16번 문제
// : 3번

// 17번 문제
// : public
// -> 자바9부터 private 메서드를 인터페이스 내부에서 사용 가능

// 18번 문제
// : 4번
// -> 추상클래스는 static 메서드를 가질 수 있음 / 인터페이스도 static 메서드를 가질 수 있음

// 19번
// :



// 20번
// :



import java.util.Scanner;

class Student {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
}

public class Test {
    public static void main(String[] args) {
        // 2번 문제
        int num1 = 10;
        double num2 = 3.5;
        double result = num1 + num2;
        System.out.println(result);


        // 3번 문제
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("입력한 숫자는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자는 홀수입니다.");
        }

        scanner.close();


        // 4번 문제
        int[] numbers = {1, 2, 3, 4, 5};

        for(int num : numbers) {
            System.out.println(num);
        }


        // 5번 문제
        // : class Test 바로 위에 클래스를 작성하고 main 메서드 내부에서 객체를 생성하세요.
        Student[] students = {
                new Student("이승아", 85),
                new Student("이도경", 92),
                new Student("이지희", 78),
                new Student("이지훈", 88),
                new Student("김명진", 95)
        };

        // 2. 점수가 90점 이상인 학생의 이름 출력
        System.out.println("90점 이상인 학생:");
        for (Student student : students) {
            if (student.getScore() >= 90) {
                System.out.println(student.getName());
            }
        }
    }
}

