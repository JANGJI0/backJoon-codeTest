package backJoonTest;
import java.util.Scanner; // java packge 의 util 디렉토리 안에 있는 Scanner 클래스를 import 해서 사용
public class Bj03_10998 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체명 = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * b);; // nextInt() 가 입력을 기다리고 있는 상태, 실행하고 콘솔창에 숫자를 입력을 해야 값이 나온다.
		
		
	}

}
