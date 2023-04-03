package _0403;

import java.util.Scanner;

public class _01_ {
public static void main(String[] args) {
	

//	
//	--------------------변수--------------------
//	1. 두 개의 정수 a = 10; b = 3;으로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.(나눗셈의 결과는 double형으로 나머지는 int형으로 출력)

	
	int a = 10;
	int b = 3;
	System.out.println("덧셈 : " + (a + b));
	System.out.println("뺄셈 : " + (a - b));
	System.out.println("곱셈 : " + a * b);
	System.out.println("나눗셈 : " + (double)a/b);
	System.out.println("나머지 : " + a%b);
	
//	2. 두 개의 실수 num1 = 10.01; num2 = 12.25;로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.(네 연산 모두 double형 출력)

//	double num1 = 10.01;
//	double num2 = 12.25;
//	System.out.println("덧셈 : " + (num1 + num2));
//	System.out.println("뺼셈 : " + (num1 - num2));
//	System.out.println("곱셈 : " + (num1 * num2));
//	System.out.println("나눗셈 : " + (num1 / num2));
	
//	3. 사용자가 입력한 알파벳을 소문자는 대문자로 대문자는 소문자로 변경해서 출력하세요.

//	Scanner sc = new Scanner(System.in);
//	System.out.println("문자 입력하세요");
////	65 122
//	String input = sc.nextLine();
//	String alp = "";
//	String B = "";
//	
//	for(int i = 0; i < input.length(); i++) {
//		char a = input.charAt(i);
//		if(a >= 65 && a <= 93) {
//			alp = input.toUpperCase();
//			
//		} else if (a >= 97 && a <= 122) {
//			alp = input.toLowerCase();
//			
//	}
//		B = String.valueOf(alp);
//	}
		
//	System.out.println(alp.charAt(i));
		
	
//	System.out.println(B);
	
//	--------------------형변환--------------------
//	1. 사용자가 입력한 수(실수나 정수 모두 가능)를 StringBuilder로 받아서 점(.)이 포함되면 double형으로 포함되지 않으면 int형으로 변경 후 출력하세요.

//	Scanner sc = new Scanner(System.in);
//	StringBuilder sb = new StringBuilder(sc.nextLine());
	
	
//	String a = String.valueOf(sb);
	
	
	
//	double d = Double.parseDouble(a);
	
//	if(a.contains(".")) {
//		System.out.println("더블형변환" + (d + 1.0));
//	} else {
		
//		int b = Integer.parseInt(a);
//		System.out.println(b + 1);
		
		
//	}
	
	
	
	
	

//	--------------------연산자--------------------
//	1. public static void main(String[] args) {
//	    	for(int i = 1; i <= 10; i++) {
//			if() {
//				// 3, 6 ,9
//			} else if() {
//				// 1, 4, 7, 10
//			} else if() {
//				// 2, 5, 8
//			}
//		}
//	   }
//	   위 코드처럼 1 ~ 10까지의 숫자를 3가지 조건으로 나눌 때 가장 적합한 조건으로 채워주세요.
//
//	2. 중첩 삼항 연산자를 이용해서 1 ~ 20까지의 숫자중 소수를 판별하여 소수면 "xx는 소수입니다."라고 출력하고 소수가 아니면 4의 배수인지 판별하여
//	     "xx는 4의 배수입니다."라고 출력하고 4의 배수가 아니면 "xx는 4의 배수가 아닙니다."라고 출력하세요.
//
//	--------------------조건문--------------------
//	1. 사용자가 입력한 문자열의 길이가 20이상이면 해당 문자열을 거꾸로 출력하고 
//	     20미만이면 문자열에 n, a, v, e, r 다섯개의 문자를 순서대로 추가하여
//	     문자열의 길이가 20이 되면 그 때 문자열을 출력하세요.
//
//	--------------------반복문--------------------
//	1. 1~20까지 랜덤한 값을 생성해서 생성한 랜덤 값만큼 반복되는 반복문을 만들고
//	    반복문에서 사용자가 입력한 문자열에 "bit"를 계속 추가하세요. 그리고 bit가 몇 번
//	    추가됐는지 개수를 세서 출력하세요. 랜던 값을 그대로 출력하면 안됩니다.
//
//	2. 사용자가 입력한 정수의 약수들의 총합을 출력하세요.
//
//	--------------------배열--------------------
//	1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
//	   단어를 bit, com, sql, int로 만들어서 모두 출력하세요.(힌트 bit => [0], [4], [8]에 있습니다.)

//	char[] ch = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};
	
//	StringBuilder sb = new StringBuilder();
	
	
	
//	--------------------클래스--------------------
//	1. IfCla 라는 클래스를 정의하고 멤버변수로는 ElseCla라는 클래스 타입의 변수를 가지고 있게 구현하고
//	     makeIf(int num)를 만들어서 사용자가 입력한 정수(1 ~ 10)를 매개변수로 받아서 1과 같은지 비교해서 같으면 "정답입니다."를 출력하는 메소드를 구현하고
//	     그 안에서 ElseCla에 존재하는 makeElse(int num) 메소드를 호출하여 1이 아닐때는 "오답입니다"라고 출력하세요.
//
//	--------------------상속--------------------
//	1. 위에서 선언한 IfCla와 ElseCla를 상속받는 ElseIfCla 클래스를 선언하고 makeIf(int num)을 오버라이드하여 사용자가 입력한 숫자가 5보다 큰지 비교하여 
//	     5보다 크면 "5보다 큽니다."를 출력하고 makeElseIf(int num)이라는 메소드를 새로 만들어서 사용자가 입력한 숫자가 5와 같은지 비교하여 같으면 "5입니다."를 출력하고
//	     makeElse(int num)을 오버라이드 하여 "5보다 작습니다."를 출력하세요.
//
//	--------------------컬렉션--------------------
//	1. 음식 이름을 키로 가지고 단품 가격을 값으로 가지는 foodPriceMap과 음식 이름을 키로 가지고 주문수량을 값으로 가지는 foodOrderMap을 선언하세요.
//	   음식과 가격은 비빔밥 : 6000, 칼국수 : 9000, 투뿔등심 : 70000이고 주문수량은 비빔밥 : 5, 칼국수 : 2, 투뿔등심 : 1 일 때 총가격을 계산해서 출력하세요.
//	   (Map을 이용해서 계산)
}
}