package main;

import java.util.Random;
import java.util.Scanner;

public class Mul {
	public void mulnum() {
		int clear = 0;
		int fails = 0;

		System.out.println("총 10문제");
		//i 값에 따라 다르게 입력
		for(int i=0; i<10; i++) {
			Random rnd = new Random();
			int a = (rnd.nextInt(80)+10);
			int b = (rnd.nextInt(80)+10);
			int c = a*b;
			
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println(a+"*"+b);
			System.out.println("정답?: ");
			int d = sc.nextInt();
			
			if(c == d) {
				System.out.println("정답");
				clear ++;	
			} else {
				System.out.println("오답");
				fails ++;	
				}
			}	
			catch (Exception e) {
			System.out.println("오류,숫자를 입력");
			}
		}
		System.out.println("맞은 횟수"+clear+"틀린 횟수"+fails);

	}
}
