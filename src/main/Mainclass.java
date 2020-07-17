package main;

import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

import main.Add;

public class Mainclass {

	public static void main(String[] args) {
//		try {
//			int [] arr =new int[2];
//			arr[2]=1;
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("숫자 입력: ");
//			int a = sc.nextInt();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("오류 발생");
//		}
		//더하기
		Add aa = new Add();
		//빼기
		Sub ss = new Sub();
		//곱하기
		Mul dd = new Mul();
		//나누기
		Div ff = new Div();
		

		for(;;) {
		try {
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 0.종료");
			System.out.println("숫자 입력: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
		if (a == 1) {
			aa.addnum();
		}
		else if (a == 2) {
			ss.subnum();
		}
		else if (a == 3) {
			dd.mulnum();
		}
		else if (a == 4) {
			ff.divnum();
		}
		else if (a == 0) {
			System.exit(0);
			break;
		}
	} catch (Exception e) {
		System.out.println("잘못 입력");
	}
}
}
	//1=더하기 2=빼기 3=곱하기 4=나누기 0=종료
	//1-> 더하기 문제가 10문제 나오고
	//정답수,틀린수 출력하고 다시 위 메뉴 출력(그 외 연산 동일)
	//문자 입력되면 예외처리까지
	//메인 메소드 = 최소한의 코드만 for()
	//그 외는 전부 클래스에 메소드로

	


}
