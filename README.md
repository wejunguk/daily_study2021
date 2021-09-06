# daily_study2021

# 2021_07_08
  - eomcs-java : 모든 프로젝트가 다 있음
  - ../lang : 자바 언어에 대한 것들이 담겨있음
  - ../basic : 자바 calss사용법 설명
  - ../oop:객체지향 문법 설명 
   -../io,net : 그 외 해당되는 것 들
  - java-basic(단일 프로젝트 구조) : 실습 프로젝트
  - ../lang/ex02 : 주석
  - ex03:리터널
  - ex04:변수일부 0510~0560:배열
  - ex06 : 310,410 while,if 반복문 (리터널,변수,if,while반복문)

  -

# 2021_07_12 (이클립스 디버거 사용)
  - 토글 브레이크포인트 -> 원하는 소스코드 라인 왼쪽을 더블클릭하면 브레이크포인트를 설정할수 있음
    -> 디버그 모드 실행 -> 스텝오버 버튼으로 실행 순서를 하나씩 확인할 수 있음
    * resume : 다음 브레이크 포인트를 만날때까지 진행
    * step over(f6) : 다음 라인으로 이동
    * step into(f5) : 그 메서드 안으로 들어가고 싶다

# 2021_07_14
  - 자바 파일을 실행하면 JVM이 램으로부터 128MB의 메모리를 할당받고 세 공간으로 나누어 사용한다.
    1) Method Area
      이 공간은 .class의 모든 소스코드를 두는 곳
    2) JVM Stack
      메소드를 호출 할때 각 매소드별로 프레임을 임시 생성
      프레임안에는 그 메소드의 로컬변수를 둔다. 메소드가 끝나면 프레임은 사라진다.
      (로컬변수안엔 파라미터(매개변수) 포함)
    3) Heap
      new 명령으로 생성하는 변수를 둔다
      예)Scanner scan = new Scanner(System.in) 같은 경유 scan이라는 인스턴스 변수를 둔다.

  - 메인이 돌면서 그안에 swap을 호출하는것이 있으니 메인호출하고 사라지지 않은 상태에서 swap 호출하고 swap사라지고
    main 사라지고 JVM Stack에서 프레임으로, 메인메소드가 끝나면 실행이 끝났다 = jvm이 종료됐다

# 2021_07_19
  - 05-b : 코드는 그대로 두고 값만 따로 관리하면 되지 않을까?

# 2021_07_21
  - new 변수가 없으면(=인스턴스 변수가 없으면) Heap에 아무것도 안 만들어지나?
    -> 아니다. 인스턴스의 기본정보(=부가정보->클래스 이름이나 주소값 등 ..)를 저장할 변수가 추가된다.
  
  - Methed Area
    - 클래스 코드
    - static 변수
    - 상수
  - JVM steck
    - local 변수
  - Heap
    - 인스턴스 변수
    - 메소드코드X (절대절대 여기 없음!!!)

  - new BoardHandler() - > BoardHandler가 작업할 동안 사용할 변수 준비!(=BoardHanler의 인스턴스 생성)
  - new Board() -> Board에 사용할 변수 준비
    * 메서드가 있고 메서드가 사용하려면 인스턴스로 넘겨라
  - equalsIngnoreCase -> 대소문자구별없이 진행함

# 2021_07_23 (보충필요)
  - this.boards[--this.size] = null; 
    -> 값을 null로 초기화해주는 이유 -> 값을 삭제시 앞으로 하나씩 밀려오는데........
  - int boardIndex = indexOf(no); 
    -> int 데이터 타입인 boardIndex 변수에 indexOf(no) 만든 걸 넣겠다.

# 2021_07_26 (06-b->07-a)
  - App파일이 BoardHandler를 사용할 때 (non-static 메서드)
    - new로 인스턴스를 생성
    - 인스턴스 주소값을 저장하는 boardHandler를 불러서 메서드 호출
  - BoardHandler파일이 Prompt를 사용할 때 (static 메서드)
    - 클래스명으로 바로 가지고 와서 메서드 호출
    => 결론 : 인스턴스를 가지고 메서드를 호출하든, 클래스를 가지고 메서드를 호출하든, 둘 다 의존객체이다.

## 2021_07_29 (#오버로딩 #상속 #오버라이딩)
  - 클래스
    1) 새 데이터타입 정의(데이터)
	  2) 기능 묶음(업무) *기능 function=method   ex) 프로젝트핸들러
  - Specialization
    수퍼클래스를 상속받아 좀 더 특별한 역활을 하고 서브클래스를 만드는 것!
  - printSedan(Sedan car) {
    }
    -> 파라미터 : Sedan -> 파라미터에 Sdan 선언, Sdan 및 Sdan의 자식 클래스의 인스터스 값도 넘어간다!(다형적 변수)

## 2021_08_05
  - 캡슐화  = 복잡한 코드를 분리하여 메서드에 감춘다.
  - 역활을 쪼갠다 = High Cohesion
  - 교체가 쉽다
  - 공통적인 부분을 추출 -> 슈퍼클래스, 슈퍼클래스 .....최상위 클래스(object)로 정의 


## 2021_08_09
  - final 앞에 붙어있음 오버라이딩(재정의) 못함
    추상메서드 : 너가 코딩해서 써라~
  - 추상메서드에서 메서드가 호출됐다...?
    추상메서드에 상속받은 일반메서드가 분명히 있다는 뜻
    추상메서드를 호출했다? 일반메서드의 인스턴스를 호출한거니, 일반메서드 확인
  - 클래스가 같은 부모의 자식 -> 같은 메서드를 가짐 = 사용법이 같다
  - 추상클래스 선언은 언제 ? 직접 사용할 수 없는 경우에 사용

  - 해시 알고리즘
    해시 : 해시 값을 생성하는 식
    해시 값 -> 정수값이 클수록 해시 값이 중복될 가능성이 낮아진다
            -> 계산 시간은 증가 
  - 해시값을 가지고 파일을 비교하는 이유? -> 파일명이 원본과 저장한 파일명과 다를 수 있기 때문에

## 2021_08_12 (oop_ex09_d 시작)
  - [oop_ex09_e]
    인터페이스에 메소드를 추가하면 모든 하위 글에 영향을 끼침
    이럴 경우 해결 방안은 ? -> 상속을 이용.
      defalut 메소드를 이용해보자. 기존 클래스에 영향을 주지 않는다.
      defalut의 단점도 존재 -> 해당 메소드를 가지고 있지 않아도 컴파일 오류가 나타나지 않는다
  - 규칙을 다루는 static 메소드가 필요한 경우!!!!!인스턴스에 스태틱 메소드 만들 수 있다.
  - adapter 디자인 패턴 : 기존 패턴을 새 규칙에 맞춰서 재 설계하는 패턴

  * 인터페이스/추상클래스/어댑터패턴 => 끊임없이 나옴, 복습!!

## 2021_08_17
  - 인스턴스 멤버를 호출하려면 반드시 해당 클래스의 인스턴스 주소가 필요
  - 클래스 블록과 중첩클래스
  - 객체지향
    객체와 객체와의 관계를 읽혀라! 코드는 가지고 와도 된다
  - 컴파일이 끝나면 class파일로 추출되어 이미 끝난 상태 ($1 -> 첫번째 로컬클래스를 의미)
  - 메서드가 호출될때마다 클래스가 로딩된다 ? -> 절대 아님
    클래스 파일은 한번만 로딩된다!!!!!! => 클래스 파일 하나당 하나의 클래스가 로딩된다.

## 2021_08_18 (프로젝트 첫 발표, 프로젝트 방법론)
  - 방법론(methodology)
    어떤 사항에 대해 이론이나 경험적 사실을 정리하고 표준화한 것
    * 표준화 : 사람이나 조직에 상관없이 경험의 많고 적음에 상관없이
              일관된 수준의 결과무를 산출

  - 소프트웨어 개발 방법론
    소프트웨어(=결과물 ex)앱,서비스)를 생산 -> 프로그래밍 개발 과정을 정리
    ->개발과정을 표준화 -> 개인이나 조직에 상관없이
    일관성 있는 개발을 유지하고 협업을 수행할 수 있게 돕는 것
    * 교육 과정 프로젝트 수행에서 사용할 방법은?
      애자일 방법론 변형, 최소 산춘물, 프로그래밍에 초점 : 프로그래밍 경험을 높이자

  - 예)
      1. 폭포수 모델 
      2. 프로토타이핑
      3. 반복적, 점진적 개발
      4. 애자일 방법론

  - 교육과정 프로젝트 수행 절차
    1) 주제 선정 - 프로젝트 소개(현황 및 문제점, 해결방안 및 이점), UI 프로토타입
    2) 요구사항 식별 - 유스케이스 명세(액터,유스케이스 목록)
    3) DB모델링 - ER다이어그램, DDL SQL
    4) 구현할 기능 선정
    5) 구현 및 테스트 (4, 5번 반복 - 소스파일)
    6) 발표 - 발표자료

  * 요구사항 식별 방법론
    1. 액터 식별
      액터란? 시스템을 사용하는 사람 또는 프로세스(소프트웨어), 장치(하드웨어)
      주 액터: 시스템을 사용하는 액터
        보조 액터 : 시스템이 사용하는 다른 시스템

## 2021_08_19 (10-h -> 10-i, 10-i -> 11-a) ** 10 - i 에서 11-a 바꾸는 부분 **
  - Use-case 관계 : 포함과 확장
    1) 포함관계(include) - 메인 기능을 수행할때, 서브기능을 하고! 다시 메인기능을 수행
    2) 확장관계(extend) - 메인 기능을 수행할때, 메인기능을 멈추지 않아도 서브기능 수행

  - [10-i 추상클래스 적용]
    public abstarct claa
    AbstractList 추가부분 수정

  - ArrayList 에 remove 영역 연습

  ## 2021_08_20 ()
    - 알고리즘_date_structure 패키지 예제를 학습

  ## 2021_08_23 (제네릭 / java_basic_generic_ex01~ex02 / basic_ex03 / **oop_ex12_110~160(람다문법)** 로컬클래스를 지역클래스로 바꾸고 람다문법적용)
    - 형변환은 정확한 타입을 알고 해야함
    - 파라미터 값을 직접 생성하기 애매할때 간접설정
    - JVM 처리만 해줄 뿐..형변환을 해주지 않음

    - 제네릭의 타입을 적용할 경우 다형성을 생각하면 안된다.
    - 타입이 <?> 일땐, 어떤 코드는 OK/ 어떤 코드는 컴파일 오류가 된다.

  ## 2021_08_24 (로컬클래스-> 익명클래스로 바꾸기 -> 람다법칙)
    - oop_ex12_Exam0510~540 아주 중요한 코드
    - bsic_ex03_210~244번까지**

## 2021_08_25 
  - 인터페이스의 유용성을 다시 생각해보기(basic_ex04_0110)
    - 각자 다른 코드명으로 개발 -> ArrayList를 LinkedList로 교체하기가 쉽지 않다
      => 같은 역활을 하는 코드명이 달라서 변경하려면 코드를 많이 변경해야 한다.
    - 인터페이스를 사용하면?
       사용법이 같기 때문에 프로그래밍에 일관성을 부여 -> 유지보수가 쉬움
  - Stack - pop() : 제거
            peek() : 가지고 옴

## 2021_08_19
  - Use-case 관계 : 포함과 확장
    1) 포함관계(include) - 메인 기능을 수행할때, 서브기능을 하고! 다시 메인기능을 수행
    2) 확장관계(extend) - 메인 기능을 수행할때, 메인기능을 멈추지 않아도 서브기능 수행
  - ArrayList 에 remove 영역 연습
  - 스택을 언제 사용하는지, Q를 언제 사용하는지? *면접질문
    스택은 BreadCrumb을 구현할때 적합하다
    먼저 등록한걸 먼저 처리 - 예약처리- Q

## 2021_08_27 (git)
  - 메모리 부족 = 메모리 릭
  - 드림코딩 by 엘리 -> 깃,깃허브 제대로 배우기 동영상
  - 예외처리 try _ catch

## 2021_09_02 (Command 문법,HashMap 객체 이용)
  - Command 인터페이스를 생성 후 객체를 인터페이스에 연결해 간결히 정리한다.
  - MenuItem 생성 -> [inner 클래스 개념 복습 필요] 

## 2021_09_03
   - 비트연산자
   - 프로젝트 : 회원가입, 아이디찾기, 비밀번호찾기, 함께해요 게시판 구현 후 관리자페이지로 연동함
   - 비대면으로 프로젝트 발표를 했는데, 목소리가 너무 작게 들렸다고 해서 너무 아쉽다. 하지만 기회는 또 있지!

## 2021_09_06
     - 문의하기 : 본인이 쓴 글만 읽기 가능 -> 권한설정으로 처리 완료
                  로그인을 하지 않으면 글을 작성할 수 없다.
