## Object-Oriented Programming, 객체 지향 프로그래밍

### 0. Abstract
> 위키피디아에 따르면, 객체 지향 프로그래밍이란, 컴퓨터 프로그램을 명령어의 목록에서 보는 시각에서 벗어나 **여러개의 독립된 객체들의 모임**으로 파악하는 것을 의미한다. 각각의 객체는 Message를 주고 받으며, Data를 처리할 수 있다.

**객체 지향 프로그래밍이란,** 기존 프로그래밍의 패러다임을 C언어와 같이 명령어의 절차에 따라 처리하는 것이 아닌, 기능별로 혹은 역할별로 하나의 객체로 생성하여 처리하는 방식을 말한다.  
대체적으로 많은 형태의 프로그래밍 언어 혹은 프레임워크들에서 이러한 객체 지향 프로그래밍을 지향하고 있다.  

#### 1. Terminology
- **Class(클래스)** : 하나의 객체를 구현하기 위한 단위
- **Method(메소드)** : 클래스 내부에 구현되 함수
- **Instance(인스턴스)** : 클래스에 따른 객체를 생성하는 것
- **Object(객체)** : 클래스의 인스턴스
<p align="center">
    <img src="https://github.com/IIIBreakeRIII/OOP-Concept/assets/89850286/cbe6e39f-4402-4ab3-919c-1703a68872da">
    <br>
    <a href="https://www.techtarget.com/searchapparchitecture/definition/object-oriented-programming-OOP">Image From TechTarget
</p>

### 2. 4 Features of OOP : Abstraction, Encapsulation, Inheritance, Polymorphism
객체지향에는 크게 4가지의 특징이 있다. *추상화, 캡슐화, 상속, 다형성* 이 4가지의 특징인데 각각의 특징들은 그 자체로 매우 중요한 역할을 지닌다.

#### 2.1. Abstraction, 추상화
**추상화**란, 객체들의 공통적인 특징(함수, 기능, 속성 등)을 추출해서 정의하는 것을 의미한다. 객체 지향의 관점에서 `Class`를 정의하는 것과 같다.
[`About_Abstract > src > Vehicle.java`](https://github.com/IIIBreakeRIII/OOP-Concept/blob/main/About_Abstract/src/Vehicle.java)를 보면 `start()`, `moveForward()`, `moveBackward()`라는 메소드가 있다.  
해당 메소드들은 `Car`클래스와 `MotorBike`클래스에서 모두 사용되는 메소드로, 이러한 공통적인 특징을 추출하여 `Vehicle`클래스에 정의한 것이다.  
이런 형태로 분리하는 것을 객체 지향 프로그래밍에서는 **역할과 구현의 분리**라고 한다.

- 참고
    - `interface` : 추상화를 구현하기 위한 추상 자료형
    - `extends` : 부모에서 선언 및 정의를 하며 자식은 메소드 및 변수를 그대로 사용
    - `implements` : 부모 객체는 선언만 하며, 정의는 자식에서 Overriding
    - `abstract` : extends와 interface의 혼합

#### 2.2. Encapsulation, 캡슐화
**캡슐화**란, 관련이 있는 변수 및 함수를 하나로 묶고, 쉽게 접근하지 못하도록 은닉하는 것을 의미한다. 객체 내부의 세부적인 동작에 대한 구현을 감추기 위해서 하며, **높은 응집도, 낮은 결합도**를 추구한다.  
캡슐화에서 중요한 개념은 접근 제어자이다. `public`, `protected`, `default`, `private`가 있으며, 이러한 접근 제어자를 통해 외부에서 객체 내부에 접근을 제어할 수 있다.  
각 접근 제어자의 내용은 아래의 표와 같다.  
|접근 제어자|클래스 내부|패키지 내부|다른 패키지의 하위 클래스|패키지 외부|설명|
|:---:|:---:|:---:|:---:|:---:|:---:|
|`private`|O|X|X|X|동일 클래스 내에서만 접근|
|`default`|O|O|X|X|동일 패키지 내에서만 접근|
|`protected`|O|O|O|X|동일 패키지 내에서, 혹은 다른 패키지의 하위 클래스에서만 접근|
|`public`|O|O|O|O|제한 없음|

[`About_Encapsulation > src > package1 > SuperClass.java`](https://github.com/IIIBreakeRIII/OOP-Concept/blob/main/About_Encapsulation/src/package1/SuperClass.java)를 보면, `SuperClass`에서 선언된 변수 `a, b, c, d`는 각기 다른 접근 제어자를 가진다.  
그리고, `private`접근 제어자를 갖는 `a`는 같은 클래스 내에서 호출되기에 정상적으로 `print`함수가 동작하지만, `main`클래스는 같은 위치가 아니기에 `print`함수가 동작하지 않는다.  
반면, [`About_Encapsulation > src > package2 > Test2.java`](https://github.com/IIIBreakeRIII/OOP-Concept/blob/main/About_Encapsulation/src/package2/Test2.java)를 보면, `SuperClass`를 상속받은 `SubClass`에서 `protected`접근 제어자를 갖는 `c`는 `print`함수가 동작한다. `protected`접근 제어자의 특징은, 다른 패키지이지만 상속 관계에 있기 때문에 하위 클래스에서 접근이 가능하기 때문이다.  
하지만, `Test2`클래스에서는 `public`접근 제어자를 갖는 `d`만 정상적으로 `print`함수가 동작하고, 나머지는 동작하지 않게 된다.  
- 참고
    - `getter`와 `setter`메소드 : 한 객체의 데이터는 외부에서 직접적으로 접근하지 못하도록 막음. 따라서 이를 메소드를 통해 데이터를 접근하게 하는데, 이때 사용되는 것이 `getter`와 `setter`메소드
        - `getter` : 외부에서 객체의 데이터를 읽을 때 사용
        - `setter` : 외부에서 메소드를 통해 데이터에 접근할 때 사용

#### 2.3. Inheritance, 상속
**상속**이란, 추상화의 연장선으로 상위 클래스의 모든 속성 및 연산을 하위 클래스가 물려받는 것을 의미한다. 객체 지향 프로그래밍에는 다음과 같은 두가지의 개념이 있다.
- **IS - A 관계** : 상위 클래스 - 하위 클래스의 **연결 관계**
    - 예시 : 사람은 동물이다 / 개는 동물이다 / 고양이는 동물이다
- **HAS - A 관계** : 한 객체가 다른 객체에 포함되는 관계 즉, **구성 관계**
    - 예시 : `Computer`클래스에는 `CPU`클래스, `RAM`클래스, `Storage`클래스가 포함되어 있다.

이러한 객체 지향 프로그래밍의 개념에서 상속은 `IS-A`관계에서 이루어져야 한다. 상속은 클래스간의 결합도를 높이기에 상위 클래스를 수정하게 되면 자동적으로 하위 클래스에도 영향을 끼치게 된다.  
[`About_Inheritance > src > Vehicle.java`](https://github.com/IIIBreakeRIII/OOP-Concept/blob/main/About_Inheritance/src/Vehicle.java)를 보면, `Vehicle`클래스는 `model`, `color`, `wheels`라는 변수를 갖고 있으며, `moveForward()`, `moveBackward()`라는 메소드를 갖는다.  
그리고 이러한 `Vehicle`클래스를 상속받는 `MotorBike`클래스는 `isRaceble`이라는 변수가 추가되며, 기존 부모 클래스의 `moveForward`와 `moveBackward`라는 메소드를 **Overriding**하여 재정의한다.  
때문에, `main`클래스에서는 최종적으로 `MotorBike`클래스에서 재정의한 `moveForward`와 `moveBackward`가 호출되는 것을 확인할 수 있다.
- 참고
    - `Override` : 부모 클래스에서 정의된 메소드를 자식 클래스에서 재정의하는 것
    - `Overload` : 같은 이름의 메소드를 여러개 정의하는 것
    - `super` : 부모 클래스의 생성자를 호출하는 것

#### 2.4. Polymorphism, 다형성
**다형성**이란, 하나의 변수와 상수가 서로 다른 방식으로 동작하는 것을 의미한다. 동일한 명령을 각자 연결된 객체 의존해서 해석하는 것을 의미하는데, 이 때 등장하는 개념이 **`Method Overriding`**, **`Method Overloading`** 이다.  
- **Method Overriding** : 상위 클래스에서 정의된 메소드를 하위 클래스에서 재정의하는 것
- **Method Overloading** : 같은 이름의 메소드를 여러개 정의하는 것

[`About_Polymorphism > src > Vehicle.java`](https://github.com/IIIBreakeRIII/OOP-Concept/blob/main/About_Polymorphism/src/Vehicle.java)를 보면, `Vehicle`클래스에서 `moveForward`와 `moveBackward`라는 메소드를 정의하였다. 그리고 이러한 `Vehicle`클래스를 상속받는 `MotorBike`클래스에서는 `moveForward`와 `moveBackward`라는 메소드를 **Overriding**하여 재정의하였다.  
이렇게 오버라이딩 한 메소드는 최종적으로 `main`클래스에 호출될 때, 재정의된 메소드가 호출된다.

### 3. Reference
- [TechTarget](https://www.techtarget.com/searchapparchitecture/definition/object-oriented-programming-OOP)
- [WikiPedia](https://ko.wikipedia.org/wiki/%EA%B0%9D%EC%B2%B4_%EC%A7%80%ED%96%A5_%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D)
- [코드 스테이츠 : 객체 지향 프로그래밍의 4가지 특징 | 추상화, 상속, 다형성, 캡슐화](https://www.codestates.com/blog/content/%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%ED%8A%B9%EC%A7%95)
- [장장스 : [Java] IS-A 관계, HAS-A 관계](https://zangzangs.tistory.com/44)
