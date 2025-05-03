package backJoonTest;
/* 
A + B -3
문제 : 두 정수 A와 B를 입력받은 다음, A + B를 출력하는 프로그램을 작성하시오.
입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.( 0 < A, B < 10)
출력 : 각 테스트 케이스마다 A + B를 출력한다.
 */
import java.util.Scanner;
public class Bj21_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫 번째 줄에서 테스트 케이스 개수 T를 입력받음
		int T = sc.nextInt();
		
		// 테스트 케이스 수만큼 반복
		for(int i = 0; i < T; i++) {
			// 각 테스트 케이스마다 두 정수 A, B를 입력 받음
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			// 두 수 합 출력
			System.out.println(A + B);
		}
		
		// 자원 정리
		sc.close();
		
	}
}
