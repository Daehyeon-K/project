package basic;

import java.util.Scanner;

import printtest.PrintTest;

public class Hello {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("Hello World!1");
		System.out.println("Hello World!2");
		System.out.println("Hello World!3");
		System.out.println("Hello World!4");

		System.out.println("Hello World!");


		System.out.println("conflicts 케이스 만들어봅시다.");


		System.out.println("어려워요");
		System.out.println("pull로 다운로드 push로 업로드 맞나요?");


		PrintTest print = new PrintTest();
		
		Scanner sc = new Scanner(System.in);
		print.printTest(sc.nextLine());
		


		System.out.println("#1시간만 버티면 #점심시간 #낮잠가능");

	}
}
