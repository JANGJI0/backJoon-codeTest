package backJoonTest;
/*
 * A+B-5
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력 : 입력은 여러개의 테스트 케이스로 이루어져있다
 * 		 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.(0 <A, B<10)
 * 		 입력의 마지막에는 0 두 개가 들어온다.
 * 출력 : 각 케이스마다 A+B를 출력한다.
 */
import java.util.Scanner;
public class Bj30_10952 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		// 무한 반복문 시작
		while(true) {
		// A B 입력
		int A = sc.nextInt(); // 첫 번째 정수 입력
		int B = sc.nextInt(); // 두 번째 정수 입력
		
		// 종료 조건: A와 B가 모두 0이면 반복문 종료
		if(A == 0 && B == 0) {
			break;
		}
			// A + B 결과 출력
			System.out.println(A + B);
			
		}
		// 자원정리
		sc.close();
		
		
	}

}
