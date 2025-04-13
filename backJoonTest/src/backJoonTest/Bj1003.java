package backJoonTest;
import java.util.Scanner; // java package 의 util 디렉토리 안에 있는 Scanner 클래스를 import 해서 사용
public class Bj1003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in 이란 사용자로부터 키 입력을 받기 위해 사용
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		System.out.print(a / b);
		
		// 소수를 나타내기위해 double로 선언

	}

}
